package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class SendSMS_2912 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage","com.android.mms");  //Messaging
		  cap.setCapability("appActivity","com.android.mms.ui.ComposeMessageRouterActivity");
		  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement>  driver = new AndroidDriver<WebElement>(url, cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(5000);
		 	
		
		  driver.findElementByXPath("//android.widget.ImageView[@content-desc='Choose recipients']").click();
		  System.out.println("Contact Icon clicked");
		  driver.findElementByXPath("//android.view.View[@content-desc='S']").click();
		  System.out.println("Clicked on the letter S in the list");
		  driver.findElementByXPath("//android.widget.TextView[@text='Sathya Madam QoC']").click();	  
		  System.out.println("Clicked on the Contact Name");
		  driver.findElementById("com.android.contacts:id/action_menu_item_child_icon").click();
		  System.out.println("Clicked on OK button");
		  driver.findElementById("com.android.mms:id/embedded_text_editor").sendKeys("Good Evening");
		  System.out.println("Typed the message in the editor");
		  driver.findElementById("com.android.mms:id/send_button").click();
		  System.out.println("Clicked on SEND button");
		  Thread.sleep(5000);
		  driver.quit();


	}

}
