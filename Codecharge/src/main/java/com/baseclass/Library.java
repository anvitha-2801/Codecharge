package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
	public static WebDriver driver;
	//Launching a WebBrowser
	public void launchApplication() throws IOException
	{
		//Locating the Path of the file
		FileInputStream fis=new FileInputStream("C:\\Users\\home\\eclipse-workspace\\Codecharge\\src\\test\\resources\\configuration property\\config.property");
		//Creating the object to the property file
	    Properties prop = new Properties();
	  //Loading the property file into the object
		prop.load(fis);
		//Initializing the browser names
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		//launch Firefox browser
		try {
			if (browser.equalsIgnoreCase("Firefox"))
			{
				driver = new FirefoxDriver();
			}
			//launch chrome browser
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\Codecharge\\src\\test\\resources\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			//Maximizing the Window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Getting the url from the property file
			driver.get(url);
			
		}
		catch(WebDriverException e)
		{
			System.out.println("browser could not be launched");
		}
	}
	//Closing the driver
	public void quit()
	{
		driver.close();
	}
}





