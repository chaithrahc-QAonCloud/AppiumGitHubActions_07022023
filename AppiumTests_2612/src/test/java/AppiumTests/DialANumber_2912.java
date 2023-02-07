package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class DialANumber_2912 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage","com.android.contacts");  //Contacts
		  cap.setCapability("appActivity","com.android.contacts.DialtactsContactsEntryActivity");
		//  cap.setCapability("appActivity","com.android.contacts.activities.TwelveKeyDialer");
		//  cap.setCapability("appPackage","com.android.server.telecom");  //Call Management
		//  cap.setCapability("appActivity","com.android.server.telecom.components.ErrorDialogActivity");
		  
		  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement>  driver = new AndroidDriver<WebElement>(url, cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(5000);
		  MobileElement Image1= (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@bounds='[215,55][335,171]']");
		  Image1.click();
		  System.out.println("Phone icon clicked");
		  WebElement Num1=driver.findElementById("com.android.contacts:id/nine");
		  Num1.click();
		  WebElement Num2=driver.findElementById("com.android.contacts:id/nine");
		  Num2.click();
		  WebElement Num3=driver.findElementById("com.android.contacts:id/four");
		  Num3.click();
		  WebElement Num4=driver.findElementById("com.android.contacts:id/zero");
		  Num4.click();
		  WebElement Num5=driver.findElementById("com.android.contacts:id/eight");
		  Num5.click();
		  WebElement Num6=driver.findElementById("com.android.contacts:id/eight");
		  Num6.click();
		  WebElement Num7=driver.findElementById("com.android.contacts:id/zero");
		  Num7.click();
		  WebElement Num8=driver.findElementById("com.android.contacts:id/nine");
		  Num8.click();
		  WebElement Num9=driver.findElementById("com.android.contacts:id/eight");
		  Num9.click();
		  WebElement Num10=driver.findElementById("com.android.contacts:id/five");
		  Num10.click();
		  Thread.sleep(5000);
		  WebElement Dialbutton=driver.findElementById("com.android.contacts:id/single_call_button");
		  Dialbutton.click();
		  System.out.println("Dialicon button clicked");
		  System.out.println("Connecting to the person");
			  
		//  WebElement Cancel=driver.findElementByXPath("//android.widget.Button[@bounds='[53,1358][347,1449]']");
		 // Cancel.click();
		//  WebElement TurnOff=driver.findElementById("android:id/button1");
		 // TurnOff.click();
		  Thread.sleep(3000);
		  driver.quit();
		
	}

}
