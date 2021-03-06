/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

import java.util.*;

public class MIncorrectNumberArgument
        extends Macro {

    private DSeparator LineSeparator;

    private DBeforeFirst LineBeforeFirst;

    private DAfterLast LineAfterLast;

    private DNone LineNone;

    final List<String> list_Line;

    final Context LineContext = new Context();

    final StringValue LineValue;

    private DSeparator CharSeparator;

    private DBeforeFirst CharBeforeFirst;

    private DAfterLast CharAfterLast;

    private DNone CharNone;

    final List<String> list_Char;

    final Context CharContext = new Context();

    final StringValue CharValue;

    private DSeparator ExpectedCountSeparator;

    private DBeforeFirst ExpectedCountBeforeFirst;

    private DAfterLast ExpectedCountAfterLast;

    private DNone ExpectedCountNone;

    final List<String> list_ExpectedCount;

    final Context ExpectedCountContext = new Context();

    final StringValue ExpectedCountValue;

    private DSeparator CurrentCountSeparator;

    private DBeforeFirst CurrentCountBeforeFirst;

    private DAfterLast CurrentCountAfterLast;

    private DNone CurrentCountNone;

    final List<String> list_CurrentCount;

    final Context CurrentCountContext = new Context();

    final StringValue CurrentCountValue;

    private DSeparator VersionSeparator;

    private DBeforeFirst VersionBeforeFirst;

    private DAfterLast VersionAfterLast;

    private DNone VersionNone;

    final List<String> list_Version;

    final Context VersionContext = new Context();

    final StringValue VersionValue;

    MIncorrectNumberArgument(
            Macros macros) {

        setMacros(macros);
        this.list_Line = new LinkedList<>();
        this.list_Char = new LinkedList<>();
        this.list_ExpectedCount = new LinkedList<>();
        this.list_CurrentCount = new LinkedList<>();
        this.list_Version = new LinkedList<>();

        this.LineValue = new StringValue(this.list_Line, this.LineContext);
        this.CharValue = new StringValue(this.list_Char, this.CharContext);
        this.ExpectedCountValue = new StringValue(this.list_ExpectedCount,
                this.ExpectedCountContext);
        this.CurrentCountValue = new StringValue(this.list_CurrentCount,
                this.CurrentCountContext);
        this.VersionValue
                = new StringValue(this.list_Version, this.VersionContext);
    }

    public void addAllLine(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Line");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Line");
            }

            this.list_Line.add(string);
        }
    }

    public void addLine(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Line");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Line.add(string);
    }

    public void addAllChar(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Char");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Char");
            }

            this.list_Char.add(string);
        }
    }

    public void addChar(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Char");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Char.add(string);
    }

    public void addAllExpectedCount(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("ExpectedCount");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("ExpectedCount");
            }

            this.list_ExpectedCount.add(string);
        }
    }

    public void addExpectedCount(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("ExpectedCount");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_ExpectedCount.add(string);
    }

    public void addAllCurrentCount(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("CurrentCount");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("CurrentCount");
            }

            this.list_CurrentCount.add(string);
        }
    }

    public void addCurrentCount(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("CurrentCount");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_CurrentCount.add(string);
    }

    public void addAllVersion(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("Version");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("Version");
            }

            this.list_Version.add(string);
        }
    }

    public void addVersion(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("Version");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_Version.add(string);
    }

    private String buildLine() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Line;

        int i = 0;
        int nb_strings = strings.size();

        if (this.LineNone != null) {
            sb.append(this.LineNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.LineBeforeFirst != null) {
                string = this.LineBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.LineAfterLast != null) {
                string = this.LineAfterLast.apply(i, string, nb_strings);
            }

            if (this.LineSeparator != null) {
                string = this.LineSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildChar() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Char;

        int i = 0;
        int nb_strings = strings.size();

        if (this.CharNone != null) {
            sb.append(this.CharNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.CharBeforeFirst != null) {
                string = this.CharBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.CharAfterLast != null) {
                string = this.CharAfterLast.apply(i, string, nb_strings);
            }

            if (this.CharSeparator != null) {
                string = this.CharSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildExpectedCount() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_ExpectedCount;

        int i = 0;
        int nb_strings = strings.size();

        if (this.ExpectedCountNone != null) {
            sb.append(this.ExpectedCountNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.ExpectedCountBeforeFirst != null) {
                string = this.ExpectedCountBeforeFirst.apply(i, string,
                        nb_strings);
            }

            if (this.ExpectedCountAfterLast != null) {
                string = this.ExpectedCountAfterLast.apply(i, string,
                        nb_strings);
            }

            if (this.ExpectedCountSeparator != null) {
                string = this.ExpectedCountSeparator.apply(i, string,
                        nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildCurrentCount() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_CurrentCount;

        int i = 0;
        int nb_strings = strings.size();

        if (this.CurrentCountNone != null) {
            sb.append(this.CurrentCountNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.CurrentCountBeforeFirst != null) {
                string = this.CurrentCountBeforeFirst.apply(i, string,
                        nb_strings);
            }

            if (this.CurrentCountAfterLast != null) {
                string = this.CurrentCountAfterLast.apply(i, string,
                        nb_strings);
            }

            if (this.CurrentCountSeparator != null) {
                string = this.CurrentCountSeparator.apply(i, string,
                        nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildVersion() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_Version;

        int i = 0;
        int nb_strings = strings.size();

        if (this.VersionNone != null) {
            sb.append(this.VersionNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.VersionBeforeFirst != null) {
                string = this.VersionBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.VersionAfterLast != null) {
                string = this.VersionAfterLast.apply(i, string, nb_strings);
            }

            if (this.VersionSeparator != null) {
                string = this.VersionSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    StringValue getLine() {

        return this.LineValue;
    }

    StringValue getChar() {

        return this.CharValue;
    }

    StringValue getExpectedCount() {

        return this.ExpectedCountValue;
    }

    StringValue getCurrentCount() {

        return this.CurrentCountValue;
    }

    StringValue getVersion() {

        return this.VersionValue;
    }

    private void initLineDirectives() {

    }

    private void initCharDirectives() {

    }

    private void initExpectedCountDirectives() {

    }

    private void initCurrentCountDirectives() {

    }

    private void initVersionDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(" in version: ");
        this.VersionBeforeFirst = new DBeforeFirst(sb1.toString());
        this.VersionValue.setBeforeFirst(this.VersionBeforeFirst);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setIncorrectNumberArgument(this);
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

        initLineDirectives();
        initCharDirectives();
        initExpectedCountDirectives();
        initCurrentCountDirectives();
        initVersionDirectives();

        StringBuilder sb0 = new StringBuilder();

        MSemanticErrorHead m1 = getMacros().newSemanticErrorHead();

        sb0.append(m1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("Line: ");
        sb0.append(buildLine());
        sb0.append(LINE_SEPARATOR);
        sb0.append("Char: ");
        sb0.append(buildChar());
        sb0.append(LINE_SEPARATOR);
        sb0.append("The macro reference has ");
        sb0.append(buildCurrentCount());
        sb0.append(" arguments, instead of ");
        sb0.append(buildExpectedCount());
        sb0.append(" arguments");
        sb0.append(buildVersion());
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
