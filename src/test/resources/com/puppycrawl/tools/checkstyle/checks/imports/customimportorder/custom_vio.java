/*
CustomImportOrder
customImportOrderRules = STATIC###SAME_PACKAGE(3)###THIRD_PARTY_PACKAGE###STANDARD_JAVA_PACKAGE
standardPackageRegExp = (default)^(java|javax)\\.
thirdPartyPackageRegExp = com|org
specialImportsRegExp = (default)^$
separateLineBetweenGroups = (default)true
sortImportsInGroupAlphabetically = true


*/

package com.puppycrawl.tools.checkstyle.checks.imports.customimportorder;

import static java.io.File.createTempFile;
import static java.awt.Button.ABORT; // violation
import static java.awt.print.Paper.*; // violation
import static javax.swing.WindowConstants.*;

import java.awt.Button; // violation
import java.awt.Frame; // violation
import java.awt.Dialog; // violation

import com.puppycrawl.tools.checkstyle.*;

import com.google.common.collect.*;
import org.junit.*;

public class custom_vio {
}
