package com.example.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHelper {
	
WebDriver driver = new FirefoxDriver();
	
	public void dismiss (){
		driver.quit();
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}

}
