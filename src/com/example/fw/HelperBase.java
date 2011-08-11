package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBase {
	
	protected final AppManager app;
	protected WebDriver driver;
	
	public HelperBase (AppManager app){
		this.app = app;
		driver = app.getSeleniumHelper().getWebDriver();
	}

	public void clickAndWait(String locator) {
		findElement(locator).click();
	}


	protected WebElement findElement(String locator) {
		return driver.findElement(convertLocator(locator));
	}
	
	private By convertLocator(String locator) {
		if (locator.startsWith("//")){
			return By.xpath(locator);
		}else if (locator.startsWith("xpath=")){
			return By.xpath(locator.substring("xpath=".length()));
		}else if(locator.startsWith("css=")){
			return By.cssSelector(locator.substring("css=".length()));
		}else if(locator.startsWith("name=")){
			return By.name(locator.substring("name=".length()));
		}else if(locator.startsWith("id=")){
			return By.id(locator.substring("id=".length()));
		}else if(locator.startsWith("link=")){
			return By.linkText(locator.substring("link=".length()));
		}else {
			return By.name(locator);
		}
	}

	protected String getCurrentPageAddress() {
		return driver.getCurrentUrl();
	}

	protected void type(String locator, String value) {
		if (value != null){
			findElement(locator).sendKeys(value);
		} 
	}

	protected void select(String locator, String value) {
		if (value != null){
			findElement(locator).sendKeys(value);
		}
	}

	protected int getXPathCount(String locator) {
		return driver.findElements(convertLocator(locator)).size();
	}

	protected String getAttribute(String locator, String attribute) {
		return findElement(locator).getAttribute(attribute);
	}
	
	protected String getText(String locator) {
		return findElement(locator).getText();
	}
	
	protected void click(String locator) {
		findElement(locator).click();
	}
}
