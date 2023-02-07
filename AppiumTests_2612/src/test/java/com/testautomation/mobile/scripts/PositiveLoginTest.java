package com.testautomation.mobile.scripts;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import com.testautomation.mobile.pages.LoginPage;
import com.testautomation.mobile.pages.ProfilePage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class PositiveLoginTest {

	
    private final static String PASSWORD = "12345";
    public static void main(String[] args) throws Exception {
       
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        capabilities.setCapability(MobileCapabilityType.UDID, "CQFEDARKYX59JZLR");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi-9");
        
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\testproject-demo-app.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       
        LoginPage loginPage = new LoginPage(driver);
        if (!loginPage.isDisplayed()) {
            return;
        }
        loginPage.login("John Smith", PASSWORD);
        ProfilePage profilePage = new ProfilePage(driver);
        if (!profilePage.isDisplayed()) {
            return;
        }
        profilePage.profile("England","Marks Street","john12345@gmail.com","9000000011");
        System.out.println("Test completed successfully");
      
        driver.quit();
    }
}

