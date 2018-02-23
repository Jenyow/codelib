package com.codelib.java.sample.poi.util;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ExcelUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testDealExcel() {
        String filePath = "E:\\git\\codelib\\codelib-parent\\codelib-java-samples\\codelib-java-sample-poi\\src\\test\\java\\com\\codelib\\java\\sample\\poi\\util\\admin_keyan_template 29.xls";
        try {
            List<String[]> records = ExcelUtil.dealExcel(filePath, "xls", "论文", 0, 0, 7);
            for (String[] record: records) {
                for (String str : record) {
                    System.out.print(str + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
