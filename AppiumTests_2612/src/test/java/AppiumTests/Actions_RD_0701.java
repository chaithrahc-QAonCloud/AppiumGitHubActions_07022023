package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Actions_RD_0701 {

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
			  
			  driver.findElementByXPath("//android.widget.TextView[@content-desc=\"App\"]").click();
			  System.out.println("App option clicked");
			  Thread.sleep(1000);
			 
			  driver.findElementByXPath("//android.widget.TextView[@content-desc='Activity']").click();
			  System.out.println("Activity option clicked");
			  Thread.sleep(1000);
				 
			  driver.findElementByXPath("//android.widget.TextView[@content-desc='Animation']").click();
			  System.out.println("Animation option clicked");
			  Thread.sleep(1000);
				 
			  driver.findElementById("io.appium.android.apis:id/fade_animation").click();
			  System.out.println("Fade in option clicked");
			  Thread.sleep(1000);
				 
			  driver.findElementById("io.appium.android.apis:id/text_entry_button").click();
			  System.out.println("Test Entry Dialog option clicked");
			  Thread.sleep(1000);
				 
			  driver.findElementById("io.appium.android.apis:id/username_edit").sendKeys("This is Action Test");
			  System.out.println("Name field value entered");
			  Thread.sleep(1000);
				 
			  driver.findElementById("io.appium.android.apis:id/password_edit").sendKeys("AppiumTest");
			  System.out.println("Password value entered");
			  Thread.sleep(1000);
				 
			  driver.findElementById("android:id/button1").click();
			  System.out.println("OK button clicked");
			  Thread.sleep(1000);
				 
			  driver.quit();
			  
			  
			  		
			  

	}

}
