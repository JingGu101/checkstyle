package com.puppycrawl.tools.checkstyle.gui;

import com.google.common.collect.ImmutableList;
import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;
import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.DetailNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


import static com.google.common.truth.Truth.assertWithMessage;

import java.util.ArrayList;
import java.util.List;


public class Proj3_Test extends AbstractModuleTestSupport {

    private MainFrameModel model;
    private DetailAST tree;
    private ImmutableList<Integer> linesToPosition;

    @BeforeEach
    public void loadFile() throws Exception {
        model = new MainFrameModel();
        model.setParseMode(MainFrameModel.ParseMode.JAVA_WITH_JAVADOC_AND_COMMENTS);
        model.openFile(new File(getPath("InputCodeSelectorPresentation.java")));
        tree = ((DetailAST) model.getParseTreeTableModel().getRoot())
                .getFirstChild().getNextSibling();
        linesToPosition = ImmutableList.copyOf(convertLinesToPosition(model.getLinesToPosition()));
    }


    @BeforeEach
    public void prepareTestData() throws IOException {
        model = new MainFrameModel();
    }

    private static List<Integer> convertLinesToPosition(List<Integer> systemLinesToPosition) {

        final List<Integer> convertedLinesToPosition = new ArrayList<>();
        final int lineSeparationCorrection = System.lineSeparator().length() - 1;
        convertedLinesToPosition.add(0, systemLinesToPosition.get(0));
        for (int i = 1; i < systemLinesToPosition.size(); i++) {
            convertedLinesToPosition.add(i,
                    systemLinesToPosition.get(i) - lineSeparationCorrection * (i - 1));
        }
        return convertedLinesToPosition;
    }

    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/gui/codeselectorpresentation";
    }

    @Test
    public void TestColumnCount(){
        int num = model.getParseTreeTableModel().getColumnCount();
        assertWithMessage("Invalid Column Count").that(num).isEqualTo(5);
    }

    @Test
    public void TestColumnName0(){
        String name = model.getParseTreeTableModel().getColumnName(0);
        assertWithMessage("Invalid 1st Column").that(name).isEqualTo("Tree");
    }

    @Test
    public void TestColumnClass0(){
        Class name = model.getParseTreeTableModel().getColumnClass(0);
        assertWithMessage("Invalid 1st Column Class").that(name.toString()).isEqualTo("class com.puppycrawl.tools.checkstyle.gui.ParseTreeTableModel");
    }

    @Test
    public void testGetValueAtNode() {

        final DetailNode testNode = (DetailNode) model.getParseTreeTableModel()
                .getValueAt(tree.getFirstChild(), 0);
        assertWithMessage("Invalid Get value at node")
                .that(testNode)
                .isEqualTo(null);

    }

    @Test
    public void TestChildCount(){
        int num = model.getParseTreeTableModel().getChildCount(model.getParseTreeTableModel().getRoot());
        assertWithMessage("Invalid Child Count").that(num).isEqualTo(2);
    }
    @Test
    public void TestIsLeaf(){
        boolean flag = model.getParseTreeTableModel().isLeaf(model.getParseTreeTableModel().getRoot());
        assertWithMessage("Invalid check is leaf").that(flag).isEqualTo(false);
    }
    @Test
    public void TestIsEditable(){
        boolean flag = model.getParseTreeTableModel().isCellEditable(0);
        assertWithMessage("Invalid column is editable").that(flag).isEqualTo(false);
    }

}
