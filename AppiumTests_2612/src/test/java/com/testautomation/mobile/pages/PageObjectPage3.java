package com.testautomation.mobile.pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage3 extends BasePage {

	
public PageObjectPage3(AndroidDriver driver)
	
	{
		super(driver);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"3. Scroll\"]")
	private MobileElement scroll_Link;
	
	public void getScrollText() throws InterruptedException
	
	{
		Thread.sleep(3000);
		String textValue = scroll_Link.getText();
		System.out.println("We have noted the ApiDemos App text value " +textValue);
		Thread.sleep(1000);
		System.out.println("We have noted the ApiDemos App text value " +scroll_Link.getText());
	}
}
