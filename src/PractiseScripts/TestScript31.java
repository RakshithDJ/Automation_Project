package PractiseScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * This class defines a program that demonstrates how to read from and write to an Excel file using the Apache POI library.
 * {@link TestScript30, TestScript29}
 * @author rakshith.s
 */


public class TestScript31 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Create FileInputStream to read the Excel file from given path
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");

		// Create Workbook object from the Excel file (supports .xls and .xlsx)
		Workbook wb = WorkbookFactory.create(fis);

		// Loop to read first 4 rows (row index 0 to 3)
		for (int i = 0; i <= 3; i++) {

			// Read string value from column 0 (first column) of current row
			String value1 = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();

			// Read string value from column 1 (second column) of current row
			String value2 = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();

			// Print both values separated by colon
			System.out.println(value1 + " : " + value2);
		}

		// Create a new sheet named "TestCase" and create first row and first cell
		wb.createSheet("TestCase").createRow(0).createCell(0).setCellValue("Hello");

		// Create FileOutputStream to write data back to the same Excel file
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");

		// Write the updated workbook data into the Excel file
		wb.write(fos);

		// Close the workbook and release resources
		wb.close();

		// Excel file is updated with new sheet and data, and all resources are properly
		// closed
		System.out.println("Excel file updated successfully with new sheet and data.");
	}
}