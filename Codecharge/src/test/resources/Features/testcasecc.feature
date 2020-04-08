@codecharge
Feature: codecharge Application


@tc_01_Login
Scenario Outline: To Validate Login functionality
	Given The user launch the browser
	Then click Administration icon and enter "<uname>" and "<upass>"
	And click login button
	Examples:
      |uname     |upass     |
      |Admin     |admin12   |
      |admin     |admin     |
      
	
@tc_02_Search
Scenario: To Validate Search functionality
Given The user launch the browser
Then click on TaskList icon and enter search details 
And click search button


@tc_03_AddTask
Scenario: To Validate AddTask functionality
Given The user launch the browser
Then click on Addtaskicon and enter task details
And click on Add button


@tc_04_AddPriority
Scenario: To Validate Addnew Priority functionality
Given The user launch the browser
Then click on priority and add new priority
And click on add button


