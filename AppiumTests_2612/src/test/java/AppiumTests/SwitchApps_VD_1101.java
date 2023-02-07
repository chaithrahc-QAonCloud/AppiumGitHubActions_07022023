package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchApps_VD_1101 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Android Emulator");
		  cap.setCapability("udid","emulator-5554");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","9.0");
		  cap.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\selendroid-test-app.apk");
		  //Launching the Selendroid Test App
		//  cap.setCapability("appPackage","selendroid-test-app");
	   //   cap.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		  
		  System.out.println("Selendroid Test Application Started");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
		  System.out.println("Clicked on the Registration button");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("Aradhya");
		  System.out.println("User name entered");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("aradhya@gmail.com");
		  System.out.println("Email entered");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("Test@12345");
		  System.out.println("Password entered");
		  Thread.sleep(2000);
		  
		  WebElement Name= driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		  Name.clear();
		  Name.sendKeys("Mrs. Aradhya Acharya");
		  System.out.println("Name entered");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage")).click();
		  WebElement Option = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Java']");
		  Option.click();
		  System.out.println("Dropdown value selected");
		  
		  
		  driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
		  System.out.println("Check box clicked");
		  Thread.sleep(3000);
		
		 
		  
		  driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
		  System.out.println("Register button clicked"); 
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//android.widget.Button[@text='Register User']")).click();
		  System.out.println("Register User button clicked");
		  
		  driver.startActivity(new Activity("io.appium.android.apis","io.appium.android.apis.ApiDemos"));
	      System.out.println("ApiDemos Application Started");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		  System.out.println("Views option clicked");
		  Thread.sleep(1000);
		  
		  driver.findElementByXPath("//android.widget.TextView[@content-desc='Animation']").click();
		  System.out.println("Animation option clicked");
		  Thread.sleep(1000);
		  
		  driver.findElementByXPath("//android.widget.TextView[@content-desc='Push']").click();
		  System.out.println("Push option clicked");
		  Thread.sleep(1000);
		  
		  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView").click();
		  Thread.sleep(1000);
		  
		  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]").click();
		  System.out.println("Option 4 selected");
		  Thread.sleep(1000);
		  
		  driver.quit();
	}

}
