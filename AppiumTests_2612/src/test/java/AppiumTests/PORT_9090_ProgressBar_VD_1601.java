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

public class PORT_9090_ProgressBar_VD_1601 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		  cap.setCapability("udid","emulator-5554");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","9.0");
		  cap.setCapability("appPackage","com.paksoftwares.brightnesslevel");  //Brightness Level APK
		  cap.setCapability("appActivity","com.paksoftwares.brightnesslevel.ScreenBrightnessActivity");
		  
		  URL url = new URL("http://127.0.0.1:9090/wd/hub");
		  AndroidDriver<WebElement>  driver = new AndroidDriver<WebElement>(url, cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(5000);
		  
		  String Val1 = driver.findElementById("com.paksoftwares.brightnesslevel:id/pb_value").getText();
		  System.out.println("Brightness at first  " +Val1);
		  
		  //Horizontal Scrolling
		  WebElement BL= driver.findElementById("com.paksoftwares.brightnesslevel:id/pb_1"); 
		 
		  TouchAction action=new TouchAction((MobileDriver)driver);
		  
		  action.longPress(ElementOption.element(BL)).moveTo(ElementOption.element(BL,500,15)).release().perform();
		  String Val2 = driver.findElementById("com.paksoftwares.brightnesslevel:id/pb_value").getText();
		  System.out.println("Brightness after scrolling  " +Val2);
		  
		  Thread.sleep(1000);
		  WebElement Value = driver.findElementById("com.paksoftwares.brightnesslevel:id/tv_1");
		  Value.click();
		  System.out.println("Brightness Level 25% button clicked");
		  String BrL =  driver.findElementById("com.paksoftwares.brightnesslevel:id/pb_value").getText();
		  if(BrL.equals("25%"))
		  {
			  System.out.println("Brightness has changed to  " +BrL);
		  }
		  
		  else
		  {
			  System.out.println("Please check the script and re-execute");
		  }

	}

}
