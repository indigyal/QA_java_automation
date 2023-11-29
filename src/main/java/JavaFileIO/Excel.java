package JavaFileIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Excel {
    public static void main(String[] args) {
        readExcel();
        writeExcel();
    }
    public static void writeExcel() {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Sheet 1");

        Object[][] BookData = {
                {"Head First java","Some text in the first row",1},
                {"Head Second java","Some text in the second row",2},
                {"Head Third java","Some text in the third row",3},
                {"Head Fourth java","Some text in the fourth row",4},
                {"Head Fifth java","Some text in the fifth row",5}
        };

        int rowCount=0;

        for(Object[] abook : BookData){
            Row row = sheet.createRow(++rowCount);
            int columnCount=0;

            for(Object field : abook){
                Cell cell = row.createCell(++columnCount);
                if(field instanceof String){
                    cell.setCellValue((String)field);
                }else if(field instanceof Integer){
                    cell.setCellValue((Integer)field);
                }
            }
        }

        for(int i=0; i<BookData[0].length; i++){
            sheet.autoSizeColumn(i);
        }

        try(FileOutputStream outputStream = new FileOutputStream("/Users/indigyal/Desktop/myExcel.xlsx")){
            workbook.write(outputStream);
            workbook.close();
            System.out.println("Excel file have been written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readExcel() {

        String pathToExcel = "/Users/harsh/Desktop/mySheet.xlsx";

        try (Workbook workbook = new XSSFWorkbook(new FileInputStream(pathToExcel))) {
            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getLastRowNum();

            for (int i = 0; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    int cellCount = row.getLastCellNum();

                    for (int j = 0; j < cellCount; j++) {
                        Cell cell = row.getCell(j);

                        if (cell != null) {
                            switch (cell.getCellType()) {
                                case STRING:
                                    System.out.print(cell.getStringCellValue() + "\t");
                                    break;
                                case NUMERIC:
                                    System.out.print(cell.getNumericCellValue() + "\t");
                                    break;
                                default:
                                    System.out.print("Unsupported cell type");
                                    break;
                            }
                        }
                    }
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}