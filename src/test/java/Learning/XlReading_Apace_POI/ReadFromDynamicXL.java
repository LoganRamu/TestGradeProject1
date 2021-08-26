package Learning.XlReading_Apace_POI;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadFromDynamicXL {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("TestData.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        int lastRow = sheet.getLastRowNum();//Exclude header
        int phyLatRow = sheet.getPhysicalNumberOfRows();//Including header
        int lastCellNumber = sheet.getRow(0).getLastCellNum(); //0 means ref from 1 th row, if 1, if we give
        //any values otr cells, will cause issue
        for (int i = 1; i <= lastRow; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < lastCellNumber; j++) {
                XSSFCell cell = row.getCell(j);
                DataFormatter dataFormatter = new DataFormatter();
                String user = dataFormatter.formatCellValue(cell);
                // String user = cell.getStringCellValue();
                System.out.println(user);
            }
        }
        workbook.close();
    }
}
