package com.puppycrawl.tools.checkstyle.checks.imports;
import static org.mockito.Mockito.*;
import static com.google.common.truth.Truth.assertThat;


import com.puppycrawl.tools.checkstyle.DetailAstImpl;

import org.junit.jupiter.api.Test;



public class proj5_mock {

    @Test
    public void Test_mock(){
        DetailAstImpl detailAST = mock(DetailAstImpl.class);

        when(detailAST.getChildCount()).thenReturn(5);
        AvoidStaticImportCheck asic = new AvoidStaticImportCheck();
        assertThat(asic.getNumOfDetailAST(detailAST)).isEqualTo(5);

        when(detailAST.getChildCount()).thenReturn(6);
        assertThat(asic.getNumOfDetailAST(detailAST)).isEqualTo(6);

        verify(detailAST,times(2)).getChildCount();
    }
}
