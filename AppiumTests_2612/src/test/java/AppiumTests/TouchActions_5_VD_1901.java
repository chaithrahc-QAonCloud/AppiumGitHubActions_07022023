package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.UUID;

public class TouchActions_5_VD_1901 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		 DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 5");
			dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\com.the511plus.MultiTouchTester.apk");
			;
			 
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
			
			System.out.println("Application Started");
			Thread.sleep(3000);
			
	         //MultiTouch Action
			
			 Dimension size =driver.manage().window().getSize();
			 System.out.println(size);
			 
			 int X1 = (int) (size.getWidth()*0.2);
			 System.out.println("X1 =" +X1);
			 
			 int Y1 = (int) (size.getHeight()*0.2);
			 System.out.println("Y1 =" +Y1);
			 
			 int X2 = (int) (size.getWidth()*0.8);
			 System.out.println("X2 =" +X2);
			 
			 int Y2 = (int) (size.getHeight()*0.2);
			 System.out.println("Y2 =" +Y2);
			 
			 int X3 = (int) (size.getWidth()*0.2);
			 System.out.println("X3 =" +X3);
			 
			 int Y3 = (int) (size.getHeight()*0.8);
			 System.out.println("Y3 =" +Y3);
			 
			 int X4 = (int) (size.getWidth()*0.8);
			 System.out.println("X4 =" +X4);
			 
			 int Y4 = (int) (size.getHeight()*0.8);
			 System.out.println("Y4 =" +Y4);
			 
			 int X5 = size.width / 2;
			 System.out.println("X5 =" +X5);
			 
			 int Y5 = size.height / 2;
			 System.out.println("Y5 =" +Y5);
			 
			         MultiTouchAction multiTouch = new MultiTouchAction(driver);
			         Thread.sleep(1000);
			 
					 TouchAction action1 = new TouchAction(driver);
					 Thread.sleep(1000);
					 TouchAction action2 = new TouchAction(driver);
					 Thread.sleep(1000);
					 TouchAction action3 = new TouchAction(driver);
					 Thread.sleep(1000);
					 TouchAction action4 = new TouchAction(driver);
					 Thread.sleep(1000);
					 TouchAction action5 = new TouchAction(driver);
					 Thread.sleep(1000);

					 action1.press(PointOption.point(X1, Y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).release();
					
					 action2.press(PointOption.point(X2, Y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).release();
				
					 action3.press(PointOption.point(X3, Y3)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).release();
					
					 action4.press(PointOption.point(X4, Y4)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).release();
				
					 action5.press(PointOption.point(X5, Y5)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).release();
					
					 multiTouch.add(action1).add(action2).add(action3).add(action4).add(action5).perform();
					
					 
					 System.out.println("MultiTouch Action performed");
					 Thread.sleep(1000);
					 driver.quit();


	}

}
