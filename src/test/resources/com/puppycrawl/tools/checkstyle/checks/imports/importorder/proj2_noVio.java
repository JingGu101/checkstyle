/*
ImportOrder
option = inflow
groups = (default)
ordered = (default)true
separated = (default)false
separatedStaticGroups = (default)false
caseSensitive = (default)true
staticGroups = (default)
sortStaticImportsAlphabetically = (default)false
useContainerOrderingForStatic = (default)false
tokens = (default)STATIC_IMPORT


*/

package com.puppycrawl.tools.checkstyle.checks.imports.importorder;

import java.awt.Button; // ok
import static java.awt.Button.ABORT; // ok
import java.awt.Frame; // ok
import java.awt.event.ActionEvent; // ok

import javax.swing.JComponent; // violation
import static javax.swing.WindowConstants.HIDE_ON_CLOSE; // ok

public class proj2_noVio {
}
