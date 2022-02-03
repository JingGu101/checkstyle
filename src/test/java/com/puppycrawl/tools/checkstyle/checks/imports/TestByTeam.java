package com.puppycrawl.tools.checkstyle.checks.imports;

import static com.google.common.truth.Truth.assertWithMessage;
import static com.puppycrawl.tools.checkstyle.checks.imports.AvoidStarImportCheck.MSG_KEY;

import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class TestByTeam
        extends AbstractModuleTestSupport {

    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/checks/imports/avoidstarimport";
    }


    @Test
    public void testDefaultOperationTest()
            throws Exception {
        final String[] expected = {
                "12:54: " + getCheckMessage(MSG_KEY, "com.puppycrawl."
                        + "tools.checkstyle.checks.imports.*"),
                "14:15: " + getCheckMessage(MSG_KEY, "java.io.*"),
                "15:17: " + getCheckMessage(MSG_KEY, "java.lang.*"),

        };

        verifyWithInlineConfigParser(
                getPath("hasViolationStar.java"),
                expected);
    }

    @Test
    public void testDefaultOperationTestAllvalid()
            throws Exception {
        final String[] expected = {
        };

        verifyWithInlineConfigParser(
                getPath("NoViolationStar.java"),
                expected);
    }

}
