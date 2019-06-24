package test.android.demo;

import java.net.MalformedURLException;
import java.net.URL;

import javax.naming.Context;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;

public class AppiumStartOPPO {
	AppiumDriver<WebElement> driver= null;
	@BeforeClass
	 public void init() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		desiredCapabilities.setCapability("noReset",true);//防止重安装app
		desiredCapabilities.setCapability("noSign", true);//设置避免重新签名
		desiredCapabilities.setCapability("platformName", "android");
    	desiredCapabilities.setCapability("platformVersion", "6.0");
		desiredCapabilities.setCapability("deviceName", "HUAWEI");
		desiredCapabilities.setCapability("udid", "T7G0215504015245");
//		desiredCapabilities.setCapability("app", "C:\\Users\\yangjuan.jiang\\Desktop\\AutomationTesting\\android-sdk_r24.4.1-windows\\aibizhi_87.apk");
		desiredCapabilities.setCapability("appActivity", "com.adesk.picasso.view.MainActivity");
		desiredCapabilities.setCapability("appPackage", "com.lovebizhi.wallpaper");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	  }
	
	
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(8000);
	  // uiautomator id
//	  driver.findElement(ByAndroidUIAutomator.id("com.lovebizhi.wallpaper:id/nav_persion_ll")).click();
	  // id
	  driver.findElement(By.id("com.lovebizhi.wallpaper:id/nav_persion_ll")).click();
	  // xpath
//	  driver.findElement(By.xpath(//android.widget.RelativeLayout/android.widget.LinearLayout[]))
	  driver.findElement(By.id("com.lovebizhi.wallpaper:id/user_login_adesk_rl")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("com.lovebizhi.wallpaper:id/user_register")).click(); 
	  Thread.sleep(2000);
      driver.findElement(By.id("com.lovebizhi.wallpaper:id/register_mail")).sendKeys("767525867@qq.com");
      driver.findElement(By.id("com.lovebizhi.wallpaper:id/register_nickname")).sendKeys("jojo");
      driver.findElement(By.id("com.lovebizhi.wallpaper:id/register_password")).sendKeys("qweqaz");
      Thread.sleep(2000);
      driver.findElement(By.id("com.lovebizhi.wallpaper:id/register_finish")).click();
  }
}
