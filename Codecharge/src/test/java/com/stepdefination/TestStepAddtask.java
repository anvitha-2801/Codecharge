package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.CodechargeAddtaskPage;
import com.pages.CodechargeLoginPage;
import com.seleniumutil.Utility;

import cucumber.api.java.en.Then;

public class TestStepAddtask extends Library {
	final static Logger LOG=LogManager.getLogger(TestStepAddtask.class.getName());
	Utility util;
	CodechargeAddtaskPage tapp;
	@Then("^click on Addtaskicon and enter task details$")
	public void click_on_Addtaskicon_and_enter_task_details() throws Throwable {
		//login
				CodechargeLoginPage lapp=new CodechargeLoginPage(driver);
				lapp.loginToApp_adminicon();
				lapp.loginToApp_username("admin");
				lapp.loginToApp_password("admin");
				lapp.loginToApp_loginbutton();
				LOG.info("successfully adminicon is clicked and username & password is entered");
	//add task
			tapp=new CodechargeAddtaskPage(driver);
			tapp.addtask_addtaskicon();
			tapp.addtask_task("My project");
			tapp.addtask_description(".");
			tapp.addtask_project();
			tapp.addtask_priority();
			tapp.addtask_status();
			tapp.addtask_type();
			tapp.addtask_assignedto();
			tapp.addtask_startdate("04/17/18");
			tapp.addtask_finishdate("04/23/19");
			LOG.info("taskicon is clicked and task details are entered");
	}

	@Then("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
		tapp.addtask_addbutton();
		LOG.info("clicked on addbutton");
		//to take screenshot
		util=new Utility(driver);
		util.takeSnapshot("C:\\Users\\home\\eclipse-workspace\\Codecharge\\src\\test\\resources\\Screenshot\\codechargeAddtask.png");
		LOG.info("screenshot is captured");
        driver.close();
		
	}


}
