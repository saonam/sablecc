/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MAppliedVersion
        extends Macro {

    private DSeparator VersionsSeparator;

    private DBeforeFirst VersionsBeforeFirst;

    private DAfterLast VersionsAfterLast;

    private DNone VersionsNone;

    final List<String> list_Versions;

    final Context VersionsContext = new Context();

    final StringValue VersionsValue;

    MAppliedVersion(
            Macros macros) {

        setMacros(macros);
        this.list_Versions = new LinkedList<>();

        this.VersionsValue
                = new StringValue(this.list_Versions, this.VersionsContext);
    }

    public void addAllVersions(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Versions");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Versions");
            }

            this.list_Versions.add(string);
        }
    }

    public void addVersions(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Versions");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Versions.add(string);
    }

    private String buildVersions() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Versions;

        int i = 0;
        int nb_strings = strings.size();

        if (this.VersionsNone != null) {
            sb.append(this.VersionsNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.VersionsBeforeFirst != null) {
                string = this.VersionsBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.VersionsAfterLast != null) {
                string = this.VersionsAfterLast.apply(i, string, nb_strings);
            }

            if (this.VersionsSeparator != null) {
                string = this.VersionsSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    StringValue getVersions() {

        return this.VersionsValue;
    }

    private void initVersionsDirectives() {

        StringBuilder sb3 = new StringBuilder();
        sb3.append(", ");
        this.VersionsSeparator = new DSeparator(sb3.toString());
        this.VersionsValue.setSeparator(this.VersionsSeparator);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setAppliedVersion(this);
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

        initVersionsDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("// Class applied to version(s) : ");
        sb0.append(buildVersions());

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
