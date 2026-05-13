package PractiseScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestScript29 {

	public static void main(String[] args) throws IOException {
		
		  FileInputStream fis = new FileInputStream("./data/commondata.property");
		  Properties p = new Properties(); p.load(fis); String url =
		  p.getProperty("url"); String username = p.getProperty("un"); String password
		  = p.getProperty("pwd"); System.out.println(url);
		  System.out.println(username); System.out.println(password);
		 
		
	}
}
