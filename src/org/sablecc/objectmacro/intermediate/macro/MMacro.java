/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MMacro
        extends Macro {

    private DSeparator MacroNameSeparator;

    private DBeforeFirst MacroNameBeforeFirst;

    private DAfterLast MacroNameAfterLast;

    private DNone MacroNameNone;

    final List<Macro> list_MacroName;

    final Context MacroNameContext = new Context();

    final MacroValue MacroNameValue;

    private DSeparator ParentNameSeparator;

    private DBeforeFirst ParentNameBeforeFirst;

    private DAfterLast ParentNameAfterLast;

    private DNone ParentNameNone;

    final List<Macro> list_ParentName;

    final Context ParentNameContext = new Context();

    final MacroValue ParentNameValue;

    private DSeparator IsAbstractSeparator;

    private DBeforeFirst IsAbstractBeforeFirst;

    private DAfterLast IsAbstractAfterLast;

    private DNone IsAbstractNone;

    final List<Macro> list_IsAbstract;

    final Context IsAbstractContext = new Context();

    final MacroValue IsAbstractValue;

    private DSeparator IsAllVersionnedSeparator;

    private DBeforeFirst IsAllVersionnedBeforeFirst;

    private DAfterLast IsAllVersionnedAfterLast;

    private DNone IsAllVersionnedNone;

    final List<Macro> list_IsAllVersionned;

    final Context IsAllVersionnedContext = new Context();

    final MacroValue IsAllVersionnedValue;

    private DSeparator ParametersSeparator;

    private DBeforeFirst ParametersBeforeFirst;

    private DAfterLast ParametersAfterLast;

    private DNone ParametersNone;

    final List<Macro> list_Parameters;

    final Context ParametersContext = new Context();

    final MacroValue ParametersValue;

    private DSeparator InternalsSeparator;

    private DBeforeFirst InternalsBeforeFirst;

    private DAfterLast InternalsAfterLast;

    private DNone InternalsNone;

    final List<Macro> list_Internals;

    final Context InternalsContext = new Context();

    final MacroValue InternalsValue;

    private DSeparator BodySeparator;

    private DBeforeFirst BodyBeforeFirst;

    private DAfterLast BodyAfterLast;

    private DNone BodyNone;

    final List<Macro> list_Body;

    final Context BodyContext = new Context();

    final MacroValue BodyValue;

    private DSeparator VersionsSeparator;

    private DBeforeFirst VersionsBeforeFirst;

    private DAfterLast VersionsAfterLast;

    private DNone VersionsNone;

    final List<Macro> list_Versions;

    final Context VersionsContext = new Context();

    final MacroValue VersionsValue;

    MMacro(
            Macros macros) {

        setMacros(macros);
        this.list_MacroName = new LinkedList<>();
        this.list_ParentName = new LinkedList<>();
        this.list_IsAbstract = new LinkedList<>();
        this.list_IsAllVersionned = new LinkedList<>();
        this.list_Parameters = new LinkedList<>();
        this.list_Internals = new LinkedList<>();
        this.list_Body = new LinkedList<>();
        this.list_Versions = new LinkedList<>();

        this.MacroNameValue
                = new MacroValue(this.list_MacroName, this.MacroNameContext);
        this.ParentNameValue
                = new MacroValue(this.list_ParentName, this.ParentNameContext);
        this.IsAbstractValue
                = new MacroValue(this.list_IsAbstract, this.IsAbstractContext);
        this.IsAllVersionnedValue = new MacroValue(this.list_IsAllVersionned,
                this.IsAllVersionnedContext);
        this.ParametersValue
                = new MacroValue(this.list_Parameters, this.ParametersContext);
        this.InternalsValue
                = new MacroValue(this.list_Internals, this.InternalsContext);
        this.BodyValue = new MacroValue(this.list_Body, this.BodyContext);
        this.VersionsValue
                = new MacroValue(this.list_Versions, this.VersionsContext);
    }

    public void addAllMacroName(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("MacroName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "MacroName");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeMacroName(macro);
            this.list_MacroName.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeMacroName(
            Macro macro) {

        macro.apply(new InternalsInitializer("MacroName") {

            @Override
            void setName(
                    MName mName) {

            }
        });
    }

    public void addMacroName(
            MName macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("MacroName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_MacroName.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllParentName(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("ParentName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "ParentName");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeParentName(macro);
            this.list_ParentName.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeParentName(
            Macro macro) {

        macro.apply(new InternalsInitializer("ParentName") {

            @Override
            void setParentName(
                    MParentName mParentName) {

            }
        });
    }

    public void addParentName(
            MParentName macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("ParentName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_ParentName.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllIsAbstract(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("IsAbstract");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "IsAbstract");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeIsAbstract(macro);
            this.list_IsAbstract.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeIsAbstract(
            Macro macro) {

        macro.apply(new InternalsInitializer("IsAbstract") {

            @Override
            void setIsAbstract(
                    MIsAbstract mIsAbstract) {

            }
        });
    }

    public void addIsAbstract(
            MIsAbstract macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("IsAbstract");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_IsAbstract.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllIsAllVersionned(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("IsAllVersionned");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "IsAllVersionned");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeIsAllVersionned(macro);
            this.list_IsAllVersionned.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeIsAllVersionned(
            Macro macro) {

        macro.apply(new InternalsInitializer("IsAllVersionned") {

            @Override
            void setIsAllVersionned(
                    MIsAllVersionned mIsAllVersionned) {

            }
        });
    }

    public void addIsAllVersionned(
            MIsAllVersionned macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("IsAllVersionned");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_IsAllVersionned.add(macro);
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
            void setParam(
                    MParam mParam) {

            }
        });
    }

    public void addParameters(
            MParam macro) {

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

    public void addAllInternals(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("Internals");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "Internals");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeInternals(macro);
            this.list_Internals.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeInternals(
            Macro macro) {

        macro.apply(new InternalsInitializer("Internals") {

            @Override
            void setInternal(
                    MInternal mInternal) {

            }
        });
    }

    public void addInternals(
            MInternal macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Internals");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Internals.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllBody(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("Body");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "Body");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeBody(macro);
            this.list_Body.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeBody(
            Macro macro) {

        macro.apply(new InternalsInitializer("Body") {

            @Override
            void setStringPart(
                    MStringPart mStringPart) {

            }

            @Override
            void setEolPart(
                    MEolPart mEolPart) {

            }

            @Override
            void setParamInsert(
                    MParamInsert mParamInsert) {

            }

            @Override
            void setMacroInsert(
                    MMacroInsert mMacroInsert) {

            }

            @Override
            void setIndentPart(
                    MIndentPart mIndentPart) {

            }

            @Override
            void setEndIndentPart(
                    MEndIndentPart mEndIndentPart) {

            }
        });
    }

    public void addBody(
            MStringPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Body");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Body.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addBody(
            MEolPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Body");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Body.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addBody(
            MParamInsert macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Body");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Body.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addBody(
            MMacroInsert macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Body");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Body.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addBody(
            MIndentPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Body");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Body.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addBody(
            MEndIndentPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Body");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Body.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllVersions(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("Versions");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "Versions");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeVersions(macro);
            this.list_Versions.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeVersions(
            Macro macro) {

        macro.apply(new InternalsInitializer("Versions") {

            @Override
            void setVersions(
                    MVersions mVersions) {

            }
        });
    }

    public void addVersions(
            MVersions macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Versions");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Versions.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildMacroName() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.MacroNameContext;
        List<Macro> macros = this.list_MacroName;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.MacroNameNone != null) {
            sb.append(this.MacroNameNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.MacroNameBeforeFirst != null) {
                expansion = this.MacroNameBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.MacroNameAfterLast != null) {
                expansion = this.MacroNameAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.MacroNameSeparator != null) {
                expansion = this.MacroNameSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildParentName() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ParentNameContext;
        List<Macro> macros = this.list_ParentName;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ParentNameNone != null) {
            sb.append(this.ParentNameNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ParentNameBeforeFirst != null) {
                expansion = this.ParentNameBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.ParentNameAfterLast != null) {
                expansion = this.ParentNameAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.ParentNameSeparator != null) {
                expansion = this.ParentNameSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildIsAbstract() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.IsAbstractContext;
        List<Macro> macros = this.list_IsAbstract;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.IsAbstractNone != null) {
            sb.append(this.IsAbstractNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.IsAbstractBeforeFirst != null) {
                expansion = this.IsAbstractBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.IsAbstractAfterLast != null) {
                expansion = this.IsAbstractAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.IsAbstractSeparator != null) {
                expansion = this.IsAbstractSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildIsAllVersionned() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.IsAllVersionnedContext;
        List<Macro> macros = this.list_IsAllVersionned;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.IsAllVersionnedNone != null) {
            sb.append(this.IsAllVersionnedNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.IsAllVersionnedBeforeFirst != null) {
                expansion = this.IsAllVersionnedBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.IsAllVersionnedAfterLast != null) {
                expansion = this.IsAllVersionnedAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.IsAllVersionnedSeparator != null) {
                expansion = this.IsAllVersionnedSeparator.apply(i, expansion,
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

    private String buildInternals() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.InternalsContext;
        List<Macro> macros = this.list_Internals;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.InternalsNone != null) {
            sb.append(this.InternalsNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.InternalsBeforeFirst != null) {
                expansion = this.InternalsBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.InternalsAfterLast != null) {
                expansion = this.InternalsAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.InternalsSeparator != null) {
                expansion = this.InternalsSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildBody() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.BodyContext;
        List<Macro> macros = this.list_Body;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.BodyNone != null) {
            sb.append(this.BodyNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.BodyBeforeFirst != null) {
                expansion = this.BodyBeforeFirst.apply(i, expansion, nb_macros);
            }

            if (this.BodyAfterLast != null) {
                expansion = this.BodyAfterLast.apply(i, expansion, nb_macros);
            }

            if (this.BodySeparator != null) {
                expansion = this.BodySeparator.apply(i, expansion, nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildVersions() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.VersionsContext;
        List<Macro> macros = this.list_Versions;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.VersionsNone != null) {
            sb.append(this.VersionsNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.VersionsBeforeFirst != null) {
                expansion = this.VersionsBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.VersionsAfterLast != null) {
                expansion
                        = this.VersionsAfterLast.apply(i, expansion, nb_macros);
            }

            if (this.VersionsSeparator != null) {
                expansion
                        = this.VersionsSeparator.apply(i, expansion, nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    MacroValue getMacroName() {

        return this.MacroNameValue;
    }

    MacroValue getParentName() {

        return this.ParentNameValue;
    }

    MacroValue getIsAbstract() {

        return this.IsAbstractValue;
    }

    MacroValue getIsAllVersionned() {

        return this.IsAllVersionnedValue;
    }

    MacroValue getParameters() {

        return this.ParametersValue;
    }

    MacroValue getInternals() {

        return this.InternalsValue;
    }

    MacroValue getBody() {

        return this.BodyValue;
    }

    MacroValue getVersions() {

        return this.VersionsValue;
    }

    private void initMacroNameInternals(
            Context context) {

        for (Macro macro : this.list_MacroName) {
            macro.apply(new InternalsInitializer("MacroName") {

                @Override
                void setName(
                        MName mName) {

                }
            });
        }
    }

    private void initParentNameInternals(
            Context context) {

        for (Macro macro : this.list_ParentName) {
            macro.apply(new InternalsInitializer("ParentName") {

                @Override
                void setParentName(
                        MParentName mParentName) {

                }
            });
        }
    }

    private void initIsAbstractInternals(
            Context context) {

        for (Macro macro : this.list_IsAbstract) {
            macro.apply(new InternalsInitializer("IsAbstract") {

                @Override
                void setIsAbstract(
                        MIsAbstract mIsAbstract) {

                }
            });
        }
    }

    private void initIsAllVersionnedInternals(
            Context context) {

        for (Macro macro : this.list_IsAllVersionned) {
            macro.apply(new InternalsInitializer("IsAllVersionned") {

                @Override
                void setIsAllVersionned(
                        MIsAllVersionned mIsAllVersionned) {

                }
            });
        }
    }

    private void initParametersInternals(
            Context context) {

        for (Macro macro : this.list_Parameters) {
            macro.apply(new InternalsInitializer("Parameters") {

                @Override
                void setParam(
                        MParam mParam) {

                }
            });
        }
    }

    private void initInternalsInternals(
            Context context) {

        for (Macro macro : this.list_Internals) {
            macro.apply(new InternalsInitializer("Internals") {

                @Override
                void setInternal(
                        MInternal mInternal) {

                }
            });
        }
    }

    private void initBodyInternals(
            Context context) {

        for (Macro macro : this.list_Body) {
            macro.apply(new InternalsInitializer("Body") {

                @Override
                void setStringPart(
                        MStringPart mStringPart) {

                }

                @Override
                void setEolPart(
                        MEolPart mEolPart) {

                }

                @Override
                void setParamInsert(
                        MParamInsert mParamInsert) {

                }

                @Override
                void setMacroInsert(
                        MMacroInsert mMacroInsert) {

                }

                @Override
                void setIndentPart(
                        MIndentPart mIndentPart) {

                }

                @Override
                void setEndIndentPart(
                        MEndIndentPart mEndIndentPart) {

                }
            });
        }
    }

    private void initVersionsInternals(
            Context context) {

        for (Macro macro : this.list_Versions) {
            macro.apply(new InternalsInitializer("Versions") {

                @Override
                void setVersions(
                        MVersions mVersions) {

                }
            });
        }
    }

    private void initMacroNameDirectives() {

    }

    private void initParentNameDirectives() {

    }

    private void initIsAbstractDirectives() {

    }

    private void initIsAllVersionnedDirectives() {

    }

    private void initParametersDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.ParametersSeparator = new DSeparator(sb1.toString());
        this.ParametersValue.setSeparator(this.ParametersSeparator);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LINE_SEPARATOR);
        this.ParametersBeforeFirst = new DBeforeFirst(sb2.toString());
        this.ParametersValue.setBeforeFirst(this.ParametersBeforeFirst);
    }

    private void initInternalsDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.InternalsSeparator = new DSeparator(sb1.toString());
        this.InternalsValue.setSeparator(this.InternalsSeparator);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LINE_SEPARATOR);
        this.InternalsBeforeFirst = new DBeforeFirst(sb2.toString());
        this.InternalsValue.setBeforeFirst(this.InternalsBeforeFirst);
    }

    private void initBodyDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.BodySeparator = new DSeparator(sb1.toString());
        this.BodyValue.setSeparator(this.BodySeparator);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LINE_SEPARATOR);
        sb2.append("MacroBody");
        sb2.append("{");
        sb2.append(LINE_SEPARATOR);
        sb2.append("  ");
        this.BodyBeforeFirst = new DBeforeFirst(sb2.toString());
        this.BodyValue.setBeforeFirst(this.BodyBeforeFirst);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(LINE_SEPARATOR);
        sb3.append(" }");
        this.BodyAfterLast = new DAfterLast(sb3.toString());
        this.BodyValue.setAfterLast(this.BodyAfterLast);
    }

    private void initVersionsDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.VersionsBeforeFirst = new DBeforeFirst(sb1.toString());
        this.VersionsValue.setBeforeFirst(this.VersionsBeforeFirst);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setMacro(this);
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

        initMacroNameDirectives();
        initMacroNameDirectives();
        initParentNameDirectives();
        initParentNameDirectives();
        initIsAbstractDirectives();
        initIsAbstractDirectives();
        initIsAllVersionnedDirectives();
        initIsAllVersionnedDirectives();
        initParametersDirectives();
        initParametersDirectives();
        initInternalsDirectives();
        initInternalsDirectives();
        initBodyDirectives();
        initBodyDirectives();
        initVersionsDirectives();
        initVersionsDirectives();

        initMacroNameInternals(null);
        initParentNameInternals(null);
        initIsAbstractInternals(null);
        initIsAllVersionnedInternals(null);
        initParametersInternals(null);
        initInternalsInternals(null);
        initBodyInternals(null);
        initVersionsInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("Macro ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        sb1.append(buildIsAbstract());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildIsAllVersionned());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildParentName());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildMacroName());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildParameters());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildInternals());
        sb1.append(LINE_SEPARATOR);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("    ");
        indentations.add(sb4.toString());
        sb3.append(buildBody());
        sb1.append(applyIndent(sb3.toString(),
                indentations.remove(indentations.size() - 1)));
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildVersions());
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
