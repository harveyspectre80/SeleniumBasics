package com;
import com.ExcelDataConfig;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTheExcelFileData {

    public static void main(String[] args) throws IOException {
        ExcelDataConfig excelDataConfig = new ExcelDataConfig("/home/admin1/Desktop/Hemil-linux/SeleniumBasics/src/test/resources/Excel/Abc.xlsx");
        System.out.println(excelDataConfig.getData(0,0,0));
    }
}
