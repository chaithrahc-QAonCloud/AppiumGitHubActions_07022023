package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorActions_MobElmnt_2712 {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		
		try {
			calcifunction_MobElmnt();
			}
			catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}
	}
	 public static void calcifunction_MobElmnt() throws Exception
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
		  
		  MobileElement five=driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));  //capture the number 5
		  five.click();
		  
		  MobileElement plus=driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
				  plus.click(); //click on the add button
				  
		  MobileElement two=driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));  //capture the number 2
			  two.click();
			// MobileElement twoo=driver.findElement(By.xpath("//classname[@resource-id='com.miui.calculator:id/btn_2_s']"));  //capture the number 2
			//  twoo.click();
		  
		  
		  MobileElement equal= driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		  equal.click(); //click on the equal button
		  Thread.sleep(3000);
		  
		  String results=driver.findElement(By.id("com.miui.calculator:id/result")).getText();
		 
		  System.out.println("Result is : "+results);
		  if(results.equals("= 7"))
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
