package test.android.demo;

import java.awt.Window;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserStartUp {
	AppiumDriver<WebElement> driver= null;
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\yangjuan.jiang\\Desktop\\selenuim\\ChromeDriver\\chromedriver.exe");
	
	@BeforeClass
	 public void init() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
    	desiredCapabilities.setCapability("platformName", "android");
    	desiredCapabilities.setCapability("platformVersion", "6.0");
		desiredCapabilities.setCapability("deviceName", "HUAWEI");
		desiredCapabilities.setCapability("udid", "T7G0215504015245");
		
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//		desiredCapabilities.setCapability("browserName", "Chrome");
		
		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		driver.get("http://m.ctrip.com/html5");
		
//		driver.get("http://www.baidu.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  }
	
  @Test
  public void f() {
	  driver.findElement(By.id("c_hotel")).click();
  }
}
