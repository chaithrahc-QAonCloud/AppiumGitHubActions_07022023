package com.testautomation.mobile.pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private AndroidDriver<AndroidElement> driver;
    public LoginPage() {
    }
    public LoginPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "name")
    private AndroidElement nameElement;
    @AndroidFindBy(id = "password")
    private AndroidElement passwordElement;
    @AndroidFindBy(id = "login")
    private AndroidElement loginElement;
    public boolean isDisplayed() {
        return loginElement.isDisplayed();
    }
    public void typeName(String name) {
        nameElement.sendKeys(name);
    }
    public void typePassword(String password) {
        passwordElement.sendKeys(password);
    }
    public void clickLogin() {
        loginElement.click();
    }
  
    public void login (String name, String password) {
    
        typeName(name);
        typePassword(password);
        clickLogin();
    }
}

