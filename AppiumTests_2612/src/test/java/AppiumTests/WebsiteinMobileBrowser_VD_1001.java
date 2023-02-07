package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class WebsiteinMobileBrowser_VD_1001 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		 DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		
			 //Launching the Google Chrome
			 dc.setCapability("appPackage","com.android.chrome");
			 dc.setCapability("appActivity","com.google.android.apps.chrome.Main");
			  
		
			
		//	dc.setCapability(MobileCapabilityType.FULL_RESET,true);
			 
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
			
			driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		    Thread.sleep(3000);
		    driver.findElementById("com.android.chrome:id/terms_accept").click();
			System.out.println("Accept/Continue button clicked");
			Thread.sleep(1000);
			
		    driver.findElementById("com.android.chrome:id/negative_button").click();
		    System.out.println("No thanks button clicked");
		    Thread.sleep(2000);
		    
		    //Launching the AdminDemo site
		    driver.get("https://admin-demo.nopcommerce.com/login");
		    Thread.sleep(5000);
		    System.out.println("Admin Demo site launched successfully");
		    
		    WebElement Email = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[93,690][987,789]']"));
		    Email.clear();
		    Email.sendKeys("qaz@gmail.com");
		    Thread.sleep(1000);   
		    System.out.println("Email entered");
		      
		    WebElement Pwd = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[93,902][987,1001]']"));
		    Pwd.clear();
		    Pwd.sendKeys("admindemo123");
		    Thread.sleep(1000);
		    System.out.println("Password entered");
		    
		    
		    driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']")).click();
		    Thread.sleep(1000);
		    System.out.println("Login button clicked");
		    
		    String Message1 = driver.findElement(By.xpath("//android.view.View[@bounds='[85,426][995,508]']")).getText();
		    String Message2 = driver.findElement(By.xpath("//android.view.View[@bounds='[52,508][1028,550]']")).getText();
		    
		    System.out.println(Message1 + Message2);
		    Thread.sleep(3000);
		    
		    driver.quit();
		
	}

}
