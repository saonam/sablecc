/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

import java.util.*;

public class MSyntaxError
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

    private DSeparator TokenTypeSeparator;

    private DBeforeFirst TokenTypeBeforeFirst;

    private DAfterLast TokenTypeAfterLast;

    private DNone TokenTypeNone;

    final List<String> list_TokenType;

    final Context TokenTypeContext = new Context();

    final StringValue TokenTypeValue;

    private DSeparator TokenTextSeparator;

    private DBeforeFirst TokenTextBeforeFirst;

    private DAfterLast TokenTextAfterLast;

    private DNone TokenTextNone;

    final List<String> list_TokenText;

    final Context TokenTextContext = new Context();

    final StringValue TokenTextValue;

    private DSeparator MessageSeparator;

    private DBeforeFirst MessageBeforeFirst;

    private DAfterLast MessageAfterLast;

    private DNone MessageNone;

    final List<String> list_Message;

    final Context MessageContext = new Context();

    final StringValue MessageValue;

    MSyntaxError(
            Macros macros) {

        setMacros(macros);
        this.list_Line = new LinkedList<>();
        this.list_Char = new LinkedList<>();
        this.list_TokenType = new LinkedList<>();
        this.list_TokenText = new LinkedList<>();
        this.list_Message = new LinkedList<>();

        this.LineValue = new StringValue(this.list_Line, this.LineContext);
        this.CharValue = new StringValue(this.list_Char, this.CharContext);
        this.TokenTypeValue
                = new StringValue(this.list_TokenType, this.TokenTypeContext);
        this.TokenTextValue
                = new StringValue(this.list_TokenText, this.TokenTextContext);
        this.MessageValue
                = new StringValue(this.list_Message, this.MessageContext);
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

    public void addAllTokenType(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("TokenType");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("TokenType");
            }

            this.list_TokenType.add(string);
        }
    }

    public void addTokenType(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("TokenType");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_TokenType.add(string);
    }

    public void addAllTokenText(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("TokenText");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("TokenText");
            }

            this.list_TokenText.add(string);
        }
    }

    public void addTokenText(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("TokenText");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_TokenText.add(string);
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

    private String buildTokenType() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_TokenType;

        int i = 0;
        int nb_strings = strings.size();

        if (this.TokenTypeNone != null) {
            sb.append(this.TokenTypeNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.TokenTypeBeforeFirst != null) {
                string = this.TokenTypeBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.TokenTypeAfterLast != null) {
                string = this.TokenTypeAfterLast.apply(i, string, nb_strings);
            }

            if (this.TokenTypeSeparator != null) {
                string = this.TokenTypeSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildTokenText() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_TokenText;

        int i = 0;
        int nb_strings = strings.size();

        if (this.TokenTextNone != null) {
            sb.append(this.TokenTextNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.TokenTextBeforeFirst != null) {
                string = this.TokenTextBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.TokenTextAfterLast != null) {
                string = this.TokenTextAfterLast.apply(i, string, nb_strings);
            }

            if (this.TokenTextSeparator != null) {
                string = this.TokenTextSeparator.apply(i, string, nb_strings);
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

    StringValue getLine() {

        return this.LineValue;
    }

    StringValue getChar() {

        return this.CharValue;
    }

    StringValue getTokenType() {

        return this.TokenTypeValue;
    }

    StringValue getTokenText() {

        return this.TokenTextValue;
    }

    StringValue getMessage() {

        return this.MessageValue;
    }

    private void initLineDirectives() {

    }

    private void initCharDirectives() {

    }

    private void initTokenTypeDirectives() {

    }

    private void initTokenTextDirectives() {

    }

    private void initMessageDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setSyntaxError(this);
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
        initTokenTypeDirectives();
        initTokenTextDirectives();
        initMessageDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("*** SYNTAX ERROR ***");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("Line: ");
        sb0.append(buildLine());
        sb0.append(LINE_SEPARATOR);
        sb0.append("Char: ");
        sb0.append(buildChar());
        sb0.append(LINE_SEPARATOR);
        sb0.append("Syntax error on unexpected ");
        sb0.append(buildTokenType());
        sb0.append(" token \"");
        sb0.append(buildTokenText());
        sb0.append("\":");
        sb0.append(LINE_SEPARATOR);
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
