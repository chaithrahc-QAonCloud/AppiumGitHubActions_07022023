package com.testautomation.mobile.pages;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageBase {

	
	public static final long WAIT = 10;
	private AndroidDriver<WebElement> driver;

	
	
	
	public PageBase(AndroidDriver<WebElement> driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	public void waitForVisibility(MobileElement taskNameTxt)
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver,WAIT);
		wait.until(ExpectedConditions.visibilityOf(taskNameTxt));
	}
	
	public void clear(MobileElement taskNameTxt)
	{
		
		waitForVisibility(taskNameTxt);
		taskNameTxt.clear();
	}
	
	public void click(MobileElement element)
	{
		
		waitForVisibility(element);
		element.click();
	}
	
	public void sendText(MobileElement element,String text)
	{
		
		waitForVisibility(element);
		element.sendKeys(text);
	}
	
	public String getAttribute(MobileElement element,String attribute)
	
	{
		waitForVisibility(element);
		return element.getAttribute(attribute);
		
		
	}
}
