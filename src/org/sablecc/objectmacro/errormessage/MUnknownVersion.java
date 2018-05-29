/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

import java.util.*;

public class MUnknownVersion
        extends Macro {

    private DSeparator NameSeparator;

    private DBeforeFirst NameBeforeFirst;

    private DAfterLast NameAfterLast;

    private DNone NameNone;

    final List<String> list_Name;

    final Context NameContext = new Context();

    final StringValue NameValue;

    private DSeparator LineSeparator;

    private DBeforeFirst LineBeforeFirst;

    private DAfterLast LineAfterLast;

    private DNone LineNone;

    final List<String> list_Line;

    final Context LineContext = new Context();

    final StringValue LineValue;

    private DSeparator CharSeparator;

    private DBeforeFirst CharBeforeFirst;

    private DAfterLast CharAfterLast;

    private DNone CharNone;

    final List<String> list_Char;

    final Context CharContext = new Context();

    final StringValue CharValue;

    MUnknownVersion(
            Macros macros) {

        setMacros(macros);
        this.list_Name = new LinkedList<>();
        this.list_Line = new LinkedList<>();
        this.list_Char = new LinkedList<>();

        this.NameValue = new StringValue(this.list_Name, this.NameContext);
        this.LineValue = new StringValue(this.list_Line, this.LineContext);
        this.CharValue = new StringValue(this.list_Char, this.CharContext);
    }

    public void addAllName(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Name");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Name");
            }

            this.list_Name.add(string);
        }
    }

    public void addName(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Name");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Name.add(string);
    }

    public void addAllLine(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Line");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Line");
            }

            this.list_Line.add(string);
        }
    }

    public void addLine(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Line");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Line.add(string);
    }

    public void addAllChar(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Char");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Char");
            }

            this.list_Char.add(string);
        }
    }

    public void addChar(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Char");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Char.add(string);
    }

    private String buildName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Name;

        int i = 0;
        int nb_strings = strings.size();

        if (this.NameNone != null) {
            sb.append(this.NameNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.NameBeforeFirst != null) {
                string = this.NameBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.NameAfterLast != null) {
                string = this.NameAfterLast.apply(i, string, nb_strings);
            }

            if (this.NameSeparator != null) {
                string = this.NameSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildLine() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Line;

        int i = 0;
        int nb_strings = strings.size();

        if (this.LineNone != null) {
            sb.append(this.LineNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.LineBeforeFirst != null) {
                string = this.LineBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.LineAfterLast != null) {
                string = this.LineAfterLast.apply(i, string, nb_strings);
            }

            if (this.LineSeparator != null) {
                string = this.LineSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildChar() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Char;

        int i = 0;
        int nb_strings = strings.size();

        if (this.CharNone != null) {
            sb.append(this.CharNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.CharBeforeFirst != null) {
                string = this.CharBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.CharAfterLast != null) {
                string = this.CharAfterLast.apply(i, string, nb_strings);
            }

            if (this.CharSeparator != null) {
                string = this.CharSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    StringValue getName() {

        return this.NameValue;
    }

    StringValue getLine() {

        return this.LineValue;
    }

    StringValue getChar() {

        return this.CharValue;
    }

    private void initNameDirectives() {

    }

    private void initLineDirectives() {

    }

    private void initCharDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setUnknownVersion(this);
    }

    public String build() {

        CacheBuilder cache_builder = this.cacheBuilder;

        if (cache_builder == null) {
            cache_builder = new CacheBuilder();
        }
        else if (cache_builder.getExpansion() == null) {
            throw new InternalException("Cycle detection detected lately");
        }
        else {
            return cache_builder.getExpansion();
        }
        this.cacheBuilder = cache_builder;
        List<String> indentations = new LinkedList<>();

        initNameDirectives();
        initLineDirectives();
        initCharDirectives();

        StringBuilder sb0 = new StringBuilder();

        MSemanticErrorHead m1 = getMacros().newSemanticErrorHead();

        sb0.append(m1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("Line: ");
        sb0.append(buildLine());
        sb0.append(LINE_SEPARATOR);
        sb0.append("Char: ");
        sb0.append(buildChar());
        sb0.append(LINE_SEPARATOR);
        sb0.append("Version \"");
        sb0.append(buildName());
        sb0.append("\" does not exist.");

        cache_builder.setExpansion(sb0.toString());
        return sb0.toString();
    }

    @Override
    String build(
            Context context) {

        return build();
    }

    private void setMacros(
            Macros macros) {

        if (macros == null) {
            throw new InternalException("macros cannot be null");
        }

        this.macros = macros;
    }
}
