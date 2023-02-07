package com.testautomation.mobile.pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage1_VD extends BasePage_VD {

public PageObjectPage1_VD(AndroidDriver driver)
	
	{
		super(driver);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
	private MobileElement views_Link;
	
	public void clickOnViews() throws InterruptedException
	
	{
		views_Link.click();
		
	}
}
