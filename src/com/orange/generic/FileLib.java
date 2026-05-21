package com.orange.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileLib implements IAutoConstant {
		

		public String readPropertyData(String PROPERTIES_PATH,String keyName) throws IOException {
		File absPath = new File(PROPERTIES_PATH);	
		FileInputStream fis = new FileInputStream(absPath);
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(keyName);
		return data;
		
	}

	
	
}
