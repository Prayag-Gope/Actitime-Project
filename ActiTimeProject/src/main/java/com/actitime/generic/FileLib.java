package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String Key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\repository2\\ActiTimeProject\\src\\test\\resources\\Data\\LoginData.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(Key);
		
		return data;
	}
	
	public String getExcelData(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\repository2\\ActiTimeProject\\src\\test\\resources\\Data\\testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}

}
