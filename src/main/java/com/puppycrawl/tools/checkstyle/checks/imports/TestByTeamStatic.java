
package com.puppycrawl.tools.checkstyle.checks.imports;

import static com.google.common.truth.Truth.assertWithMessage;
import static com.puppycrawl.tools.checkstyle.checks.imports.AvoidStaticImportCheck.MSG_KEY;

import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class TestByTeamStatic
        extends AbstractModuleTestSupport {

    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/checks/imports/avoidstaticimport";
    }



    @Test
    public void testDefaultOperationStaticVio()
            throws Exception {
        final String[] expected = {
                "26:27: " + getCheckMessage(MSG_KEY, "java.io.File.listRoots"),
                "28:42: " + getCheckMessage(MSG_KEY, "javax.swing.WindowConstants.*"),
                "29:27: " + getCheckMessage(MSG_KEY, "java.io.File.createTempFile"),
                "30:27: " + getCheckMessage(MSG_KEY, "java.io.File.pathSeparator"),
                "31:29: " + getCheckMessage(MSG_KEY, "java.lang.Math.E"),
                "32:29: " + getCheckMessage(MSG_KEY, "java.lang.Math.sqrt"),
                "33:113: " + getCheckMessage(MSG_KEY,
                        "com.puppycrawl.tools.checkstyle.checks.imports."
                                + "avoidstaticimport.InputAvoidStaticImportNestedClass.InnerClass"),
                "34:124: " + getCheckMessage(MSG_KEY,
                        "com.puppycrawl.tools.checkstyle.checks.imports."
                                + "avoidstaticimport.InputAvoidStaticImportNestedClass.InnerClass.one"),
        };

        verifyWithInlineConfigParser(
                getPath("StaticWithVio.java"), expected);
    }

    @Test
    public void testDefaultOperationWithoutStaticVio()
            throws Exception {
        final String[] expected = {

        };

        verifyWithInlineConfigParser(
                getPath("StaticWithoutVio.java"), expected);
    }

}

