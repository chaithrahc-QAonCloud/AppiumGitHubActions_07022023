package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Clipboard_VD_2001 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Pixel 5");
		  cap.setCapability("udid","emulator-5554");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","9.0");
		  cap.setCapability("app","C:\\apkfiles\\ApiDemos.apk");
		 
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(5000);
		  
		  driver.findElementByXPath("//android.widget.TextView[@content-desc=\"App\"]").click();
		  System.out.println("App option clicked");
		  Thread.sleep(1000);
		 
		  driver.findElementByXPath("//android.widget.TextView[@content-desc='Alert Dialogs']").click();
		  System.out.println("Activity option clicked");
		  Thread.sleep(1000);
		  
		  driver.findElementByXPath("//android.widget.Button[@content-desc='Text Entry dialog']").click();
		  System.out.println("Text Entry dialog clicked");
		  Thread.sleep(1000);
		  
		  String text1 = "Bhanu";
		  driver.setClipboardText(text1);
		  WebElement Name = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[1]");
		  Name.click();
		  Name.clear();
		  Name.sendKeys(driver.getClipboardText());
		  Assert.assertEquals(text1,Name.getText());
		  Thread.sleep(2000);
		  System.out.println("Name entered and assertion passed");
		  
		  
		  String text2 = "Bhanu@12345%";
		  driver.setClipboardText(text2);
		  int count1 = text2.length();
		  MobileElement Pwd = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[2]");
		  Pwd.click();
		  Pwd.clear();
		  Pwd.sendKeys(driver.getClipboardText());
		  String PWD = Pwd.getText();
		  int count2 = PWD.length();
		  Assert.assertEquals(count1,count2);
		  
		  System.out.println(count1);
		  System.out.println(count2);
		  Thread.sleep(2000);
		  System.out.println("Password entered and assertion passed for length of Password");
		  Thread.sleep(3000);
		  
		  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]").click();
		  System.out.println("OK button clicked");
		  driver.navigate().back();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  Thread.sleep(1000);
		 
			}

}
