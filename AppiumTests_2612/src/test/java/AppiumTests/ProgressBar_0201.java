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

public class ProgressBar_0201 {

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
		  Thread.sleep(5000);
		  
		  WebElement Checkbox = driver.findElementById("com.top10labs.AutoBright:id/auto_brightness");
		  Checkbox.click();  
		  System.out.println("Checkbox unchecked");
		  Thread.sleep(5000);
		  String BrightnessLevel1 = driver.findElementById("com.top10labs.AutoBright:id/brightness").getText();
		  System.out.println(BrightnessLevel1);
		  
		  //Progress Bar/Horizontal Scrolling feature
		
		  Thread.sleep(2000);
		  WebElement PB= driver.findElementById("com.top10labs.AutoBright:id/slider"); 
		  TouchAction action=new TouchAction((MobileDriver)driver);
		  action.longPress(ElementOption.element(PB)).moveTo(ElementOption.element(PB,100,150)).release().perform();
		  String BrightnessLevel2 = driver.findElementById("com.top10labs.AutoBright:id/brightness").getText();
		  System.out.println(BrightnessLevel2);
		  WebElement Normal=driver.findElementByXPath("//android.widget.TextView[@text='Normal']");
		  Normal.click();
		  System.out.println("Selected the Normal Brightness");
		  Thread.sleep(2000);
		  
		 
		  
		  
	}


}
