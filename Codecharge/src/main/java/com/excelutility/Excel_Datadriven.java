package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Excel_Datadriven {
	WebDriver driver;
	//constructor
	public Excel_Datadriven(WebDriver driver)
	{
		this.driver=driver;
	}
		public String excel_priority(int a) throws IOException {
			FileInputStream fil = new FileInputStream(new File("C:\\Users\\home\\eclipse-workspace\\Codecharge\\src\\test\\resources\\testdata\\Codecharge.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook (fil);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int count = sheet.getLastRowNum();
			System.out.println(count);
			
			XSSFRow row = sheet.getRow(a);
			XSSFCell cell = row.getCell(0);
			String priority =  cell.getStringCellValue();
			
			return priority;
			
		}
}