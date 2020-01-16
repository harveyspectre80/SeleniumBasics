//package generic;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class Lib implements IAutoConstant
//{
//    public static Workbook workbook;
//    public static String getProperty(String CONFIG_PATH, String key) throws IOException {
//        String property = " ";
//        Properties properties = new Properties();
//
//        properties.load(new FileInputStream(CONFIG_PATH));
//        property = properties.getProperty(key);
//        return property;
//    }
//
//    public static int getRowCount(String EXCEL_PATH, String sheet) throws IOException, InvalidFormatException {
//        int rowCount = 0;
//        workbook = WorkbookFactory.create(new FileInputStream("EXCEL_PATH"));
//        rowCount = workbook.getSheet(sheet).getLastRowNum();
//        return  rowCount;
//    }
//
//    public static String getCellvalue(String EXCEL_PATH, String sheet, int row, int col) throws IOException, InvalidFormatException {
//        String value = " ";
//        workbook = WorkbookFactory.create(new FileInputStream("EXCEL_PATH"));
//        value = workbook.getSheet(sheet).getRow(row).getCell(col).toString();
//        return  value;
//    }
//
//}
