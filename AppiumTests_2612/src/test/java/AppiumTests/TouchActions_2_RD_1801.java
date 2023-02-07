package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
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

public class TouchActions_2_RD_1801 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		    DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
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
			double start_xd = 0.2;
			double start_yd = 0.2;
			double end_xd  = 0.8;
			double end_yd  = 0.2;
			

			Dimension dimension = driver.manage().window().getSize();
			System.out.println(dimension);
			int start_x = (int) (dimension.width * start_xd);
			int start_y = (int) (dimension.height * start_yd);
			int end_x = (int) (dimension.width * end_xd);
			int end_y = (int) (dimension.height * end_yd);
			
			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x,start_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x,end_y)).release().perform();  
			System.out.println("Horizontal Swipe is achieved");
			// For the Item 5
			
			WebElement el1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Item 5']"));
			Rectangle cvalue = el1.getRect();
			System.out.println("X co-ordinate is  " +cvalue.getX());
			System.out.println("Y co-ordinate is  " +cvalue.getY());
		
			int cvalue1 = cvalue.getY()-20;
			System.out.println("X co-ordinate new value  " +cvalue1);
			TouchAction touch1 = new TouchAction(driver);
			touch1.press(PointOption.point(cvalue.getX(),cvalue.getY()))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(cvalue1,cvalue.getY())).release().perform();
			System.out.print("New Co-ordinate value  (");
			System.out.print(cvalue1);
			System.out.print(",");
			System.out.print(cvalue.getY());
			System.out.print(")");
			System.out.print("\n");
			System.out.println("Horizontal Swipe is achieved");
			
	}

}
