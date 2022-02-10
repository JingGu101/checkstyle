package com.puppycrawl.tools.checkstyle.checks.imports;


import static com.google.common.truth.Truth.assertWithMessage;
import static com.puppycrawl.tools.checkstyle.checks.imports.ImportOrderCheck.MSG_ORDERING;
import static com.puppycrawl.tools.checkstyle.checks.imports.ImportOrderCheck.MSG_SEPARATED_IN_GROUP;
import static com.puppycrawl.tools.checkstyle.checks.imports.ImportOrderCheck.MSG_SEPARATION;

import org.antlr.v4.runtime.CommonToken;
import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import com.puppycrawl.tools.checkstyle.DetailAstImpl;
import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;
import com.puppycrawl.tools.checkstyle.internal.utils.TestUtil;
import com.puppycrawl.tools.checkstyle.utils.CommonUtil;

public class proj2_importOrderTest extends AbstractModuleTestSupport {

    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/checks/imports/importorder";
    }


    @Test
    public void proj_TestNoVio() throws Exception {

        final String[] expected = {

        };

        verifyWithInlineConfigParser(
                getNonCompilablePath("proj2_noVio.java"), expected);
    }
    @Test

    public void proj_TestVio() throws Exception {
        final String[] expected = {
                "21:1: " + getCheckMessage(MSG_ORDERING, "java.awt.Dialog"), "29:1: " + getCheckMessage(MSG_ORDERING, "java.io.IOException"), "32:1: " + getCheckMessage(MSG_ORDERING, "javax.swing.WindowConstants.*"),
        };

        verifyWithInlineConfigParser(
                getNonCompilablePath("proj2_vio.java"), expected);
    }



}
