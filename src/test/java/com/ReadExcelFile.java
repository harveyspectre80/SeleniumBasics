package com;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.ICell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    public ReadExcelFile(String excelPath) throws Exception {
        File file = new File(excelPath);

        FileInputStream fis = new FileInputStream(file);
        this.workbook = new XSSFWorkbook(fis);

    }

    public String getData(int sheetNumber, int row, int column) {
        this.sheet = this.workbook.getSheetAt(0);
        Cell cell = this.sheet.getRow(row).getCell(column);
        cell.setCellType(CellType.STRING);
        String data = cell.getStringCellValue();
        return data;
    }

    public int getRowCount(int sheetIndex) {
        int rowNum = this.workbook.getSheetAt(sheetIndex).getLastRowNum();
        ++rowNum;
        return rowNum;
    }
}

