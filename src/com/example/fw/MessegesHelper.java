package com.example.fw;

import org.openqa.selenium.By;

public class MessegesHelper extends HelperBase {

	public MessegesHelper(AppManager app) {
		super(app);
	}
	
	public void writeMessage(String subj, String meesage){
		driver.findElement(By.xpath("//form[@id='msgForm']/a[@href='/messages/compose']")).click();
		System.out.println("");
		
	}
}
