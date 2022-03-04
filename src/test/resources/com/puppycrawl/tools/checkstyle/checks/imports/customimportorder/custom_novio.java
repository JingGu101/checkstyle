/*
CustomImportOrder
customImportOrderRules = STATIC###STANDARD_JAVA_PACKAGE###THIRD_PARTY_PACKAGE



*/

package com.puppycrawl.tools.checkstyle.checks.imports.customimportorder;

import static java.awt.print.Paper.*; // OK

import java.time.*; // OK
import javax.net.*; // OK

import org.apache.commons.io.FileUtils; // OK
import com.puppycrawl.tools.checkstyle.checks.imports.CustomImportOrderCheck; // OK
import com.puppycrawl.tools.checkstyle.checks.imports.ImportOrderCheck; // OK

public class custom_novio {
}
