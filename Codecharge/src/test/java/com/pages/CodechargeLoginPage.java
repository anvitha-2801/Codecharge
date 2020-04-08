package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodechargeLoginPage {
WebDriver driver;
//locators
@FindBy(xpath="/html/body/table/tbody/tr[2]/td[3]/a")
WebElement adminicon;
@FindBy(name="login")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(name="DoLogin")
WebElement loginbutton;
//constructor
public CodechargeLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//clicking on the admin icon
public void loginToApp_adminicon() {
	adminicon.click();
}
//entering the username
public void loginToApp_username(String uname) {
	username.sendKeys(uname);
}
//entering the password
public void loginToApp_password(String upass) {
	password.sendKeys(upass);
}
//clicking on login button
public void loginToApp_loginbutton() {
    loginbutton.click();
    }
}
