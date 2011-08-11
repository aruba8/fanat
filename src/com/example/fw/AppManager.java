package com.example.fw;


public class AppManager {

	private static AppManager app;
	
	public static AppManager getInstance(){
		if (app == null)
			app = new AppManager();
		return app;		
	}
	
	private SeleniumHelper seleniumHelper;
	private NavHelper navHelper;
	private LoginHelper loginHelper;
	private AssertHelper assertHelper;
	private MessegesHelper messegesHelper;
	
	
	public SeleniumHelper getSeleniumHelper(){
		if (seleniumHelper == null){
			seleniumHelper = new SeleniumHelper();
		}
		return seleniumHelper;
	}
	
	public MessegesHelper getMessegesHelper(){
		if (messegesHelper == null){
			messegesHelper = new MessegesHelper(this);
		}
		return messegesHelper;
	}

	public AssertHelper getAssertHelper(){
		if (assertHelper == null){
			assertHelper = new AssertHelper(this);
		}
		return assertHelper;
	}

	public LoginHelper getLoginHelper(){
		if (loginHelper == null){
			loginHelper = new LoginHelper(this);
		}
		return loginHelper;
	}

	
	public NavHelper getNavHelper(){
		if (navHelper == null){
			navHelper = new NavHelper(this);
		}
		return navHelper;
	}

	

	public void dismiss (){
		if(seleniumHelper != null){
			seleniumHelper.dismiss();
		}
	}
}
