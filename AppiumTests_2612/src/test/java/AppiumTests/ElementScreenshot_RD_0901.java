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

public class ElementScreenshot_RD_0901 {

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
			  
			WebElement Views = driver.findElementByXPath("//android.widget.TextView[@content-desc='Views']");
			Views.click();
			System.out.println("Views option clicked");
			WebElement AutoComplete = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Auto Complete\"]");
			AutoComplete.click();
			System.out.println("Auto Complete option clicked");
			WebElement MultipleItems = driver.findElementByXPath("//android.widget.TextView[@content-desc='6. Multiple items']");
			MultipleItems.click();
			System.out.println("Multiple Items option clicked");
			WebElement EditText = driver.findElementById("io.appium.android.apis:id/edit");
			EditText.click();
			EditText.sendKeys("India ");
		    WebElement ele01 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.MultiAutoCompleteTextView"));
	    	elementScreenshot(driver,ele01);
	    	 driver.quit();
	}

	  public static String elementScreenshot(AppiumDriver driver, WebElement ele)
	    {

	        File screenshotLocation = null;
	        try{
	            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	            BufferedImage fullImg = ImageIO.read(scrFile);
	            //Get the location of element on the page
	            Point point = ele.getLocation();
	            //Get width and height of the element
	            int eleWidth = ele.getSize().getWidth();
	            int eleHeight = ele.getSize().getHeight();
	            //Crop the entire page screenshot to get only element screenshot
	            BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth,
	                    eleHeight);
	            ImageIO.write(eleScreenshot, "png", scrFile);

	            String path = "screenshots/" + UUID.randomUUID() + "" + ".png";

	            screenshotLocation = new File(System.getProperty("user.dir") + "/" + path);
	            FileUtils.copyFile(scrFile, screenshotLocation);

	            System.out.println(screenshotLocation.toString());

	        } catch (IOException e) {

	            e.printStackTrace();
	        }
	        return screenshotLocation.toString();

	    }
}
