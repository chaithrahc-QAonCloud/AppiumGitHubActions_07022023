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

public class HybridApp_RD_2501 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("app", "C:\\apkfiles\\ApiDemos.apk");
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement viewClick = ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Views\")");
		  System.out.println(viewClick.getText());
		  viewClick.click();
		//  WebElement webViewClick = ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\"android.widget.TextView\").text(\"WebView\"))");
		  MobileElement element = (MobileElement) driver.findElement(
				  
					MobileBy.AndroidUIAutomator(
							"new UiScrollable(new UiSelector()).scrollIntoView("
							+ "new UiSelector().description(\"WebView\"));"));
		  
		  System.out.println(element.getText());
		  element.click();
		  Set<String> contextNames = driver.getContextHandles();
		  for (String contextName : contextNames) {
		      System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		  }
	}
}
