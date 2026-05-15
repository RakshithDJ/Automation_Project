package PractiseScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * This class defines handling multiple data from excel file using Apache POI library.
 * {@link TestScript30, TestScript31}
 * @author rakshith.s
 * @throws Exception
 */

public class TestScript32 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        // Create FileInputStream to read the Excel file from given path
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		// Create Workbook object from the Excel file (supports .xls and .xlsx)
		Workbook wb = WorkbookFactory.create(fis);
		// Get the last row index of the sheet "Multiple" to determine how many rows of data are present
        int row = wb.getSheet("Multiple").getLastRowNum();
		// Loop to read all rows from the sheet "Multiple" starting from row index 0 to last row index
        for (int i = 0; i <= row; i++) {
			// Read string value from column 0 (first column) of current row
			String data = wb.getSheet("Multiple").getRow(i).getCell(0).getStringCellValue();
			// Read string value from column 1 (second column) of current row
			String data1 = wb.getSheet("Multiple").getRow(i).getCell(1).getStringCellValue();
			// Print both values separated by colon
			System.out.println(data+":"+data1);
		   wb.close();
		}		
	}
}
