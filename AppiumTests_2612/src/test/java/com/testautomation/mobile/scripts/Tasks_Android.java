package com.testautomation.mobile.scripts;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.testautomation.mobile.pages.CreateTaskPage;
import com.testautomation.mobile.pages.TasksListPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Tasks_Android extends TestBase {

	CreateTaskPage createTaskPage;
	TasksListPage tasksListpage;
	
	@Test
	public void test_add_task() throws MalformedURLException, InterruptedException
	
	{
		Android_setUp();
		
		
		tasksListpage = new TasksListPage(driver);
		tasksListpage.clickAddTaskBtn();
		createTaskPage = new CreateTaskPage(driver);
		
		createTaskPage.enterTaskName("Team Meeting");
		createTaskPage.enterTaskDesc("Monthly Meet");
		createTaskPage.clickSaveBtn();
		
	}
	
	
}
