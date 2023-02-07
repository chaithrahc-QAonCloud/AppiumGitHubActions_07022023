package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorActions_RD_2712 {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try {
			calcifunction();
			}
			catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}

	}
	 public static void calcifunction() throws Exception
	  {
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage","com.miui.calculator");
		  cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  driver = new AppiumDriver<MobileElement>(url, cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(2000);
		  
		  WebElement four=driver.findElementById("com.miui.calculator:id/btn_4_s");  //capture the number 4
		  four.click();
		  
		  driver.findElementById("com.miui.calculator:id/btn_plus_s").click(); //click on the add button
		  
		  WebElement nine=driver.findElementById("com.miui.calculator:id/btn_9_s");  //capture the number 9
		  nine.click();
		  
		  driver.findElementById("com.miui.calculator:id/btn_equal_s").click(); //click on the equal button
		  Thread.sleep(3000);
		  
		  String results=driver.findElementById("com.miui.calculator:id/result").getText();
		 
		  
		  if(results.equals("= 13"))
		  {
			  System.out.println("Addition Test Passed");
		  }
		  
		  else
		  {
			  System.out.println("Addition Test Failed");
		  }
		  Thread.sleep(7000);
		  driver.quit();
	  }
}
