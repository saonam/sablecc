/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MMacroInsert
        extends Macro {

    private DSeparator ReferencedMacroSeparator;

    private DBeforeFirst ReferencedMacroBeforeFirst;

    private DAfterLast ReferencedMacroAfterLast;

    private DNone ReferencedMacroNone;

    final List<Macro> list_ReferencedMacro;

    final Context ReferencedMacroContext = new Context();

    final MacroValue ReferencedMacroValue;

    MMacroInsert(
            Macros macros) {

        setMacros(macros);
        this.list_ReferencedMacro = new LinkedList<>();

        this.ReferencedMacroValue = new MacroValue(this.list_ReferencedMacro,
                this.ReferencedMacroContext);
    }

    public void addAllReferencedMacro(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("ReferencedMacro");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "ReferencedMacro");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeReferencedMacro(macro);
            this.list_ReferencedMacro.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeReferencedMacro(
            Macro macro) {

        macro.apply(new InternalsInitializer("ReferencedMacro") {

            @Override
            void setMacroRef(
                    MMacroRef mMacroRef) {

            }
        });
    }

    public void addReferencedMacro(
            MMacroRef macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("ReferencedMacro");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_ReferencedMacro.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildReferencedMacro() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ReferencedMacroContext;
        List<Macro> macros = this.list_ReferencedMacro;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ReferencedMacroNone != null) {
            sb.append(this.ReferencedMacroNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ReferencedMacroBeforeFirst != null) {
                expansion = this.ReferencedMacroBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.ReferencedMacroAfterLast != null) {
                expansion = this.ReferencedMacroAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.ReferencedMacroSeparator != null) {
                expansion = this.ReferencedMacroSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    MacroValue getReferencedMacro() {

        return this.ReferencedMacroValue;
    }

    private void initReferencedMacroInternals(
            Context context) {

        for (Macro macro : this.list_ReferencedMacro) {
            macro.apply(new InternalsInitializer("ReferencedMacro") {

                @Override
                void setMacroRef(
                        MMacroRef mMacroRef) {

                }
            });
        }
    }

    private void initReferencedMacroDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setMacroInsert(this);
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

        initReferencedMacroDirectives();
        initReferencedMacroDirectives();

        initReferencedMacroInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("MacroInsert ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        sb1.append(buildReferencedMacro());
        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));
        sb0.append(LINE_SEPARATOR);
        sb0.append("}");

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
