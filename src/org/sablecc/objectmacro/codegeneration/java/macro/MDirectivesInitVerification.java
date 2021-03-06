/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MDirectivesInitVerification
        extends Macro {

    private Map<Context, StringValue> list_ParamName = new LinkedHashMap<>();

    private Map<Context, StringValue> list_DirectivesName
            = new LinkedHashMap<>();

    MDirectivesInitVerification(
            Macros macros) {

        setMacros(macros);
        this.list_ParamName = new LinkedHashMap<>();
        this.list_DirectivesName = new LinkedHashMap<>();
    }

    void setParamName(
            Context context,
            StringValue value) {

        if (value == null) {
            throw new RuntimeException("value cannot be null here");
        }

        this.list_ParamName.put(context, value);
    }

    void setDirectivesName(
            Context context,
            StringValue value) {

        if (value == null) {
            throw new RuntimeException("value cannot be null here");
        }

        this.list_DirectivesName.put(context, value);
    }

    private String buildParamName(
            Context context) {

        StringValue stringValue = this.list_ParamName.get(context);
        return stringValue.build();
    }

    private String buildDirectivesName(
            Context context) {

        StringValue stringValue = this.list_DirectivesName.get(context);
        return stringValue.build();
    }

    private StringValue getParamName(
            Context context) {

        return this.list_ParamName.get(context);
    }

    private StringValue getDirectivesName(
            Context context) {

        return this.list_DirectivesName.get(context);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setDirectivesInitVerification(this);
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

        StringBuilder sb0 = new StringBuilder();

        sb0.append("if(");
        sb0.append(buildDirectivesName(context));
        sb0.append(") ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    init");
        sb0.append(buildParamName(context));
        sb0.append("Directives();");
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
