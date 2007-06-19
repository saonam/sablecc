/* This file is part of SableCC (http://sablecc.org/).
 * 
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.alphabet;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.sablecc.sablecc.exception.InternalException;

/*
 * An alphabet is a collection of symbols. Two symbols of an alphabet may not
 * represent overlapping intervals.
 */

public class Alphabet<T extends Comparable<? super T>>
        implements Comparable<Alphabet<T>> {

    private SortedSet<Symbol<T>> symbols;

    private SortedMap<Interval<T>, Symbol<T>> intervalMap;

    private Integer hashCode;

    private String toString;

    public Alphabet(
            Collection<Symbol<T>> symbols) {

        if (symbols == null) {
            throw new InternalException("symbols may not be null");
        }

        init(symbols);
    }

    public Alphabet(
            Symbol<T> symbol) {

        if (symbol == null) {
            throw new InternalException("symbol may not be null");
        }

        Collection<Symbol<T>> symbols = new LinkedList<Symbol<T>>();
        symbols.add(symbol);

        init(symbols);
    }

    public Alphabet(
            Interval<T> interval) {

        if (interval == null) {
            throw new InternalException("interval may not be null");
        }

        Collection<Symbol<T>> symbols = new LinkedList<Symbol<T>>();
        symbols.add(new Symbol<T>(interval));

        init(symbols);
    }

    public Alphabet() {

        init(new LinkedList<Symbol<T>>());
    }

    private void init(
            Collection<Symbol<T>> symbols) {

        this.symbols = Collections
                .unmodifiableSortedSet(new TreeSet<Symbol<T>>(symbols));

        // compute interval map
        TreeMap<Interval<T>, Symbol<T>> intervalMap = new TreeMap<Interval<T>, Symbol<T>>();

        for (Symbol<T> symbol : symbols) {
            if (symbol == null) {
                throw new InternalException("symbol may not be null");
            }

            for (Interval<T> interval : symbol.getIntervals()) {
                if (intervalMap.put(interval, symbol) != null) {
                    throw new InternalException(
                            "distinct symbols may not have overlapping intervals");
                }
            }
        }

        this.intervalMap = Collections.unmodifiableSortedMap(intervalMap);

        // check for overlapping intervals
        Interval<T> previous = null;
        for (Interval<T> current : this.intervalMap.keySet()) {
            if (previous != null && previous.intersects(current)) {
                throw new InternalException(
                        "distinct symbols may not have overlapping intervals");
            }

            previous = current;
        }
    }

    public SortedSet<Symbol<T>> getSymbols() {

        return this.symbols;
    }

    public SortedMap<Interval<T>, Symbol<T>> getIntervalMap() {

        return this.intervalMap;
    }

    @Override
    public boolean equals(
            Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Alphabet)) {
            return false;
        }

        Alphabet alphabet = (Alphabet) obj;

        if (this.symbols.size() != alphabet.symbols.size()) {
            return false;
        }

        Iterator i = alphabet.symbols.iterator();
        for (Symbol<T> symbol : this.symbols) {
            if (!symbol.equals(i.next())) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {

        if (this.hashCode == null) {
            int hashCode = 0;

            for (Symbol<T> symbol : this.symbols) {
                hashCode *= 13;
                hashCode += symbol.hashCode();
            }

            this.hashCode = hashCode;
        }

        return this.hashCode;
    }

    @Override
    public String toString() {

        if (this.toString == null) {
            StringBuilder sb = new StringBuilder();

            sb.append("Alphabet:{ ");

            boolean first = true;
            for (Symbol<T> symbol : this.symbols) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }

                sb.append(symbol);
            }

            sb.append(" }");

            this.toString = sb.toString();
        }

        return this.toString;
    }

    public int compareTo(
            Alphabet<T> alphabet) {

        int result = 0;
        Iterator<Symbol<T>> i1 = this.symbols.iterator();
        Iterator<Symbol<T>> i2 = alphabet.symbols.iterator();

        while (result == 0 && i1.hasNext() && i2.hasNext()) {
            Symbol<T> symbol1 = i1.next();
            Symbol<T> symbol2 = i2.next();

            result = symbol1.compareTo(symbol2);

            if (result != 0) {
                break;
            }
        }

        if (result == 0 && (i1.hasNext() || i2.hasNext())) {
            result = this.symbols.size() - alphabet.symbols.size();
        }

        return result;
    }

    public AlphabetMergeResult<T> merge(
            Alphabet<T> alphabet) {

        if (alphabet == null) {
            throw new InternalException("alphabet may not be null");
        }

        /*
         * In theoretical terms, an alphabet is a set of symbols.
         * 
         * Merging two alphabets A and B consists of creating a new alphabet C
         * containing a minimal number of symbols, with the following property:
         * 
         * For every symbol X element of (A union B), there exists a
         * corresponding subset S of C, such that: merge(S) == X.
         * 
         * As a direct consequence, every new symbol W element of C is related
         * to a pair (X,Y) where X is element of (A union {null}) and Y is
         * element of (B union {null}).
         * 
         * Our algorithm proceeds by finding these pairs to identify the symbols
         * of the new alphabet.
         * 
         */

        // First, we compute a map of (symbol pair,interval set)
        Map<SymbolPair<T>, SortedSet<Interval<T>>> symbolPairIntervalSetMap = computeSymbolPairIntervalSetMap(
                this, alphabet);

        // list of new symbols
        Collection<Symbol<T>> newSymbols = new LinkedList<Symbol<T>>();

        // SortedMaps to map old symbols to sets of new symbols
        SortedMap<Symbol<T>, SortedSet<Symbol<T>>> alphabet1SymbolMap = new TreeMap<Symbol<T>, SortedSet<Symbol<T>>>();
        SortedMap<Symbol<T>, SortedSet<Symbol<T>>> alphabet2SymbolMap = new TreeMap<Symbol<T>, SortedSet<Symbol<T>>>();

        for (Map.Entry<SymbolPair<T>, SortedSet<Interval<T>>> entry : symbolPairIntervalSetMap
                .entrySet()) {

            // we can make a new symbol that relates to the pair
            Symbol<T> newSymbol = new Symbol<T>(entry.getValue());

            Symbol<T> oldSymbol1 = entry.getKey().getSymbol1();
            Symbol<T> oldSymbol2 = entry.getKey().getSymbol2();

            // if no old symbol matches, don't create a symbol
            if (oldSymbol1 == null && oldSymbol2 == null) {
                continue;
            }

            newSymbols.add(newSymbol);

            // we add the associations in the (old symol, set of new symbols)
            // maps

            if (oldSymbol1 != null) {
                SortedSet<Symbol<T>> collection = alphabet1SymbolMap
                        .get(oldSymbol1);

                if (collection == null) {
                    collection = new TreeSet<Symbol<T>>();
                    alphabet1SymbolMap.put(oldSymbol1, collection);
                }

                collection.add(newSymbol);
            }

            if (oldSymbol2 != null) {
                SortedSet<Symbol<T>> collection = alphabet2SymbolMap
                        .get(oldSymbol2);

                if (collection == null) {
                    collection = new TreeSet<Symbol<T>>();
                    alphabet2SymbolMap.put(oldSymbol2, collection);
                }

                collection.add(newSymbol);
            }
        }

        return new AlphabetMergeResult<T>(new Alphabet<T>(newSymbols), this,
                alphabet1SymbolMap, alphabet, alphabet2SymbolMap);
    }

    /**
     * Computes a map that associate each symbol pair with a set of intervals
     * which are common to both symbols in a pair. A null member, in a symbol
     * pair, represents a hypothetical symbol which includes all intervals that
     * are not covereved by any symbol of its alphabet.
     * 
     * @param alphabet1
     *            the first alphabet.
     * @param alphabet2
     *            the second alphabet.
     * @return the (symbol pair, interval set) map.
     */
    private static <T extends Comparable<? super T>> Map<SymbolPair<T>, SortedSet<Interval<T>>> computeSymbolPairIntervalSetMap(
            Alphabet<T> alphabet1,
            Alphabet<T> alphabet2) {

        Map<SymbolPair<T>, SortedSet<Interval<T>>> symbolPairIntervalSetMap = new LinkedHashMap<SymbolPair<T>, SortedSet<Interval<T>>>();

        /*
         * We find all intervals of new symbols by analyzing the space starting
         * from the smallest lower bound of an interval to the highest upper
         * bound.
         */

        // currently analyzed sorted map entries
        Map.Entry<Interval<T>, Symbol<T>> entry1 = null;
        Map.Entry<Interval<T>, Symbol<T>> entry2 = null;

        // iterators
        Iterator<Map.Entry<Interval<T>, Symbol<T>>> i1 = alphabet1.intervalMap
                .entrySet().iterator();
        Iterator<Map.Entry<Interval<T>, Symbol<T>>> i2 = alphabet2.intervalMap
                .entrySet().iterator();

        AdjacencyRealm<T> adjacencyRealm = null;
        T lastUpperBound = null;

        while (entry1 != null || entry2 != null || i1.hasNext() || i2.hasNext()) {
            // if possible, make sure that entry1 and entry2 are filled
            if (entry1 == null && i1.hasNext()) {
                entry1 = i1.next();
            }

            if (entry2 == null && i2.hasNext()) {
                entry2 = i2.next();
            }

            // Compute the lower bound of the new interval
            T lowerBound;

            if (lastUpperBound == null) {
                // On the first iteration we need to apply a special treatment

                // We get the adjacencyRealm
                if (entry1 != null) {
                    adjacencyRealm = entry1.getKey().getAdjacencyRealm();
                }
                else {
                    adjacencyRealm = entry2.getKey().getAdjacencyRealm();
                }

                // We pick the smallest lower bound
                if (entry1 == null) {
                    lowerBound = entry2.getKey().getLowerBound();
                }
                else if (entry2 == null) {
                    lowerBound = entry1.getKey().getLowerBound();
                }
                else {
                    lowerBound = AdjacencyRealm.min(entry1.getKey()
                            .getLowerBound(), entry2.getKey().getLowerBound());
                }
            }
            else {
                lowerBound = adjacencyRealm.next(lastUpperBound);
            }

            // compute the upper bound of the new interval
            T upperBound;

            {
                T upperBoundCandidate1 = null;
                T upperBoundCandidate2 = null;

                if (entry1 != null) {
                    if (lowerBound.compareTo(entry1.getKey().getLowerBound()) < 0) {
                        upperBoundCandidate1 = adjacencyRealm.previous(entry1
                                .getKey().getLowerBound());
                    }
                    else {
                        upperBoundCandidate1 = entry1.getKey().getUpperBound();
                    }
                }

                if (entry2 != null) {
                    if (lowerBound.compareTo(entry2.getKey().getLowerBound()) < 0) {
                        upperBoundCandidate2 = adjacencyRealm.previous(entry2
                                .getKey().getLowerBound());
                    }
                    else {
                        upperBoundCandidate2 = entry2.getKey().getUpperBound();
                    }
                }

                if (upperBoundCandidate1 == null) {
                    upperBound = upperBoundCandidate2;
                }
                else if (upperBoundCandidate2 == null) {
                    upperBound = upperBoundCandidate1;
                }
                else {
                    upperBound = AdjacencyRealm.min(upperBoundCandidate1,
                            upperBoundCandidate2);
                }
            }

            // create new interval, and related symbol pair
            Interval<T> newInterval = adjacencyRealm.createInterval(lowerBound,
                    upperBound);

            Symbol<T> symbol1;
            if (entry1 != null && newInterval.intersects(entry1.getKey())) {
                symbol1 = entry1.getValue();
            }
            else {
                symbol1 = null;
            }

            Symbol<T> symbol2;
            if (entry2 != null && newInterval.intersects(entry2.getKey())) {
                symbol2 = entry2.getValue();
            }
            else {
                symbol2 = null;
            }

            SymbolPair<T> symbolPair = new SymbolPair<T>(symbol1, symbol2);

            // add interval in (symbol pair,interval set) map
            SortedSet<Interval<T>> intervalSet = symbolPairIntervalSetMap
                    .get(symbolPair);
            if (intervalSet == null) {
                intervalSet = new TreeSet<Interval<T>>();
                symbolPairIntervalSetMap.put(symbolPair, intervalSet);
            }

            intervalSet.add(newInterval);

            // save last upper bound
            lastUpperBound = upperBound;

            // update current entries
            if (entry1 != null
                    && lastUpperBound
                            .compareTo(entry1.getKey().getUpperBound()) >= 0) {
                entry1 = null;
            }
            if (entry2 != null
                    && lastUpperBound
                            .compareTo(entry2.getKey().getUpperBound()) >= 0) {
                entry2 = null;
            }
        }

        return symbolPairIntervalSetMap;
    }

    public static <T extends Comparable<? super T>> Alphabet<T> min(
            Alphabet<T> alphabet1,
            Alphabet<T> alphabet2) {

        if (alphabet1.compareTo(alphabet2) <= 0) {
            return alphabet1;
        }

        return alphabet2;
    }

    public static <T extends Comparable<? super T>> Alphabet<T> max(
            Alphabet<T> alphabet1,
            Alphabet<T> alphabet2) {

        if (alphabet1.compareTo(alphabet2) >= 0) {
            return alphabet1;
        }

        return alphabet2;
    }
}