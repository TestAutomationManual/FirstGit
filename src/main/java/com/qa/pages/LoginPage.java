package com.qa.pages;

import com.qa.base.Page;

public class LoginPage extends Page {


	
	public ZohoAppPage LoginIn(String UserName, String Password) throws InterruptedException {
		
		type("email_XPATH",UserName );
		click("next_XPATH");
		type("password_XPATH",Password);
		click("signbtn_XPATH");
		return new ZohoAppPage();
	}
}
