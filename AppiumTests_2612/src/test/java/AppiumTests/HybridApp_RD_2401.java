package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.StringUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class HybridApp_RD_2401 {


	
	AppiumDriver<MobileElement> driver;
	
	
	public void setUp()
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Redmi 9");
		cap.setCapability("app", "C:\\apkfiles\\ApiDemos.apk");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Session has started");
		System.out.println("Session is created");
	}
	
	public void getWebViewText() throws InterruptedException
	{
		System.out.println("First Current Context : "+driver.getContext());
		driver.findElementByAccessibilityId("Views").click();
		for(int i=0;i<=20;i++)
		{
			try {
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				driver.findElementByAccessibilityId("WebView").click();
				break;
			} catch (Exception e) {
				verticalSwipe();
			}
		}
		// Using this method we switch to web view
		switchContext("WEBVIEW");
		Thread.sleep(5000);
		String webViewText = driver.findElementByXPath("//android.view.View[@content-desc=\"Hello World! - 1\"]/android.widget.TextView").getText();
		driver.findElementByXPath("//android.view.View[@content-desc=\"Hello World! - 1\"]/android.widget.TextView").click();
		Thread.sleep(5000);
		System.out.println(webViewText);
		
		

		
	}
		
	
	public void switchContext(String context)
	{
		System.out.println("Before Switching : "+driver.getContext());
		Set<String> con = driver.getContextHandles();
		System.out.println(con);
		System.out.println("Available Contexts in the App are mentioned above");
		for(String c : con)
		{
			System.out.println("Available Context : "+c);
			 if (StringUtils.startsWithIgnoreCase(c, "WEBVIEW")) {
		           // log.debug("Switch to WEBVIEW");
		            driver.context(context);

		        }
		}
		
		System.out.println("After Switching : "+driver.getContext());
	}
	
	
	public void verticalSwipe()
	{
		/*
		 * Dimension dim = driver.manage().window().getSize(); int height =
		 * dim.getHeight(); int width = dim.getWidth(); int x = width/2; int starty =
		 * (int)(height*0.80); int endy = (int)(height*0.20);
		 * 
		 * TouchAction action = new TouchAction(driver);
		 * action.longPress(PointOption.point(x, starty)).moveTo(PointOption.point(x,
		 * endy)).release().perform(); System.out.println("Vertical Swipe is achieved");
		 */
		
		//*****************************
		
		/*
		 * MobileElement element = (MobileElement)
		 * driver.findElement(MobileBy.AndroidUIAutomator(
		 * "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
		 * ".scrollIntoView(new UiSelector().text(\"WebView\"))"));
		 */
		
		//*****************************
		
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height*0.80);
		int endy = (int)(height*0.20);
		TouchAction action = new TouchAction(driver);
		  action.longPress(PointOption.point(x, starty)).moveTo(PointOption.point(x,
		  endy)).release().perform(); 
		  
		 

	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		HybridApp_RD_2401 obj = new HybridApp_RD_2401();
		obj.setUp();
		obj.getWebViewText();
		obj.tearDown();
	}

}	



		
	

	 

	  

