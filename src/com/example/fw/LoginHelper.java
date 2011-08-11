package com.example.fw;

public class LoginHelper extends HelperBase {

	public LoginHelper(AppManager app) {
		super(app);
	}

	public void login(String login, String password) {
		findElement("//input[@id='login']").sendKeys(login);
		findElement("//input[@id='password']").sendKeys(password);
		findElement("//input[@name='save']").click();
	}
}
