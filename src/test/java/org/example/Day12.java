package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day12 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Khaled Zaman\\OneDrive\\Desktop\\pc_backup\\NK TECH Solutions\\Automation\\pdf\\testing.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet st = wb.getSheet("Sheet1");
            Row r = st.getRow(0);
            Cell c = r.getCell(0);

            System.out.println(c);

            wb.close();
            fis.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
