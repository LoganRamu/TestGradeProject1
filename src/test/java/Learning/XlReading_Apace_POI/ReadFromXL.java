package Learning.XlReading_Apace_POI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ReadFromXL {
    public static void main(String[] args) throws IOException {
        {
            XSSFWorkbook workbook = new XSSFWorkbook("TestData.xlsx");
            XSSFSheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i <= 2; i++) {
                XSSFRow row = sheet.getRow(i);
                for (int j = 0; j < 2; j++) {
                    XSSFCell cell = row.getCell(j);
                    String user = cell.getStringCellValue();
                    System.out.println(user);
                }
            }
            workbook.close();

        }
    }
}




