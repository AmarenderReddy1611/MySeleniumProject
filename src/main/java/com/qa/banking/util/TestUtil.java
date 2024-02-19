package com.qa.banking.util;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;

import static com.qa.banking.Base.TestBase.driver;

public class TestUtil {
    public TestUtil(){
        PageFactory.initElements(driver,this);
    }
    public static long IMPLICIT_WAIT = 10;
    public static long PAGE_LOAD_TIME = 30;

    public static String TEST_DATA_SHEET = "C:\\Users\\USER\\IdeaProjects\\MyMavenProject\\src\\main\\java\\com\\qa\\banking\\util\\TestData.xlsx";
    static Workbook book;
    static Sheet sheet;


    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TEST_DATA_SHEET);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
            }
        }
        return data;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getTestData("Credentials")));
    }

}


