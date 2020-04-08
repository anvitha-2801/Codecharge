package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodechargeSearchPage {
	WebDriver driver;
	//locators
	@FindBy(name="Insert")
	WebElement addbutton;
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[1]/a")
	WebElement tasklisticon;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/select/option[28]")
	WebElement assignedto;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/select/option[2]")
	WebElement project;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[2]")
	WebElement priority;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[2]")
	WebElement status;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[5]")
	WebElement type;
	@FindBy(name="DoSearch")
	WebElement searchbutton;	
	//constructor
	public CodechargeSearchPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//clicking on tasklist icon
	public void search_tasklisticon() {
		tasklisticon.click();
	}
	//selecting assigned to
	public void search_assignedto() {
		assignedto.click();
	}
	//selecting the project
	public void search_project() {
		project.click();
	}
	//selecting the priority
	public void search_priority() {
		priority.click();
	}
	//selecting the status
	public void search_status() {
		status.click();
	}
	//selecting the type
	public void search_type() {
		type.click();
	}
	//clicking on search button
	public void search_searchbutton() {
		searchbutton.click();
	}
	}


