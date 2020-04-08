package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.CodechargeLoginPage;
import com.seleniumutil.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestStepLogin extends Library{
	final static Logger LOG=LogManager.getLogger(TestStepLogin.class.getName());
	Utility util;
	CodechargeLoginPage lapp;
	@Given("^The user launch the browser$")
	public void the_user_launch_the_browser() throws Throwable {
		//launch the browser
		Library base=new Library();
		base.launchApplication();
		LOG.info("Browser is opened");	
	}

	@Then("^click Administration icon and enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_Administration_icon_and_enter_username_and_password(String uname, String upass) throws Throwable {
	    lapp=new CodechargeLoginPage(driver);
		lapp.loginToApp_adminicon();
		lapp.loginToApp_username(uname);
		lapp.loginToApp_password(upass);
		LOG.info("adminicon is clicked and username & password are entered");
	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
		//clicking on login button
		lapp.loginToApp_loginbutton();
		LOG.info("clicked on login button");
		//to take screenshot
		util=new Utility(driver);
		util.takeSnapshot("C:\\Users\\home\\eclipse-workspace\\Codecharge\\src\\test\\resources\\Screenshot\\codechargelogin.png");
		LOG.info("screenshot is captured");
        driver.close();
	   
	}
	}


