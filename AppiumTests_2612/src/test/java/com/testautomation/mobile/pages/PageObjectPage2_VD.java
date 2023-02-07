package com.testautomation.mobile.pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage2_VD extends BasePage_VD {

public PageObjectPage2_VD(AndroidDriver driver)
	
	{
		super(driver);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Auto Complete\"]")
	private MobileElement autoComplete_Link;
	
	public void clickOnAutoComplete() throws InterruptedException
	
	{
		autoComplete_Link.click();
	}
}
