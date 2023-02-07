package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class ProgressBar_CustomValue_0201 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage","com.top10labs.AutoBright");  //Auto Best Brightness Level APK
		  cap.setCapability("appActivity","com.top10labs.AutoBright.BrightnessProfiles");
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement>  driver = new AndroidDriver<WebElement>(url, cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(2000);
		  
		  WebElement Checkbox = driver.findElementById("com.top10labs.AutoBright:id/auto_brightness");
		  Checkbox.click();  
		  System.out.println("Checkbox unchecked");
		  Thread.sleep(2000);
		  
		  WebElement Add = driver.findElementById("com.top10labs.AutoBright:id/add_button");  //Click on ADD button
		  Add.click();
		  System.out.println("Clicked on ADD button");
		  Thread.sleep(1000);
		  MobileElement Name = (MobileElement) driver.findElementById("com.top10labs.AutoBright:id/edit_name");  //Enter the name for brightness
	      Name.clear();		  
		  Name.sendKeys("Bright 70");
		  System.out.println("Entered the name for brightness");
		  Thread.sleep(1000);
		  MobileElement Level = (MobileElement) driver.findElementById("com.top10labs.AutoBright:id/edit_brightness");  //Enter the level for brightness
	      Level.clear();		  
		  Level.sendKeys("70");
		  System.out.println("Entered the level for brightness");
		  Thread.sleep(1000);
		  WebElement Ok = driver.findElementById("com.top10labs.AutoBright:id/ok_button");  //Click on OK button
		  Ok.click();
		  System.out.println("Clicked on OK button");
		  Thread.sleep(1000);
		  WebElement CustomLevel = driver.findElementById("com.top10labs.AutoBright:id/profile_name");  //Click on the Custom value created
		  CustomLevel.click();
		  System.out.println("Clicked on the Custom value created");
		  
		  Thread.sleep(1000);
		  driver.quit();
		  
	}

}
