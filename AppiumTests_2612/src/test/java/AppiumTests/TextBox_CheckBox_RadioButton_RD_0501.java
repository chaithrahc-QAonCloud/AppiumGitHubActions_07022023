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

public class TextBox_CheckBox_RadioButton_RD_0501 {

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
			  
			  WebElement Views = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']"));
			  Views.click();
			  System.out.println("Clicked on Views Option");
			  Thread.sleep(2000);
			  WebElement Controls = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Controls']"));
			  Controls.click();
			  System.out.println("Clicked on Controls Option");
			  Thread.sleep(2000);
			  WebElement Darktheme = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2. Dark Theme']"));
			  Darktheme.click();
			  System.out.println("Clicked on Dark Theme Option");
			  Thread.sleep(2000);
			  WebElement InputBox = driver.findElement(By.id("io.appium.android.apis:id/edit"));
			  InputBox.click();
			  InputBox.sendKeys("This in an InputBox");
			  System.out.println("Input Box has been tested");
			  Thread.sleep(2000);
			  WebElement CheckBox = driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc='Checkbox 1']"));
			  CheckBox.click();
			  System.out.println("Check Box has been tested");
			  Thread.sleep(2000);
			  WebElement RadioButton = driver.findElement(By.id("io.appium.android.apis:id/radio2"));
			  RadioButton.click();
			  System.out.println("Radio Button has been tested");
			  Thread.sleep(2000);
			  WebElement Star = driver.findElement(By.id("io.appium.android.apis:id/star"));
			  Star.click();
			  System.out.println("Star symbol has been clicked");
			  Thread.sleep(2000);
			  WebElement ToggleButton = driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
			  ToggleButton.click();
			  System.out.println("Toggle Button has been clicked");
			  Thread.sleep(2000);
			  WebElement Dropdown = driver.findElementById("io.appium.android.apis:id/spinner1");
			  Dropdown.click();
			  System.out.println("Dropdown has been clicked");
			  WebElement DDElement = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Jupiter']");
			  DDElement.click();
			  System.out.println("Dropdown element has been clicked");
			  Thread.sleep(2000);
			  driver.quit();
	}

}
