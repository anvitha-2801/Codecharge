package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodechargeAddtaskPage {
	WebDriver driver;
	//locators
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[2]/a")
    WebElement addtaskicon;
	@FindBy(name="task_name")
    WebElement task;
	@FindBy(name="task_desc")
    WebElement description;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[2]")
    WebElement project;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[2]")
    WebElement priority;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[5]")
    WebElement status;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/select/option[5]")
    WebElement type;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[7]/td/select/option[28]")
    WebElement assignedto;
	@FindBy(name="task_start_date")
    WebElement startdate;
	@FindBy(name="task_finish_date")
    WebElement finishdate;
	@FindBy(name="Insert")
    WebElement addbutton;
	//constructor
		public CodechargeAddtaskPage(WebDriver driver) {
			//Pointing to the current driver
			PageFactory.initElements(driver,this);
		}
		//Clicking on the add task icon
		public void addtask_addtaskicon() {
			addtaskicon.click();
		}
		//entering task name
		public void addtask_task(String name){
			task.sendKeys(name);
		}
		//entering description
		public void addtask_description(String desp) {
			description.sendKeys(desp);
		}
		//selecting the type of project
		public void addtask_project() {
			project.click();
		}
		//selecting the priority
		public void addtask_priority() {
			priority.click();
		}
		//selecting the Status
		public void addtask_status() {
			status.click();
		}
		//selecting the type
		public void addtask_type(){
			type.click();
		}
		//selecting assigned to
		public void addtask_assignedto(){
			assignedto.click();
		}
		//entering start date
		public void addtask_startdate(String sdate){
			startdate.sendKeys(sdate);
		}
		//entering finish date
		public void addtask_finishdate(String fdate){
			finishdate.sendKeys(fdate);
		}
		//Clicking on the add button
		public void addtask_addbutton(){
			addbutton.click();
		}
	}

