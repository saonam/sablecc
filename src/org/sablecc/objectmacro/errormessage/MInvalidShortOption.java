/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

import java.util.*;

public class MInvalidShortOption
        extends Macro {

    private DSeparator OptionNameSeparator;

    private DBeforeFirst OptionNameBeforeFirst;

    private DAfterLast OptionNameAfterLast;

    private DNone OptionNameNone;

    final List<String> list_OptionName;

    final Context OptionNameContext = new Context();

    final StringValue OptionNameValue;

    MInvalidShortOption(
            Macros macros) {

        setMacros(macros);
        this.list_OptionName = new LinkedList<>();

        this.OptionNameValue
                = new StringValue(this.list_OptionName, this.OptionNameContext);
    }

    public void addAllOptionName(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("OptionName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("OptionName");
            }

            this.list_OptionName.add(string);
        }
    }

    public void addOptionName(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("OptionName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_OptionName.add(string);
    }

    private String buildOptionName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_OptionName;

        int i = 0;
        int nb_strings = strings.size();

        if (this.OptionNameNone != null) {
            sb.append(this.OptionNameNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.OptionNameBeforeFirst != null) {
                string = this.OptionNameBeforeFirst.apply(i, string,
                        nb_strings);
            }

            if (this.OptionNameAfterLast != null) {
                string = this.OptionNameAfterLast.apply(i, string, nb_strings);
            }

            if (this.OptionNameSeparator != null) {
                string = this.OptionNameSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    StringValue getOptionName() {

        return this.OptionNameValue;
    }

    private void initOptionNameDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setInvalidShortOption(this);
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

        initOptionNameDirectives();

        StringBuilder sb0 = new StringBuilder();

        MCommandLineErrorHead m1 = getMacros().newCommandLineErrorHead();

        sb0.append(m1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("The following option is rejected:");
        sb0.append(LINE_SEPARATOR);
        sb0.append(" -");
        sb0.append(buildOptionName());
        sb0.append(LINE_SEPARATOR);
        sb0.append("It is not a valid option.");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        MCommandLineErrorTail m2 = getMacros().newCommandLineErrorTail();

        sb0.append(m2.build(null));

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
