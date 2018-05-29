/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MStringParam
        extends Macro {

    private DSeparator NameSeparator;

    private DBeforeFirst NameBeforeFirst;

    private DAfterLast NameAfterLast;

    private DNone NameNone;

    final List<String> list_Name;

    final Context NameContext = new Context();

    final StringValue NameValue;

    MStringParam(
            Macros macros) {

        setMacros(macros);
        this.list_Name = new LinkedList<>();

        this.NameValue = new StringValue(this.list_Name, this.NameContext);
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

    StringValue getName() {

        return this.NameValue;
    }

    private void initNameDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setStringParam(this);
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

        StringBuilder sb0 = new StringBuilder();

        sb0.append("String p");
        sb0.append(buildName());

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
