package com.testautomation.mobile.pages;


import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends PageBase {

	
	public CreateTaskPage(AndroidDriver<WebElement> appiumDriver)
	{
		super(appiumDriver);
		
	}
	
	@AndroidFindBy(id="com.tasks.android:id/task_title")
	private MobileElement taskNameTxt;
	
	@AndroidFindBy(id="com.tasks.android:id/notes")
	private MobileElement taskDescTxt;
	
	
	@AndroidFindBy(id="com.tasks.android:id/fab")
	private MobileElement saveBtn;
	
	
	
	
	
	public void enterTaskName(String taskName)
	
	{
		clear(taskNameTxt);
		sendText(taskNameTxt,taskName);
	}
	
public void enterTaskDesc(String DescText)
	
	{
		clear(taskDescTxt);
		sendText(taskDescTxt,DescText);
	}

public void clickSaveBtn()
{
	click(saveBtn);
}
}
