package com;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDataConfig {

    XSSFWorkbook xssfWorkbook;
    XSSFSheet xssfSheet;

    public  ExcelDataConfig(String excelPath) throws IOException {
        File src = new File(excelPath);
        FileInputStream fi = new FileInputStream(src);
        xssfWorkbook = new XSSFWorkbook(fi);
    }

    public String getData(int sheetnumber,int row,int col)
    {
       xssfSheet = xssfWorkbook.getSheetAt(0);
       String data = xssfSheet.getRow(row).getCell(col).getStringCellValue();
       return data;
    }

    public int getRowCount(int sheetIndex)
    {
        int row = xssfWorkbook.getSheetAt(0).getLastRowNum();
        row= row + 1;
        return  row;

    }
}
