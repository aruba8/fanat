package com.example.tests;

import org.testng.annotations.Test;

public class RegistrationTest extends MyTestBase {
	@Test
	public static void testRegistration(){
		app.getNavHelper().goToAuthPage();
		app.getNavHelper().goToRegistrationPage();
	}
}
