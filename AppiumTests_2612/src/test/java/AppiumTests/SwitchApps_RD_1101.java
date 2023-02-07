package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class SwitchApps_RD_1101 {

	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  
		  //Launching the Calculator App
		  cap.setCapability("appPackage","com.miui.calculator");
		  cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		  
		  System.out.println("Calculator Application Started");
		  Thread.sleep(2000);
		  
		// driver.executeScript("mobile: startActivity",ImmutableMap.of("intent","com.miui.weather2.ActivityWeatherMain"));
		  
		
		  //Launching the Weather App
	      driver.startActivity(new Activity("com.miui.weather2","com.miui.weather2.ActivityWeatherMain"));
	      System.out.println("Weather Application Started");
		  Thread.sleep(3000);
		  
		  driver.findElementById("com.miui.weather2:id/daily_forecast_more").click();   //Forecast
		  Thread.sleep(1000);
		  System.out.println("Forecast window opened");
		  
		  driver.findElementById("com.miui.weather2:id/up").click();   //Back button
		  Thread.sleep(1000);
		  System.out.println("Back button clicked");
		  
		  driver.findElementById("com.miui.weather2:id/activity_main_add_city").click();  //Click on + icon
		  Thread.sleep(1000);
		  System.out.println("Add city button clicked");
		  
		  driver.findElementById("com.miui.weather2:id/view_bg").click();
		  Thread.sleep(1000);
		  driver.findElementById("com.miui.weather2:id/act_find_city_key").sendKeys("Bangalore");  //Select a location
		  System.out.println("Location typed in");
		  driver.findElementById("com.miui.weather2:id/ll_search_city_item_parent").click();  //Click on the Location
		  System.out.println("Clicked on the Location");
		  driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Add to start page']")).click();  //Add the location to Start Page
		  System.out.println("Added the location to Start Page");
		  driver.findElementById("com.miui.weather2:id/fl_daily_forecast_detail_go_home").click();   //View on Start Page
		  System.out.println("View the location on Start Page");
		  Thread.sleep(2000);
		  System.out.println("City added on the Start Page");
		  Thread.sleep(2000);
		  driver.findElementById("com.miui.weather2:id/activity_main_add_city").click();
		  System.out.println("Verify if the location weather details exists");
		  Thread.sleep(2000);
		  
		  String Locationvalue = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[53,698][202,742]']")).getText();
		  System.out.println(Locationvalue);
		  
		  if(Locationvalue.equals("Bengaluru"))
		  {
			  System.out.println("Weather details obtained for the selected location");
		  }
		  
		  else
		  {
			  System.out.println("Please check the script and re-execute");
		  }
		  
		  driver.quit();
		  
		  
		  
		 
	}

}
