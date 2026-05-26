package com.orange.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib implements IAutoConstant {

	public String readPropertyData(String PROPERTIES_PATH, String keyName) throws IOException {
		FileInputStream fis = new FileInputStream(PROPERTIES_PATH);
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(keyName);
		return data;
	}

	public String readExcelData(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook w = WorkbookFactory.create(fis);
		String data = w.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void writeExcelData(String Sheetname, int row, int cell, String value)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook w = WorkbookFactory.create(fis);
		w.getSheet(Sheetname).getRow(row).getCell(cell).setCellValue(value);
        FileOutputStream fos = new FileOutputStream(EXCEL_PATH);
        w.write(fos);
        w.close();
	}

}
