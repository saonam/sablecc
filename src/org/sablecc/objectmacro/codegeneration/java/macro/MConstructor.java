/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MConstructor
        extends Macro {

    private DSeparator FieldInitializersSeparator;

    private DBeforeFirst FieldInitializersBeforeFirst;

    private DAfterLast FieldInitializersAfterLast;

    private DNone FieldInitializersNone;

    final List<Macro> list_FieldInitializers;

    final Context FieldInitializersContext = new Context();

    final MacroValue FieldInitializersValue;

    private DSeparator ParametersSeparator;

    private DBeforeFirst ParametersBeforeFirst;

    private DAfterLast ParametersAfterLast;

    private DNone ParametersNone;

    final List<Macro> list_Parameters;

    final Context ParametersContext = new Context();

    final MacroValue ParametersValue;

    private DSeparator ValuesInitializersSeparator;

    private DBeforeFirst ValuesInitializersBeforeFirst;

    private DAfterLast ValuesInitializersAfterLast;

    private DNone ValuesInitializersNone;

    final List<Macro> list_ValuesInitializers;

    final Context ValuesInitializersContext = new Context();

    final MacroValue ValuesInitializersValue;

    private DSeparator SuperSeparator;

    private DBeforeFirst SuperBeforeFirst;

    private DAfterLast SuperAfterLast;

    private DNone SuperNone;

    final List<Macro> list_Super;

    final Context SuperContext = new Context();

    final MacroValue SuperValue;

    private Map<Context, StringValue> list_ClassName = new LinkedHashMap<>();

    MConstructor(
            Macros macros) {

        setMacros(macros);
        this.list_FieldInitializers = new LinkedList<>();
        this.list_Parameters = new LinkedList<>();
        this.list_ValuesInitializers = new LinkedList<>();
        this.list_Super = new LinkedList<>();
        this.list_ClassName = new LinkedHashMap<>();

        this.FieldInitializersValue = new MacroValue(
                this.list_FieldInitializers, this.FieldInitializersContext);
        this.ParametersValue
                = new MacroValue(this.list_Parameters, this.ParametersContext);
        this.ValuesInitializersValue = new MacroValue(
                this.list_ValuesInitializers, this.ValuesInitializersContext);
        this.SuperValue = new MacroValue(this.list_Super, this.SuperContext);
    }

    public void addAllFieldInitializers(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("FieldInitializers");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "FieldInitializers");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeFieldInitializers(macro);
            this.list_FieldInitializers.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeFieldInitializers(
            Macro macro) {

        macro.apply(new InternalsInitializer("FieldInitializers") {

            @Override
            void setInitParam(
                    MInitParam mInitParam) {

            }

            @Override
            void setInitInternal(
                    MInitInternal mInitInternal) {

            }

            @Override
            void setSetMacrosCall(
                    MSetMacrosCall mSetMacrosCall) {

            }
        });
    }

    public void addFieldInitializers(
            MInitParam macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("FieldInitializers");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_FieldInitializers.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addFieldInitializers(
            MInitInternal macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("FieldInitializers");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_FieldInitializers.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addFieldInitializers(
            MSetMacrosCall macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("FieldInitializers");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_FieldInitializers.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllParameters(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("Parameters");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "Parameters");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeParameters(macro);
            this.list_Parameters.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeParameters(
            Macro macro) {

        macro.apply(new InternalsInitializer("Parameters") {

            @Override
            void setMacrosParam(
                    MMacrosParam mMacrosParam) {

            }
        });
    }

    public void addParameters(
            MMacrosParam macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Parameters");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Parameters.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllValuesInitializers(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("ValuesInitializers");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "ValuesInitializers");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeValuesInitializers(macro);
            this.list_ValuesInitializers.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeValuesInitializers(
            Macro macro) {

        macro.apply(new InternalsInitializer("ValuesInitializers") {

            @Override
            void setInitMacroValue(
                    MInitMacroValue mInitMacroValue) {

            }

            @Override
            void setInitStringValue(
                    MInitStringValue mInitStringValue) {

            }
        });
    }

    public void addValuesInitializers(
            MInitMacroValue macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("ValuesInitializers");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_ValuesInitializers.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addValuesInitializers(
            MInitStringValue macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("ValuesInitializers");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_ValuesInitializers.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllSuper(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("Super");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "Super");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeSuper(macro);
            this.list_Super.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeSuper(
            Macro macro) {

        macro.apply(new InternalsInitializer("Super") {

            @Override
            void setSuperCall(
                    MSuperCall mSuperCall) {

            }
        });
    }

    public void addSuper(
            MSuperCall macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Super");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Super.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    void setClassName(
            Context context,
            StringValue value) {

        if (value == null) {
            throw new RuntimeException("value cannot be null here");
        }

        this.list_ClassName.put(context, value);
    }

    private String buildFieldInitializers() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.FieldInitializersContext;
        List<Macro> macros = this.list_FieldInitializers;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.FieldInitializersNone != null) {
            sb.append(this.FieldInitializersNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.FieldInitializersBeforeFirst != null) {
                expansion = this.FieldInitializersBeforeFirst.apply(i,
                        expansion, nb_macros);
            }

            if (this.FieldInitializersAfterLast != null) {
                expansion = this.FieldInitializersAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.FieldInitializersSeparator != null) {
                expansion = this.FieldInitializersSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildParameters() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ParametersContext;
        List<Macro> macros = this.list_Parameters;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ParametersNone != null) {
            sb.append(this.ParametersNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ParametersBeforeFirst != null) {
                expansion = this.ParametersBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.ParametersAfterLast != null) {
                expansion = this.ParametersAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.ParametersSeparator != null) {
                expansion = this.ParametersSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildValuesInitializers() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ValuesInitializersContext;
        List<Macro> macros = this.list_ValuesInitializers;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ValuesInitializersNone != null) {
            sb.append(this.ValuesInitializersNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ValuesInitializersBeforeFirst != null) {
                expansion = this.ValuesInitializersBeforeFirst.apply(i,
                        expansion, nb_macros);
            }

            if (this.ValuesInitializersAfterLast != null) {
                expansion = this.ValuesInitializersAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.ValuesInitializersSeparator != null) {
                expansion = this.ValuesInitializersSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildSuper() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.SuperContext;
        List<Macro> macros = this.list_Super;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.SuperNone != null) {
            sb.append(this.SuperNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.SuperBeforeFirst != null) {
                expansion
                        = this.SuperBeforeFirst.apply(i, expansion, nb_macros);
            }

            if (this.SuperAfterLast != null) {
                expansion = this.SuperAfterLast.apply(i, expansion, nb_macros);
            }

            if (this.SuperSeparator != null) {
                expansion = this.SuperSeparator.apply(i, expansion, nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildClassName(
            Context context) {

        StringValue stringValue = this.list_ClassName.get(context);
        return stringValue.build();
    }

    MacroValue getFieldInitializers() {

        return this.FieldInitializersValue;
    }

    MacroValue getParameters() {

        return this.ParametersValue;
    }

    MacroValue getValuesInitializers() {

        return this.ValuesInitializersValue;
    }

    MacroValue getSuper() {

        return this.SuperValue;
    }

    private StringValue getClassName(
            Context context) {

        return this.list_ClassName.get(context);
    }

    private void initFieldInitializersInternals(
            Context context) {

        for (Macro macro : this.list_FieldInitializers) {
            macro.apply(new InternalsInitializer("FieldInitializers") {

                @Override
                void setInitParam(
                        MInitParam mInitParam) {

                }

                @Override
                void setInitInternal(
                        MInitInternal mInitInternal) {

                }

                @Override
                void setSetMacrosCall(
                        MSetMacrosCall mSetMacrosCall) {

                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("macros");
                    StringValue value3 = new StringValue(
                            new ArrayList<>(
                                    Collections.singletonList(sb3.toString())),
                            null);
                    mSetMacrosCall.setMacrosParamName(
                            MConstructor.this.FieldInitializersContext, value3);
                }
            });
        }
    }

    private void initParametersInternals(
            Context context) {

        for (Macro macro : this.list_Parameters) {
            macro.apply(new InternalsInitializer("Parameters") {

                @Override
                void setMacrosParam(
                        MMacrosParam mMacrosParam) {

                    StringBuilder sb1 = new StringBuilder();
                    sb1.append("macros");
                    StringValue value1 = new StringValue(
                            new ArrayList<>(
                                    Collections.singletonList(sb1.toString())),
                            null);
                    mMacrosParam.setName(MConstructor.this.ParametersContext,
                            value1);
                }
            });
        }
    }

    private void initValuesInitializersInternals(
            Context context) {

        for (Macro macro : this.list_ValuesInitializers) {
            macro.apply(new InternalsInitializer("ValuesInitializers") {

                @Override
                void setInitMacroValue(
                        MInitMacroValue mInitMacroValue) {

                }

                @Override
                void setInitStringValue(
                        MInitStringValue mInitStringValue) {

                }
            });
        }
    }

    private void initSuperInternals(
            Context context) {

        for (Macro macro : this.list_Super) {
            macro.apply(new InternalsInitializer("Super") {

                @Override
                void setSuperCall(
                        MSuperCall mSuperCall) {

                }
            });
        }
    }

    private void initFieldInitializersDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.FieldInitializersBeforeFirst = new DBeforeFirst(sb1.toString());
        this.FieldInitializersValue
                .setBeforeFirst(this.FieldInitializersBeforeFirst);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LINE_SEPARATOR);
        this.FieldInitializersSeparator = new DSeparator(sb2.toString());
        this.FieldInitializersValue
                .setSeparator(this.FieldInitializersSeparator);
    }

    private void initParametersDirectives() {

    }

    private void initValuesInitializersDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.ValuesInitializersBeforeFirst = new DBeforeFirst(sb1.toString());
        this.ValuesInitializersValue
                .setBeforeFirst(this.ValuesInitializersBeforeFirst);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LINE_SEPARATOR);
        this.ValuesInitializersSeparator = new DSeparator(sb2.toString());
        this.ValuesInitializersValue
                .setSeparator(this.ValuesInitializersSeparator);
    }

    private void initSuperDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.SuperBeforeFirst = new DBeforeFirst(sb1.toString());
        this.SuperValue.setBeforeFirst(this.SuperBeforeFirst);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setConstructor(this);
    }

    @Override
    String build(
            Context context) {

        CacheBuilder cache_builder = this.cacheBuilders.get(context);

        if (cache_builder == null) {
            cache_builder = new CacheBuilder();
        }
        else if (cache_builder.getExpansion() == null) {
            throw new InternalException("Cycle detection detected lately");
        }
        else {
            return cache_builder.getExpansion();
        }
        this.cacheBuilders.put(context, cache_builder);
        List<String> indentations = new LinkedList<>();

        initFieldInitializersDirectives();
        initParametersDirectives();
        initValuesInitializersDirectives();
        initSuperDirectives();

        initFieldInitializersInternals(context);
        initParametersInternals(context);
        initValuesInitializersInternals(context);
        initSuperInternals(context);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("M");
        sb0.append(buildClassName(context));
        sb0.append("(");
        sb0.append(buildParameters());
        sb0.append(")");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        sb1.append(buildSuper());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildFieldInitializers());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildValuesInitializers());
        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));
        sb0.append(LINE_SEPARATOR);
        sb0.append("}");

        cache_builder.setExpansion(sb0.toString());
        return sb0.toString();
    }

    private void setMacros(
            Macros macros) {

        if (macros == null) {
            throw new InternalException("macros cannot be null");
        }

        this.macros = macros;
    }
}
