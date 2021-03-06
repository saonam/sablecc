/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MParamInsertPart
        extends Macro {

    private DSeparator ParamNameSeparator;

    private DBeforeFirst ParamNameBeforeFirst;

    private DAfterLast ParamNameAfterLast;

    private DNone ParamNameNone;

    final List<String> list_ParamName;

    final Context ParamNameContext = new Context();

    final StringValue ParamNameValue;

    private DSeparator IndexBuilderSeparator;

    private DBeforeFirst IndexBuilderBeforeFirst;

    private DAfterLast IndexBuilderAfterLast;

    private DNone IndexBuilderNone;

    final List<String> list_IndexBuilder;

    final Context IndexBuilderContext = new Context();

    final StringValue IndexBuilderValue;

    private DSeparator ContextArgSeparator;

    private DBeforeFirst ContextArgBeforeFirst;

    private DAfterLast ContextArgAfterLast;

    private DNone ContextArgNone;

    final List<Macro> list_ContextArg;

    final Context ContextArgContext = new Context();

    final MacroValue ContextArgValue;

    MParamInsertPart(
            Macros macros) {

        setMacros(macros);
        this.list_ParamName = new LinkedList<>();
        this.list_IndexBuilder = new LinkedList<>();
        this.list_ContextArg = new LinkedList<>();

        this.ParamNameValue
                = new StringValue(this.list_ParamName, this.ParamNameContext);
        this.IndexBuilderValue = new StringValue(this.list_IndexBuilder,
                this.IndexBuilderContext);
        this.ContextArgValue
                = new MacroValue(this.list_ContextArg, this.ContextArgContext);
    }

    MParamInsertPart(
            String pParamName,
            String pIndexBuilder,
            List<Macro> pContextArg,
            Macros macros) {

        setMacros(macros);
        this.list_ParamName = new LinkedList<>();
        this.list_IndexBuilder = new LinkedList<>();
        this.list_ContextArg = new LinkedList<>();

        this.ParamNameValue
                = new StringValue(this.list_ParamName, this.ParamNameContext);
        this.IndexBuilderValue = new StringValue(this.list_IndexBuilder,
                this.IndexBuilderContext);
        this.ContextArgValue
                = new MacroValue(this.list_ContextArg, this.ContextArgContext);
        if (pContextArg != null) {
            addAllContextArg(pContextArg);
        }

        if (pParamName != null) {
            addParamName(pParamName);
        }
        if (pIndexBuilder != null) {
            addIndexBuilder(pIndexBuilder);
        }
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

    public void addAllIndexBuilder(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("IndexBuilder");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("IndexBuilder");
            }

            this.list_IndexBuilder.add(string);
        }
    }

    public void addIndexBuilder(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("IndexBuilder");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_IndexBuilder.add(string);
    }

    public void addAllContextArg(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("ContextArg");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "ContextArg");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeContextArg(macro);
            this.list_ContextArg.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeContextArg(
            Macro macro) {

        macro.apply(new InternalsInitializer("ContextArg") {

            @Override
            void setContextArg(
                    MContextArg mContextArg) {

            }
        });
    }

    public void addContextArg(
            MContextArg macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("ContextArg");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_ContextArg.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildParamName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_ParamName;

        int i = 0;
        int nb_strings = strings.size();

        for (String string : strings) {

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildIndexBuilder() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_IndexBuilder;

        int i = 0;
        int nb_strings = strings.size();

        for (String string : strings) {

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildContextArg() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ContextArgContext;
        List<Macro> macros = this.list_ContextArg;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    StringValue getParamName() {

        return this.ParamNameValue;
    }

    StringValue getIndexBuilder() {

        return this.IndexBuilderValue;
    }

    MacroValue getContextArg() {

        return this.ContextArgValue;
    }

    private void initContextArgInternals(
            Context context) {

        for (Macro macro : this.list_ContextArg) {
            macro.apply(new InternalsInitializer("ContextArg") {

                @Override
                void setContextArg(
                        MContextArg mContextArg) {

                }
            });
        }
    }

    private void initParamNameDirectives() {

    }

    private void initIndexBuilderDirectives() {

    }

    private void initContextArgDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setParamInsertPart(this);
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

        initContextArgInternals(null);

        initParamNameDirectives();
        initIndexBuilderDirectives();
        initContextArgDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("sb");
        sb0.append(buildIndexBuilder());
        sb0.append(".append(build");
        sb0.append(buildParamName());
        sb0.append("(");
        sb0.append(buildContextArg());
        sb0.append("));");
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
