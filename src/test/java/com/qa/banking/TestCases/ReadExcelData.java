package com.qa.banking.TestCases;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelData {
    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\USER\\IdeaProjects\\MyMavenProject\\src\\main\\java\\com\\qa\\banking\\util\\TestData.xlsx";
        //create object of workbook
        FileInputStream fis= new FileInputStream(address);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //create object of the sheet and allocate the particular sheet
        int numberofSheets = workbook.getNumberOfSheets();
        XSSFSheet sheet = null;
        for(int i = 0;i<numberofSheets;i++){
            if(workbook.getSheetName(i).equals("Credentials")){
                sheet = workbook.getSheetAt(i);
            }
        }
        assert sheet != null;
        for (Row row : sheet) {
            Iterator<Cell> itCell = row.cellIterator();
            while (itCell.hasNext()) {
                Cell cellvalue = (Cell) itCell.next();
                System.out.println(cellvalue.getStringCellValue());
            }
        }





    }
}
