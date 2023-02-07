package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class FullScreenshot_VD_0901 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		  DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
			dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
			 
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
			
			System.out.println("Application Started");
			
			WebElement Views = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
			Views.click();
			Thread.sleep(5000);
			System.out.println("Views option clicked");
			
			
			WebElement Animation = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Animation\"]");
			Animation.click();
			Thread.sleep(1000);
			System.out.println("Animation option clicked");
			
			WebElement Transition = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3D Transition\"]");
			Transition.click();
			Thread.sleep(1000);
			System.out.println("3D Transition option clicked");
			
			WebElement img = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
			img.click();
			Thread.sleep(1000);
			System.out.println("Lake Tahoe image clicked"); 
			
			fullscreenScreenshot(driver);  //Full screenshot function called
			
			 driver.quit();
	}

	 public static String fullscreenScreenshot(AppiumDriver driver) {

	        File screenshotLocation = null;
	        try{
	            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	         

	            String path = "screenshots/" + UUID.randomUUID()  + ".png";

	            screenshotLocation = new File(System.getProperty("user.dir") + "/" + path);
	            FileUtils.copyFile(scrFile, screenshotLocation);

	            System.out.println(screenshotLocation.toString());

	        } catch (IOException e) {

	            e.printStackTrace();
	        }
	        return screenshotLocation.toString();

	    }
}
