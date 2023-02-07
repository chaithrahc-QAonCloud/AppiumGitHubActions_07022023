package AppiumTests;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddContacts_2701 {

	AndroidDriver driver;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	FileInputStream fis;
	
	@BeforeTest
	
	public void g() throws IOException
	
	{
		
		File src = new File("C:\\apkfiles\\TestData.xlsx"); 
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
	}
	
	@Test
	
	public void main() throws MalformedURLException, InterruptedException
	
	{
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage","com.android.contacts");  //Contacts
		  cap.setCapability("appActivity","com.android.contacts.DialtactsContactsEntryActivity");  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement>  driver = new AndroidDriver<WebElement>(url, cap);
		  
		  //Import the test data
		  
		  for(int i= 0; i<2 ; i++)
			  
		  {
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  driver.findElement(By.id("android:id/icon")).click();
			  System.out.println("Add Contacts icon is clicked");
			  Thread.sleep(2000);
			  System.out.println("Manual click on Saving option");
			//  driver.findElement(By.xpath("//android.widget.LinearLayout[@bounds='[0,661][720,794]']")).click();
			  
			  List<WebElement> list = driver.findElementsByClassName("android.widget.EditText");
			  String data0 = sheet.getRow(i).getCell(0).getStringCellValue();  
			  list.get(0).sendKeys(data0);  //Name
			  Thread.sleep(3000);
			  System.out.println("Name entered");
			  
			  String data1 = sheet.getRow(i).getCell(1).getStringCellValue();
			  list.get(1).sendKeys(data1);  //Company
			  Thread.sleep(3000);
			  System.out.println("Company entered");
			  
			  String data2 = sheet.getRow(i).getCell(2).getStringCellValue();
			  list.get(2).sendKeys(data2);  //Title
			  Thread.sleep(3000);
			  System.out.println("Title entered");
			  
			//  driver.pressKey(new KeyEvent(AndroidKey.ENTER));   //Enter Key pressed
			  DataFormatter formatter =new DataFormatter();
			  String data3 = formatter.formatCellValue(sheet.getRow(i).getCell(3));
			  list.get(3).sendKeys(data3);  //Phone Number
			  Thread.sleep(3000);
			  System.out.println("Phone Number entered"); 
			  
			 
			  String data4 = sheet.getRow(i).getCell(4).getStringCellValue();
			  list.get(4).sendKeys(data4);  //Work Email
			  Thread.sleep(3000);
			  System.out.println("Email entered"); 
				 
			  
			  
			  driver.findElement(By.id("android:id/button2")).click();   //Save button clicked
			  Thread.sleep(5000);
			  System.out.println("Save button clicked"); 
				 
			  driver.pressKey(new KeyEvent(AndroidKey.HOME));
			  System.out.println("Navigated to Home Screen"); 
				 
			  
			 // driver.findElementByXPath("//android.widget.ImageView[@content-desc='Contacts']").click(); // Icons on Home Screen as a List 
			  List<WebElement> list1 = driver.findElements(By.className("android.widget.ImageView"));
			  list1.get(3).click();
			  System.out.println("Contacts icon clicked"); 
				 
			  Thread.sleep(2000);
		  }
		  
		  System.out.println("We have created the Contacts on the device from the test data in Excel sheet "); 
			 driver.quit();
	}
}
