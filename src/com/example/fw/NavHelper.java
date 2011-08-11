package com.example.fw;

public class NavHelper extends HelperBase {

	public NavHelper(AppManager app) {
		super(app);
	}

	public void goToAuthPage() {
		driver.get("http://fanat.ru/login");
	}
	
	public String returnCurrentPageAdress() {
		return getCurrentPageAddress();
	}

	public void goToRegistrationPage() {
		click("//a[@href='https://fanat.ru/register']");
	}

	public void goToPage(String url) {
		driver.get(url);
	}
}
