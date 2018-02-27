/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MIsBuilt {

    private final String pMacroName;

    private final MIsBuilt mIsBuilt = this;

    public MIsBuilt(
            String pMacroName) {

        if (pMacroName == null) {
            throw new NullPointerException();
        }
        this.pMacroName = pMacroName;
    }

    String pMacroName() {

        return this.pMacroName;
    }

    private String rMacroName() {

        return this.mIsBuilt.pMacroName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("        if(this.build_state != null){");
        sb.append(System.getProperty("line.separator"));
        sb.append("            throw ObjectMacroException.cannotModify(\"");
        sb.append(rMacroName());
        sb.append("\");");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}