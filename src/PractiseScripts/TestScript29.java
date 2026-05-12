package PractiseScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/***
 * This class defines Data Driven Framework. It is used to read data from excel sheet and perform operations on it.
 * Testing the application with the multiple data in external files like property file or data base is called Data Driven testing
 * According to automation standards we should not hard code the data in the script. We should read the data from external files like excel sheet, property file or data base.
 *@author rakshith.s 
 * @throws IOException 
 */

public class TestScript29 {
	
        public static void main(String[] args) throws IOException {
		
        FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String username = p.getProperty("un");
		String password = p.getProperty("pwd");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
	}

}
