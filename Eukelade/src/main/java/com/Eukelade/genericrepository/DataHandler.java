package com.Eukelade.genericrepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataHandler {
	private static FileInputStream fis;
	private static Properties pobj=new Properties();
	private static Workbook book;
	public String getDataFromProperty(String key) throws Exception
	{
		 fis=new FileInputStream(AutomationConstants.PROP_PATH);
		pobj.load(fis);
		return pobj.getProperty(key);
	}
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Exception, IOException
	{
		 fis=new FileInputStream(AutomationConstants.EXCEL_PATH);
		 book=WorkbookFactory.create(fis);
		 return book.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		 
	}

}
