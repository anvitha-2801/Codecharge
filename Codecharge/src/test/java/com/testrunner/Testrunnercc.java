package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/Features/testcasecc.feature",
			glue= {"com.stepdefination"},
			tags = { "@tc_01_Login,@tc_02_Search,@tc_03_AddTask,@tc_04_AddPriority"},
					plugin = {"pretty", "html:target/cucumber-html-report",
				             "json:target/cucumber-json-report",
				             "junit:target/cucumber-junit-report",
				             "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"}
			)
	public class Testrunnercc
	{
		@AfterClass
		public static void extentreport()
		{
			Reporter.loadXMLConfig("src/test/resources/testdata/extentreport.xml");
			Reporter.setSystemInfo("user",System.getProperty("user.name"));
			Reporter.setSystemInfo("os","Windows");
			Reporter.setTestRunnerOutput("Sample test runner output message");
		}
	}
	

	



