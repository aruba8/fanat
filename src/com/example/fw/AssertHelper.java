package com.example.fw;

public class AssertHelper extends HelperBase {

	public AssertHelper(AppManager app) {
		super(app);
	}

	public boolean isTextPresent(String text, String locator) {
		String vtext = findElement(locator).getText();
		if (text.equals(vtext)){
			return true;
		}else return false;
	}

}
