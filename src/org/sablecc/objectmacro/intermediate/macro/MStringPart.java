/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MStringPart
        extends Macro {

    private DSeparator TextSeparator;

    private DBeforeFirst TextBeforeFirst;

    private DAfterLast TextAfterLast;

    private DNone TextNone;

    final List<String> list_Text;

    final Context TextContext = new Context();

    final StringValue TextValue;

    MStringPart(
            Macros macros) {

        setMacros(macros);
        this.list_Text = new LinkedList<>();

        this.TextValue = new StringValue(this.list_Text, this.TextContext);
    }

    public void addAllText(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Text");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Text");
            }

            this.list_Text.add(string);
        }
    }

    public void addText(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Text");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Text.add(string);
    }

    private String buildText() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Text;

        int i = 0;
        int nb_strings = strings.size();

        if (this.TextNone != null) {
            sb.append(this.TextNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.TextBeforeFirst != null) {
                string = this.TextBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.TextAfterLast != null) {
                string = this.TextAfterLast.apply(i, string, nb_strings);
            }

            if (this.TextSeparator != null) {
                string = this.TextSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    StringValue getText() {

        return this.TextValue;
    }

    private void initTextDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setStringPart(this);
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

        initTextDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("'");
        sb0.append(buildText());
        sb0.append("'");

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
