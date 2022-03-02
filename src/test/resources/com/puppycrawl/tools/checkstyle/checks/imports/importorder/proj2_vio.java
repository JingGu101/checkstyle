/*
ImportOrder
option = inflow
groups = (default) false
ordered = (default)true
separated = (default)false
separatedStaticGroups = (default)false
caseSensitive = (default)true
staticGroups = (default)
sortStaticImportsAlphabetically = (default)false
useContainerOrderingForStatic = (default)false
tokens = (default)STATIC_IMPORT


*/

//non-compiled with javac: contains specially crafted set of imports for testing
package com.puppycrawl.tools.checkstyle.checks.imports.importorder;
import java.awt.Button; // ok
import java.awt.Frame; // ok
import java.awt.Dialog; // violation
import java.awt.event.ActionEvent; // ok
import static java.awt.Button.ABORT // ok
        ;
import javax.swing.JComponent; // ok
import javax.swing.JTable; // ok
import java.io.File; // ok
import static java.io.File.createTempFile; // ok
import java.io.IOException; // violation
import java.io.InputStream; // ok
import java.io.Reader; // ok
import static javax.swing.WindowConstants.*; // violation
public class proj2_vio {
}

