package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMessages extends MyTestBase{
	@Test
	public void testSendMessages(){
		String login_to = "erikstb";
		String subj = "test subj";
		String message = "test message";
		String login = "biomaks";
		String password = "";
		app.getNavHelper().goToAuthPage();
		app.getLoginHelper().login(login, password);
		Assert.assertTrue(app.getNavHelper().returnCurrentPageAdress().contains(login));
		app.getNavHelper().goToPage("http://fanat.ru/messages/inbox");
		Assert.assertTrue(app.getAssertHelper().isTextPresent(login, "//div[@class='fanat-strip-profile canyon-section']"));
		int count_before = app.getMessegesHelper().getCountOfSentedMessages();
		app.getMessegesHelper().sendMessage(login_to, subj, message);
		Assert.assertTrue(app.getAssertHelper().isTextPresent("��������� ���������� ������������"+" "+login_to+".", "//div[@class='l-container']//div[@class='b-messages-title-container b-message-status']/p"));
		int count_after = app.getMessegesHelper().getCountOfSentedMessages();
		Assert.assertEquals(1, count_after-count_before);
		
		
	}

}
