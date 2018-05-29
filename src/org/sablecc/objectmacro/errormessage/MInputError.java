/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

import java.util.*;

public class MInputError
        extends Macro {

    private DSeparator FileNameSeparator;

    private DBeforeFirst FileNameBeforeFirst;

    private DAfterLast FileNameAfterLast;

    private DNone FileNameNone;

    final List<String> list_FileName;

    final Context FileNameContext = new Context();

    final StringValue FileNameValue;

    private DSeparator MessageSeparator;

    private DBeforeFirst MessageBeforeFirst;

    private DAfterLast MessageAfterLast;

    private DNone MessageNone;

    final List<String> list_Message;

    final Context MessageContext = new Context();

    final StringValue MessageValue;

    MInputError(
            Macros macros) {

        setMacros(macros);
        this.list_FileName = new LinkedList<>();
        this.list_Message = new LinkedList<>();

        this.FileNameValue
                = new StringValue(this.list_FileName, this.FileNameContext);
        this.MessageValue
                = new StringValue(this.list_Message, this.MessageContext);
    }

    public void addAllFileName(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("FileName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("FileName");
            }

            this.list_FileName.add(string);
        }
    }

    public void addFileName(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("FileName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_FileName.add(string);
    }

    public void addAllMessage(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Message");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Message");
            }

            this.list_Message.add(string);
        }
    }

    public void addMessage(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Message");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Message.add(string);
    }

    private String buildFileName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_FileName;

        int i = 0;
        int nb_strings = strings.size();

        if (this.FileNameNone != null) {
            sb.append(this.FileNameNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.FileNameBeforeFirst != null) {
                string = this.FileNameBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.FileNameAfterLast != null) {
                string = this.FileNameAfterLast.apply(i, string, nb_strings);
            }

            if (this.FileNameSeparator != null) {
                string = this.FileNameSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildMessage() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Message;

        int i = 0;
        int nb_strings = strings.size();

        if (this.MessageNone != null) {
            sb.append(this.MessageNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.MessageBeforeFirst != null) {
                string = this.MessageBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.MessageAfterLast != null) {
                string = this.MessageAfterLast.apply(i, string, nb_strings);
            }

            if (this.MessageSeparator != null) {
                string = this.MessageSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    StringValue getFileName() {

        return this.FileNameValue;
    }

    StringValue getMessage() {

        return this.MessageValue;
    }

    private void initFileNameDirectives() {

    }

    private void initMessageDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setInputError(this);
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

        initFileNameDirectives();
        initMessageDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("*** I/O ERROR ***");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("The following system error happened while reading \"");
        sb0.append(buildFileName());
        sb0.append("\":");
        sb0.append(LINE_SEPARATOR);
        sb0.append(" ");
        sb0.append(buildMessage());
        sb0.append(".");

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
