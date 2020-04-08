package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.excelutility.Excel_Datadriven;
import com.pages.CodechargeAddPriorityPage;
import com.pages.CodechargeLoginPage;
import com.seleniumutil.Utility;

import cucumber.api.java.en.Then;

public class TestStepAddPriority extends Library{
	final static Logger LOG=LogManager.getLogger(TestStepAddPriority.class.getName());
	Utility util;
	CodechargeAddPriorityPage papp;
	Excel_Datadriven excel;
	@Then("^click on priority and add new priority$")
	public void click_on_priority_and_add_new_priority() throws Throwable {
		//login
		CodechargeLoginPage lapp=new CodechargeLoginPage(driver);
		lapp.loginToApp_adminicon();
		lapp.loginToApp_username("admin");
		lapp.loginToApp_password("admin");
		lapp.loginToApp_loginbutton();
		LOG.info("successfully adminicon is clicked and username & password is entered");
	
	  
    //add new priority
	excel=new Excel_Datadriven(driver);
	papp=new CodechargeAddPriorityPage(driver);
	papp.addpriority_priorities();
	papp.addpriority_addnewpriority();
	papp.addpriority_priority(excel.excel_priority(1));
	LOG.info("successfully priority is clicked and new priority is entered");
   
	}

	@Then("^click on add button$")
	public void click_on_add_button() throws Throwable {
		papp.addpriority_addbutton();
		LOG.info("clicked on addbutton");
		//screenshot
		util=new Utility(driver);
		util.takeSnapshot("C:\\Users\\home\\eclipse-workspace\\Codecharge\\src\\test\\resources\\Screenshot\\codechargeAddpriority.png");
		LOG.info("screenshot is successfully captured");
		 driver.close();
	}


}
