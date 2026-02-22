package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public ExcelDataProvider() {
		
		File src=new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to read Excel file:" +e.getMessage());
		
		}
	}
	public void getStringData(int sheetIndex, int row, int column)
	{
		wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public void getStringData(String sheetName, int row, int column)
	{
		wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	public double getNumericData(String sheetName, int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}

