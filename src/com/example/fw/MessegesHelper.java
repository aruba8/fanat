package com.example.fw;

import org.openqa.selenium.By;

public class MessegesHelper extends HelperBase {

	public MessegesHelper(AppManager app) {
		super(app);
	}
	
	public void sendMessage(String login_to, String subj, String message){
		driver.findElement(By.xpath("//div[@class='layout profile']/div[@class='l-messages-r']//a[@href='/messages/compose']")).click();
		driver.findElement(By.xpath("//input[@id='login-to']")).sendKeys(login_to);
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys(subj);
		driver.findElement(By.xpath("//textarea[@id='text']")).sendKeys(message);
		driver.findElement(By.xpath("//input[@name='save']")).click();
		String vermessage =	driver.findElement(By.xpath("//div[@class='b-messages-title-container b-message-status']")).getText();

	}

	public int getCountOfSentedMessages() {
		String locator = "//div[@class='l-container']//ul[@class='b-messages-folders']/li[2]/p[@class='count']";
		String str = driver.findElement(By.xpath(locator)).getText();
		str = str.substring(9);
		int count = Integer.parseInt(str);
		return count;
	}
}
