package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
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

public class TouchActions_4_VD_1901 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 5");
		dc.setCapability("appPackage","com.h6ah4i.android.example.advrecyclerview");
		dc.setCapability("appActivity","com.h6ah4i.android.example.advrecyclerview.launcher.MainActivity");
		 
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		System.out.println("Application Started");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Swipe\"]")).click();
		System.out.println("Swipe Tab clicked");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.Button[1]")).click();
		System.out.println("Swipeable(Minimal) button clicked");
		Thread.sleep(2000);
		
		//Swipe by Element
		
		Dimension size =driver.manage().window().getSize();
		Double screenHeightStart = size.getHeight()*0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = size.getHeight()*0.2;
		int scrollEnd = screenHeightEnd.intValue();
		int center = (int)(size.width*0.5);
		new AndroidTouchAction(driver)
		.press(PointOption.point(center,scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(center,scrollEnd)).release().perform();
		System.out.println("Swipe from the center is achieved");
	      
	   

	}

}
