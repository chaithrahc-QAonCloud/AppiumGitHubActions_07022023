package com.testautomation.mobile.pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage3_VD extends BasePage_VD {

public PageObjectPage3_VD(AndroidDriver driver)
	
	{
		super(driver);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"6. Multiple items\"]")
	private MobileElement multipleitm_Link;

	
	public void multiitmText() throws InterruptedException
	
	{
		Thread.sleep(3000);
		String textValue = multipleitm_Link.getText();
		System.out.println("We have noted the ApiDemos App text value " +textValue);
		Thread.sleep(1000);
		
	}
}
