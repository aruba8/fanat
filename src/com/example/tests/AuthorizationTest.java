package com.example.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends MyTestBase {
	@Test
	public static void testAuth(){
		String login = "biomaks";
		String password = "Asd123456";
		app.getNavHelper().goToAuthPage();
		app.getLoginHelper().login(login, password);
		Assert.assertTrue(app.getNavHelper().returnCurrentPageAdress().contains(login));
	}

}
