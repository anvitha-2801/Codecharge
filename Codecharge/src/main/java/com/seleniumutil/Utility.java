package com.seleniumutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	WebDriver driver;
	//constructor
	public Utility(WebDriver driver)
	{
		//Pointing to the Current Driver
		this.driver=driver;
		
	}
	//Taking the ScreenShot
	public void takeSnapshot(String path1) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(Source, new File(path1));
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	}

