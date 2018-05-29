/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MInternalMacroRefBuilder
        extends Macro {

    private DSeparator InternalNameSeparator;

    private DBeforeFirst InternalNameBeforeFirst;

    private DAfterLast InternalNameAfterLast;

    private DNone InternalNameNone;

    final List<String> list_InternalName;

    final Context InternalNameContext = new Context();

    final StringValue InternalNameValue;

    MInternalMacroRefBuilder(
            Macros macros) {

        setMacros(macros);
        this.list_InternalName = new LinkedList<>();

        this.InternalNameValue = new StringValue(this.list_InternalName,
                this.InternalNameContext);
    }

    public void addAllInternalName(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("InternalName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("InternalName");
            }

            this.list_InternalName.add(string);
        }
    }

    public void addInternalName(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("InternalName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_InternalName.add(string);
    }

    private String buildInternalName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_InternalName;

        int i = 0;
        int nb_strings = strings.size();

        if (this.InternalNameNone != null) {
            sb.append(this.InternalNameNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.InternalNameBeforeFirst != null) {
                string = this.InternalNameBeforeFirst.apply(i, string,
                        nb_strings);
            }

            if (this.InternalNameAfterLast != null) {
                string = this.InternalNameAfterLast.apply(i, string,
                        nb_strings);
            }

            if (this.InternalNameSeparator != null) {
                string = this.InternalNameSeparator.apply(i, string,
                        nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    StringValue getInternalName() {

        return this.InternalNameValue;
    }

    private void initInternalNameDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setInternalMacroRefBuilder(this);
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

        initInternalNameDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("private String build");
        sb0.append(buildInternalName());
        sb0.append("(Context context) ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    MacroValue macros = this.list_");
        sb0.append(buildInternalName());
        sb0.append(".get(context);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    return macros.build();");
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
