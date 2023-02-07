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

public class VerticalScroll_RD_0301 {

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
	//	driver.findElementsById("android:id/text1").get(10).click(); // Get the option Views whose index value is 10
	//	WebElement test = driver.findElement(By.id("android:id/text1[contains(@index='10')]"));   //Resource ID clubbed with Attributes
		
		//Capturing all the elements
		AndroidElement list = (AndroidElement) driver.findElementById("android:id/text1");
		MobileElement listitem = (MobileElement) driver.findElement(
				
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().description(\"Popup Menu\"));"));
		
		System.out.println(listitem.getText());
		System.out.println(listitem.getLocation());
		listitem.click();
		
		//Working on the listitem selected
		System.out.println("Item clicked");
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Make a Popup!']")).click();  
		System.out.println("Pop up button clicked");
		Thread.sleep(2000);
		driver.quit();


	}

}
