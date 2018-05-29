/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MVarArgument
        extends Macro {

    private DSeparator ParamNameSeparator;

    private DBeforeFirst ParamNameBeforeFirst;

    private DAfterLast ParamNameAfterLast;

    private DNone ParamNameNone;

    final List<String> list_ParamName;

    final Context ParamNameContext = new Context();

    final StringValue ParamNameValue;

    private DSeparator ReferencedParamSeparator;

    private DBeforeFirst ReferencedParamBeforeFirst;

    private DAfterLast ReferencedParamAfterLast;

    private DNone ReferencedParamNone;

    final List<Macro> list_ReferencedParam;

    final Context ReferencedParamContext = new Context();

    final MacroValue ReferencedParamValue;

    MVarArgument(
            Macros macros) {

        setMacros(macros);
        this.list_ParamName = new LinkedList<>();
        this.list_ReferencedParam = new LinkedList<>();

        this.ParamNameValue
                = new StringValue(this.list_ParamName, this.ParamNameContext);
        this.ReferencedParamValue = new MacroValue(this.list_ReferencedParam,
                this.ReferencedParamContext);
    }

    public void addAllParamName(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("ParamName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("ParamName");
            }

            this.list_ParamName.add(string);
        }
    }

    public void addParamName(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("ParamName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_ParamName.add(string);
    }

    public void addAllReferencedParam(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("ReferencedParam");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "ReferencedParam");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeReferencedParam(macro);
            this.list_ReferencedParam.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeReferencedParam(
            Macro macro) {

        macro.apply(new InternalsInitializer("ReferencedParam") {

            @Override
            void setName(
                    MName mName) {

            }
        });
    }

    public void addReferencedParam(
            MName macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("ReferencedParam");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_ReferencedParam.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildParamName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_ParamName;

        int i = 0;
        int nb_strings = strings.size();

        if (this.ParamNameNone != null) {
            sb.append(this.ParamNameNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.ParamNameBeforeFirst != null) {
                string = this.ParamNameBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.ParamNameAfterLast != null) {
                string = this.ParamNameAfterLast.apply(i, string, nb_strings);
            }

            if (this.ParamNameSeparator != null) {
                string = this.ParamNameSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildReferencedParam() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ReferencedParamContext;
        List<Macro> macros = this.list_ReferencedParam;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ReferencedParamNone != null) {
            sb.append(this.ReferencedParamNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ReferencedParamBeforeFirst != null) {
                expansion = this.ReferencedParamBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.ReferencedParamAfterLast != null) {
                expansion = this.ReferencedParamAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.ReferencedParamSeparator != null) {
                expansion = this.ReferencedParamSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    StringValue getParamName() {

        return this.ParamNameValue;
    }

    MacroValue getReferencedParam() {

        return this.ReferencedParamValue;
    }

    private void initReferencedParamInternals(
            Context context) {

        for (Macro macro : this.list_ReferencedParam) {
            macro.apply(new InternalsInitializer("ReferencedParam") {

                @Override
                void setName(
                        MName mName) {

                }
            });
        }
    }

    private void initParamNameDirectives() {

    }

    private void initReferencedParamDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setVarArgument(this);
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

        initParamNameDirectives();
        initReferencedParamDirectives();
        initReferencedParamDirectives();

        initReferencedParamInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("Var");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        MParamName m1 = getMacros().newParamName();

        m1.setName(null, getParamName());
        sb1.append(m1.build(null));
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildReferencedParam());
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
