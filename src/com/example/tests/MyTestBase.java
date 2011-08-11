package com.example.tests;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.example.fw.AppManager;

public class MyTestBase {
	
	protected static AppManager app;

	@BeforeClass
	public void setUp() throws Exception {
		app = AppManager.getInstance();
	}

	@AfterSuite
	public void tearDown() throws Exception {
		app.dismiss();
	}



}
