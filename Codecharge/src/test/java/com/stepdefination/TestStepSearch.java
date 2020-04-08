package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.CodechargeLoginPage;
import com.pages.CodechargeSearchPage;
import com.seleniumutil.Utility;

import cucumber.api.java.en.Then;

public class TestStepSearch extends Library {
	final static Logger LOG=LogManager.getLogger(TestStepSearch.class.getName());
	Utility util;
	CodechargeSearchPage sapp;
	@Then("^click on TaskList icon and enter search details$")
	public void click_on_TaskList_icon_and_enter_search_details() throws Throwable {
	//login
		CodechargeLoginPage lapp=new CodechargeLoginPage(driver);
		lapp.loginToApp_adminicon();
		lapp.loginToApp_username("admin");
		lapp.loginToApp_password("admin");
		lapp.loginToApp_loginbutton();
		LOG.info("successfully adminicon is clicked and username & password is entered");
		
		//search
		sapp=new CodechargeSearchPage(driver);
		sapp.search_tasklisticon();
		sapp.search_assignedto();
		sapp.search_project();
		sapp.search_priority();
		sapp.search_status();
		sapp.search_type();
		LOG.info("tasklisticon is clicked and task details is entered");
		
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
		sapp.search_searchbutton();
		LOG.info("clicked on searchbutton");
		//to take screenshot
		Utility util=new Utility(driver);
		util.takeSnapshot("C:\\Users\\home\\eclipse-workspace\\Codecharge\\src\\test\\resources\\Screenshot\\codechargesearch.png");
		LOG.info("screenshot is captured");
        driver.close();
		
		
	}



}
