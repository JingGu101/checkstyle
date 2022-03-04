package com.puppycrawl.tools.checkstyle.checks.imports;

import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;
import org.junit.jupiter.api.Test;

import static com.puppycrawl.tools.checkstyle.checks.imports.AvoidStaticImportCheck.MSG_KEY;
import static com.puppycrawl.tools.checkstyle.checks.imports.CustomImportOrderCheck.MSG_LEX;
import static com.puppycrawl.tools.checkstyle.checks.imports.CustomImportOrderCheck.MSG_ORDER;

public class proj1_custom extends AbstractModuleTestSupport {

    /** Shortcuts to make code more compact. */
    private static final String STATIC = CustomImportOrderCheck.STATIC_RULE_GROUP;
    private static final String SAME = CustomImportOrderCheck.SAME_PACKAGE_RULE_GROUP;
    private static final String THIRD = CustomImportOrderCheck.THIRD_PARTY_PACKAGE_RULE_GROUP;
    private static final String STD = CustomImportOrderCheck.STANDARD_JAVA_PACKAGE_RULE_GROUP;
    private static final String SPECIAL = CustomImportOrderCheck.SPECIAL_IMPORTS_RULE_GROUP;

    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/checks/imports/customimportorder";
    }

    @Test
    public void testhasvio()
            throws Exception {
        final String[] expected = {
                "16:1: " + getCheckMessage(MSG_LEX, "java.awt.Button.ABORT",
                        "java.io.File.createTempFile"),
                "17:1: " + getCheckMessage(MSG_LEX, "java.awt.print.Paper.*",
                        "java.io.File.createTempFile"),
                "20:1: " + getCheckMessage(MSG_ORDER, STD, SAME, "java.awt.Button"),
                "21:1: " + getCheckMessage(MSG_ORDER, STD, SAME, "java.awt.Frame"),
                "22:1: " + getCheckMessage(MSG_ORDER, STD, SAME, "java.awt.Dialog"),
        };

        verifyWithInlineConfigParser(
                getPath("custom_vio.java"), expected);
    }
    @Test
    public void testnovio()
            throws Exception {
        final String[] expected = {

        };
        verifyWithInlineConfigParser(
                getPath("custom_novio.java"), expected);
    }

}
