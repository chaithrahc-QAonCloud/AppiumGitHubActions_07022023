package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest_2712 {

	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) {
		try {
		opencalci();
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
  public static void opencalci() throws Exception
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
  }
}
