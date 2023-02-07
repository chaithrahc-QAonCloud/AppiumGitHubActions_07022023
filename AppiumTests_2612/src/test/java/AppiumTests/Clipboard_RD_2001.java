package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Clipboard_RD_2001 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
	   	  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage","io.selendroid.testapp");
		  cap.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(5000);
		  
		  //Entering the info under the Registration Window
		 
		  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("startUserRegistrationCD");
		  el1.click();
		  System.out.println("Registration button clicked");
		  Thread.sleep(2000);
		  
		  String text1 = "Ankitha";
		  driver.setClipboardText(text1);
		  MobileElement el2 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/inputUsername");
		  el2.click();
		  el2.clear();
		  el2.sendKeys(driver.getClipboardText());
		  Assert.assertEquals(text1,el2.getText());
		  Thread.sleep(2000);
		  System.out.println("User Name entered and assertion passed");
		  
		  
		  String text2 = "ankitha@hotmail.com";
		  driver.setClipboardText(text2);
		  MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("email of the customer");
		  el3.click();
		  el3.clear();
		  el3.sendKeys(driver.getClipboardText());
		  Assert.assertEquals(text2,el3.getText());
		  Thread.sleep(2000);
		  System.out.println("Email entered and assertion passed");
		  
		  
		  String text3 = "ankitha@appium2023";
		  int count1 = text3.length();
		  System.out.println(count1);
		  driver.setClipboardText(text3);
		  MobileElement el4 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/inputPassword");
		  el4.click();
		  el4.clear();
		  el4.sendKeys(driver.getClipboardText());
		  String textpwd = el4.getText();
		  int count2 = textpwd.length();
		  System.out.println(textpwd);
		  System.out.println(count2);
		  Assert.assertEquals(count1,count2);
		  System.out.print("Password length matched for both " +text3);
	      System.out.print(" and " +textpwd );
		//  Assert.assertEquals(text3,el4.getAttribute("text").equals("ankitha@appium2023"));
		  Thread.sleep(2000);
		  System.out.println("\n");
		  System.out.println("Password entered and assertion cannot be passed as the Password text is masked ");
		  
		  
		  String text4 = "Mrs. Ankitha Rao";
		  driver.setClipboardText(text4);
		  MobileElement el5 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/inputName");
		  el5.clear();
		  el5.click();
		  el5.sendKeys(driver.getClipboardText());
		  Assert.assertEquals(text4,el5.getText());
		  Thread.sleep(2000);
		  System.out.println("Name entered and assertion passed");
		  
		  MobileElement el6 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage");
		  el6.click();
		  System.out.println("Dropdown clicked");
		  
		  String text5 = "Python";
		  driver.setClipboardText(text5);
		  MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[4]");
		  Assert.assertEquals(text5,el7.getText());
		  Thread.sleep(2000);
		  el7.click();
		  Thread.sleep(2000);
		  System.out.println("Dropdown value selected and assertion passed");
		  
		  driver.quit();
		 
	}

}
