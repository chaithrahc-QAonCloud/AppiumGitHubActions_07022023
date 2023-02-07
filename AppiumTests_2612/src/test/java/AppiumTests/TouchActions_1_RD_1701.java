package AppiumTests;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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

public class TouchActions_1_RD_1701 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	    	DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
			dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\SwipeListView Demo_v1.13_apkpure.com.apk");
			 
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
			
			System.out.println("Application Started");
			Thread.sleep(10000);
			
			WebElement menu = (WebElement) driver.findElementByAccessibilityId("Settings");
			Rectangle rec = menu.getRect();
			System.out.println("Height is  " +rec.getHeight());
			System.out.println("Width is  " +rec.getWidth());
			System.out.println("X co-ordinate is  " +rec.getX());
			System.out.println("Y co-ordinate is  " +rec.getY());
			
			
			
			TouchAction action = new TouchAction(driver);
			action.tap(new TapOptions().withElement(new ElementOption().withElement(menu))).perform(); 
			System.out.println("Tap by element achieved");
			Thread.sleep(5000);
			driver.navigate().back();
			
            //***************************
			
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(rec.getX(),rec.getY())).perform();
			System.out.println("Tap by co-ordinates achieved");
			Thread.sleep(5000);
			driver.navigate().back();
			
			//***************************
			
		/*	TouchAction touchAction1 = new TouchAction(driver);
			touchAction1.tap(new PointOption().withCoordinates(1280, 1013)).perform();  */
	         
			 WebElement string = driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
				         ".scrollIntoView(new UiSelector().textContains(\"API Demos\"))"));
			
			//***************************
			 
			WebElement press = (WebElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.Button[2]"));
			TouchAction action1 = new TouchAction(driver);
			action1.longPress(new LongPressOptions().withElement(new ElementOption().withElement(press))).perform();
			System.out.println("Press by Element achieved");
			Thread.sleep(1000);
			WebElement open = (WebElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.Button[1]"));
			open.click();
			System.out.println("The ApiDemos App is opened");
			Thread.sleep(2000);
			driver.navigate().back();
			

			//***************************
			WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Settings\"]"));
			Point location = ele.getLocation();
			new TouchAction(driver).press(PointOption.point(location.getX(), location.getY())).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(20))).release().perform();
			System.out.println("Press by co-ordinates achieved");
			ele.click();
			System.out.println("Settings menu opened");
			driver.quit();
			
			
			
	}

}
