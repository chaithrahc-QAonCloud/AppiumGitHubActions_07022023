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

public class ElementScreenshot_Star_VD_0901 {

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
			Thread.sleep(5000);
			
			WebElement Views = driver.findElementByXPath("//android.widget.TextView[@content-desc='Views']");
			Views.click();
			System.out.println("Views option clicked");
			WebElement Controls = driver.findElement(By.xpath("//android.widget.TextView[@text='Controls']"));
			Controls.click();
			System.out.println("Controls option clicked");
			
			
			WebElement Theme = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='6. Holo or Old Theme']"));
			Theme.click();
			System.out.println("Holo or Old Theme selected");
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")).sendKeys("This is Screenshot test");
			
			WebElement Star = driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc='Star']"));
			Star.click();
			System.out.println("Star clicked");
			Thread.sleep(5000);
			
			
		    WebElement ele01 = driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc='Star']"));  //Star symbol captured
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
