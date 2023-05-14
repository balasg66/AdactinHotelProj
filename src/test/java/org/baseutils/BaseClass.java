package org.baseutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	@BeforeTest
	public void browserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void dropDown(WebElement ele, String value)
	{
		Select drp=new Select(ele);
		
		List<WebElement> options = drp.getOptions();
		
		for (WebElement op : options) {
			
			if(op.getText().equals(value))
			{
				op.click();
			}
		}
	}
	
	public static String readStr(String sheetname,int rowNum, int cellNum) throws FileNotFoundException, IOException
	{
		
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Hotel.xlsx");
		FileInputStream input=new FileInputStream(f);
		 workbook=new XSSFWorkbook(input);
		sheet=workbook.getSheet(sheetname);
	
		String stringCellValue = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		System.out.println(stringCellValue);
		return stringCellValue;
	}
	public static int readInt(int rowNum, int cellNum) throws FileNotFoundException, IOException
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Hotel.xlsx");
		FileInputStream input=new FileInputStream(f);
		 workbook=new XSSFWorkbook(input);
		sheet=workbook.getSheet("Sheet1");

		double numericCellValue = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
		System.out.println(numericCellValue);
		return (int)numericCellValue;
	}
	public static void write(String attr) throws IOException
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Hotel.xlsx");
		FileInputStream input=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
				
		XSSFRow row=sheet.getRow(4);
		row.createCell(0).setCellValue(attr);
		
		
		FileOutputStream output=new FileOutputStream(f);
		workbook.write(output);
		workbook.close();
		output.close();
	}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	
}
