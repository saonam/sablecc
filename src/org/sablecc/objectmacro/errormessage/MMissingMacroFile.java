/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

import java.util.*;

public class MMissingMacroFile
        extends Macro {

    private DSeparator FileNameSeparator;

    private DBeforeFirst FileNameBeforeFirst;

    private DAfterLast FileNameAfterLast;

    private DNone FileNameNone;

    final List<String> list_FileName;

    final Context FileNameContext = new Context();

    final StringValue FileNameValue;

    MMissingMacroFile(
            Macros macros) {

        setMacros(macros);
        this.list_FileName = new LinkedList<>();

        this.FileNameValue
                = new StringValue(this.list_FileName, this.FileNameContext);
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

    StringValue getFileName() {

        return this.FileNameValue;
    }

    private void initFileNameDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setMissingMacroFile(this);
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

        StringBuilder sb0 = new StringBuilder();

        MCommandLineErrorHead m1 = getMacros().newCommandLineErrorHead();

        sb0.append(m1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("The macro file, \"");
        sb0.append(buildFileName());
        sb0.append("\", does not exist.");
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
