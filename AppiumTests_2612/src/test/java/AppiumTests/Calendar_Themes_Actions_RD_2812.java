package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Calendar_Themes_Actions_RD_2812 {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
	
		try {
			calendarfunction();
			}
			catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}
	}
	 public static void calendarfunction() throws Exception
	  {
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage","com.xiaomi.calendar");
		  cap.setCapability("appActivity","com.miui.calendar.detail.SubscribeGroupActivity");
		  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  driver = new AppiumDriver<MobileElement>(url, cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(2000);
		  
		  WebElement cobwheel=driver.findElementById("com.xiaomi.calendar:id/setting_icon");  //click on cobwheel
	      cobwheel.click();
	      Thread.sleep(2000);
		  
		  
		  WebElement Menu=driver.findElementById("com.xiaomi.calendar:id/subscribe_channel_title_root");  //click on Menu
		  Menu.click();
		  Thread.sleep(2000);
		  
		  WebElement Back1=driver.findElementById("com.xiaomi.calendar:id/up"); //click on Back button
		  Back1.click();
		  Thread.sleep(2000);
		  
		  WebElement button=driver.findElementById("com.xiaomi.calendar:id/back_icon"); //click on Button
		  button.click();
		  
		  
		  Thread.sleep(7000);
		  
		  //Themes icon
		  
		  MobileElement Themes= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Themes']"));  //Click on the Themes icon
		  Themes.click();
		  
		  Thread.sleep(5000);
		  
		  MobileElement search= (MobileElement) driver.findElementByXPath("//android.widget.TextSwitcher[@content-desc='Search']/android.widget.TextView");
		  search.click();
		  Thread.sleep(2000);
		  MobileElement searchtext= (MobileElement) driver.findElementById("com.android.thememanager:id/search_view");
		  Thread.sleep(2000);
		  searchtext.clear();
		  searchtext.sendKeys("Nature");
		  Thread.sleep(2000);
		//  searchtext.sendKeys(Keys.ENTER);
		  WebElement options=driver.findElementById("com.android.thememanager:id/thumbnail");
		  options.click();
		  Thread.sleep(5000);
		  MobileElement Image= (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@bounds='[480,331][693,896]']");
		  Image.click();
		  Thread.sleep(5000);
		  
		 	  }

}
