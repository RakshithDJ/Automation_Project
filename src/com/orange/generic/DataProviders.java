package com.orange.generic;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "login", indices = { 0 ,1})
	public static Object[][] loginData() {
		Object data[][] = { { "admin12", "admin2123" }, { "Admin", "admin123" }, { "cdmin", "hdmin123" } };
		return data;
	}
	
	
}
