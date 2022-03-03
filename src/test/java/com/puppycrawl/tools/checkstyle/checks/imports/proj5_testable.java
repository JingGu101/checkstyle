package com.puppycrawl.tools.checkstyle.checks.imports;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;
import static com.puppycrawl.tools.checkstyle.checks.imports.AvoidStaticImportCheck.MSG_KEY;

import org.junit.jupiter.api.Test;


import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;
public class proj5_testable extends AbstractModuleTestSupport {
    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/checks/imports/avoidstaticimport";
    }


    @Test
    public void Test_testable()
            throws Exception {
        AvoidStaticImportCheck asict = new AvoidStaticImportCheck();
        asict.setExcludes("java.io.File.listRoots");
        boolean flag1 = asict.Proj5_isExempt("java.io.File.listRoots");
        boolean flag2 = asict.Proj5_isExempt("org.junit.jupiter.api.Test");
        assertThat(flag1).isEqualTo(true);
        assertThat(flag2).isEqualTo(false);
    }
}
