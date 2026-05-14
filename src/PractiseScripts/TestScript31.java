package PractiseScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestScript31 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		for (int i = 0; i <= 3; i++) {
			String value1 = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			String value2 = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(value1 + " : " + value2);

		}

		wb.createSheet("TestCase").createRow(0).createCell(0).setCellValue("Hello");
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
		wb.close();

	}
}