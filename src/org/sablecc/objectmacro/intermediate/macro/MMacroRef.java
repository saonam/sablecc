/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MMacroRef
        extends Macro {

    private DSeparator ReferencedMacroNameSeparator;

    private DBeforeFirst ReferencedMacroNameBeforeFirst;

    private DAfterLast ReferencedMacroNameAfterLast;

    private DNone ReferencedMacroNameNone;

    final List<Macro> list_ReferencedMacroName;

    final Context ReferencedMacroNameContext = new Context();

    final MacroValue ReferencedMacroNameValue;

    private DSeparator ArgumentsSeparator;

    private DBeforeFirst ArgumentsBeforeFirst;

    private DAfterLast ArgumentsAfterLast;

    private DNone ArgumentsNone;

    final List<Macro> list_Arguments;

    final Context ArgumentsContext = new Context();

    final MacroValue ArgumentsValue;

    MMacroRef(
            Macros macros) {

        setMacros(macros);
        this.list_ReferencedMacroName = new LinkedList<>();
        this.list_Arguments = new LinkedList<>();

        this.ReferencedMacroNameValue = new MacroValue(
                this.list_ReferencedMacroName, this.ReferencedMacroNameContext);
        this.ArgumentsValue
                = new MacroValue(this.list_Arguments, this.ArgumentsContext);
    }

    public void addAllReferencedMacroName(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("ReferencedMacroName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "ReferencedMacroName");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeReferencedMacroName(macro);
            this.list_ReferencedMacroName.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeReferencedMacroName(
            Macro macro) {

        macro.apply(new InternalsInitializer("ReferencedMacroName") {

            @Override
            void setName(
                    MName mName) {

            }
        });
    }

    public void addReferencedMacroName(
            MName macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("ReferencedMacroName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_ReferencedMacroName.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllArguments(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("Arguments");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "Arguments");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeArguments(macro);
            this.list_Arguments.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeArguments(
            Macro macro) {

        macro.apply(new InternalsInitializer("Arguments") {

            @Override
            void setArgs(
                    MArgs mArgs) {

            }
        });
    }

    public void addArguments(
            MArgs macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Arguments");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Arguments.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildReferencedMacroName() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ReferencedMacroNameContext;
        List<Macro> macros = this.list_ReferencedMacroName;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ReferencedMacroNameNone != null) {
            sb.append(this.ReferencedMacroNameNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ReferencedMacroNameBeforeFirst != null) {
                expansion = this.ReferencedMacroNameBeforeFirst.apply(i,
                        expansion, nb_macros);
            }

            if (this.ReferencedMacroNameAfterLast != null) {
                expansion = this.ReferencedMacroNameAfterLast.apply(i,
                        expansion, nb_macros);
            }

            if (this.ReferencedMacroNameSeparator != null) {
                expansion = this.ReferencedMacroNameSeparator.apply(i,
                        expansion, nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildArguments() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ArgumentsContext;
        List<Macro> macros = this.list_Arguments;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ArgumentsNone != null) {
            sb.append(this.ArgumentsNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ArgumentsBeforeFirst != null) {
                expansion = this.ArgumentsBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.ArgumentsAfterLast != null) {
                expansion = this.ArgumentsAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.ArgumentsSeparator != null) {
                expansion = this.ArgumentsSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    MacroValue getReferencedMacroName() {

        return this.ReferencedMacroNameValue;
    }

    MacroValue getArguments() {

        return this.ArgumentsValue;
    }

    private void initReferencedMacroNameInternals(
            Context context) {

        for (Macro macro : this.list_ReferencedMacroName) {
            macro.apply(new InternalsInitializer("ReferencedMacroName") {

                @Override
                void setName(
                        MName mName) {

                }
            });
        }
    }

    private void initArgumentsInternals(
            Context context) {

        for (Macro macro : this.list_Arguments) {
            macro.apply(new InternalsInitializer("Arguments") {

                @Override
                void setArgs(
                        MArgs mArgs) {

                }
            });
        }
    }

    private void initReferencedMacroNameDirectives() {

    }

    private void initArgumentsDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setMacroRef(this);
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

        initReferencedMacroNameDirectives();
        initReferencedMacroNameDirectives();
        initArgumentsDirectives();
        initArgumentsDirectives();

        initReferencedMacroNameInternals(null);
        initArgumentsInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("MacroRef");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        sb1.append(buildReferencedMacroName());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildArguments());
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
