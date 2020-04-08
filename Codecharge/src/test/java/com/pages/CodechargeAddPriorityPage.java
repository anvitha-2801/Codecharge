package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodechargeAddPriorityPage {
	WebDriver driver;
	//locators
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[2]/td/a")
	WebElement priorities;
	@FindBy(partialLinkText="Add New Priority")
	WebElement addnewpriority;
	@FindBy(name="priority_name")
	WebElement priority;
	@FindBy(name="Insert")
	WebElement addbutton;
	
	//constructor
	public CodechargeAddPriorityPage(WebDriver driver) {
		//Pointing to the current driver
		PageFactory.initElements(driver,this);
	}
	//Clicking on the add priority
	public void addpriority_priorities() {
		priorities.click();
	}
	//Clicking on the addnew priority
	public void addpriority_addnewpriority() {
		addnewpriority.click();
	}
	//entering the priority name
	public void addpriority_priority(String pname) {
		priority.sendKeys(pname);
	}
	//Clicking on the add button
	public void addpriority_addbutton() {
		addbutton.click();
	}
}
