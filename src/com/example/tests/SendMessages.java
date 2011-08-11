package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMessages extends MyTestBase{
	@Test
	public void testSendMessages(){
		String login = "biomaks";
		String password = "Asd123456";
		app.getNavHelper().goToAuthPage();
		app.getLoginHelper().login(login, password);
		Assert.assertTrue(app.getNavHelper().returnCurrentPageAdress().contains(login));
		app.getNavHelper().goToPage("http://fanat.ru/messages/inbox");
		Assert.assertTrue(app.getAssertHelper().isTextPresent(login, "//div[@class='fanat-strip-profile canyon-section']"));
		app.getMessegesHelper().writeMessage("", "");
		
	}

}
