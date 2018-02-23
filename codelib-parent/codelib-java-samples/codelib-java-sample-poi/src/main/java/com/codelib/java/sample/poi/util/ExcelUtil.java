package com.codelib.java.sample.poi.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelUtil {

    private final static Logger logger = LoggerFactory.getLogger(ExcelUtil.class);

    /**
     * 
     * @param filePath
     *            文件路径
     * @param type
     *            excle的类型: xls、xlsx
     * @param sheetName
     *            工作表名字
     * @param recordStartIndex
     *            开始读取行
     * @param recordSkipEnd
     *            跳过末尾读取行
     * @param rowCounts
     *            excle设置的字段列数
     * @return
     * @throws Exception
     */
    public static List<String[]> dealExcel(String filePath, String type, String sheetName, int recordStartIndex,
            int recordSkipEnd, int rowCounts) throws Exception {
        List<String[]> records = new ArrayList<>();
        String[] recordRow = null;
        InputStream is = null;
        Workbook wb = null;
        // 读Excel
        try {
            is = new FileInputStream(filePath);
            if (type.equals("xls")) {
                wb = new HSSFWorkbook(is);
            } else if (type.equals("xlsx")) {
                wb = new XSSFWorkbook(is);
            } else {
                throw new Exception("读取的不是excel文件");
            }
            int i = wb.getSheetIndex(sheetName);
            Sheet sheet = wb.getSheetAt(i);
            FormulaEvaluator evaluator = sheet.getWorkbook().getCreationHelper().createFormulaEvaluator();
            Row row = null;
            int cellSize = 0;
            Cell cell = null;
            String value = null;
            int rowSize = sheet.getLastRowNum();
            logger.info("Excel总行数:" + (rowSize + 1));
            for (int j = recordStartIndex; j <= rowSize - recordSkipEnd; j++) {// 遍历行
                row = sheet.getRow(j);
                if (row == null) {// 略过空行
                    continue;
                }
                cellSize = row.getLastCellNum();// 行中有多少个单元格，也就是有多少列
                recordRow = initStringArray(new String[rowCounts], "");// 对应一个数据行
                for (int k = 0; k < cellSize; k++) {
                    cell = row.getCell(k);
                    value = "";
                    if (cell != null) {
                        switch (cell.getCellTypeEnum()) {
                        case BLANK:
                            value = "";
                            break;
                        case BOOLEAN:
                            value = String.valueOf(cell.getBooleanCellValue());
                            break;
                        case ERROR:
                            value = String.valueOf(cell.getErrorCellValue());
                            break;
                        case FORMULA:
                            try {
                                value = evaluator.evaluate(cell).formatAsString();
                            } catch (Exception e1) {
                                try {
                                    value = String.valueOf(cell.getNumericCellValue());
                                } catch (Exception e2) {
                                    value = cell.getStringCellValue();
                                }

                            }
                            break;
                        case NUMERIC:
                            value = String.valueOf(cell.getNumericCellValue());
                            break;
                        case STRING:
                            value = cell.getStringCellValue();
                            break;
                        default:
                            value = cell.toString();
                            break;
                        }
                    }
                    recordRow[k] = value;
                }
                records.add(recordRow);
            }
        } catch (FileNotFoundException e) {
            logger.error("没找到文件:" + filePath + ",异常:" + e.toString());
        } catch (Exception e) {
            logger.error("读Excel异常:", e);
        } finally {
            if (wb != null) {
                wb.close();
            }
            if (is != null) {
                is.close();
            }
        }
        return records;
    }
    
    
    public static void writeExcel() {
        
    }

    public static String[] initStringArray(String[] arr, String defaultValue) {
        int length = arr.length;
        String[] tmpArr = new String[length];
        for (int i = 0; i < length; i++) {
            tmpArr[i] = defaultValue;
        }
        return tmpArr;
    }

}
