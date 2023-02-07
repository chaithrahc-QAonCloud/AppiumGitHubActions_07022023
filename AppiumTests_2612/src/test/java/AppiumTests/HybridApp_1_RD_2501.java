package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HybridApp_1_RD_2501 {

	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		 DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage", "com.google.android.gm");
		  cap.setCapability("appActivity", "com.google.android.gm.ui.MailActivityGmail");
		  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  Set<String> contextNames = driver.getContextHandles();
		  for (String contextName : contextNames) {
		      System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		  }
		 
	}
}
