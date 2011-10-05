package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends MyTestBase {
	@Test
	public void testSomthing(){
		String login = "biomaks";
		String password = "";
		app.getNavHelper().goToAuthPage();
		app.getLoginHelper().login(login, password);
		Assert.assertTrue(app.getNavHelper().returnCurrentPageAdress().contains(login));
		app.getNavHelper().goToPage("http://fanat.ru/messages/inbox");
		System.out.println(app.getMessegesHelper().getCountOfSentedMessages());
	}

}
