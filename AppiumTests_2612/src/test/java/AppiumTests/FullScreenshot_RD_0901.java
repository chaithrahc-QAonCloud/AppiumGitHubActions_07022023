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

public class FullScreenshot_RD_0901 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		   DesiredCapabilities dc = new DesiredCapabilities();
			
					dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
					dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
					dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
					dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
					dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
					 
					URL url = new URL("http://127.0.0.1:4723/wd/hub");
					AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
					
					System.out.println("Application Started");
					Thread.sleep(5000);
					  
					WebElement Text = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Text\"]");
					Text.click();
					System.out.println("Text option selected");
					Thread.sleep(1000);
					WebElement LogTextbox = driver.findElementByXPath("//android.widget.TextView[@content-desc='LogTextBox']");	
					LogTextbox.click();
					System.out.println("LogTextbox option selected");
					Thread.sleep(1000);
					
					WebElement Addbutton = driver.findElementById("io.appium.android.apis:id/add");
					Addbutton.click();
					System.out.println("Add button clicked");
					Thread.sleep(1000);
					
				    fullscreenScreenshot(driver);   //Full screenshot function called
				    
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
