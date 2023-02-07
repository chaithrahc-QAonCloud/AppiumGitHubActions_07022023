package com.testautomation.mobile.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TasksListPage extends PageBase {

	
	public TasksListPage(AndroidDriver<WebElement> appiumDriver)
	{
		super(appiumDriver);
		
	}
	
	@AndroidFindBy(id="com.tasks.android:id/action_add_task")
	private MobileElement addTaskBtn;
	
	public void clickAddTaskBtn() throws InterruptedException
	{
		Thread.sleep(10000);
		click(addTaskBtn);
		System.out.println("Add Task Button Clicked ");
	}  
	
}
