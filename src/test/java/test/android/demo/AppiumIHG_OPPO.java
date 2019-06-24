package test.android.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;

@Test
public class AppiumIHG_OPPO {
	AppiumDriver<WebElement> driver= null;
	@BeforeClass
	 public void init() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		desiredCapabilities.setCapability("noReset",true);//防止重安装app
		desiredCapabilities.setCapability("noSign", true);//设置避免重新签名
		desiredCapabilities.setCapability("platformName", "android");
    	desiredCapabilities.setCapability("platformVersion", "8.1.0");
		desiredCapabilities.setCapability("deviceName", "OPPO");
		desiredCapabilities.setCapability("udid", "b9ba75ea");
		desiredCapabilities.setCapability("app", "C:\\Users\\yangjuan.jiang\\Desktop\\New folder\\Rewards-china-Staging-debug.apk");
		desiredCapabilities.setCapability("appActivity", ".activity.deeplink.DeepLinkActivity");
		desiredCapabilities.setCapability("appPackage", "com.ihg.apps.android");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	  }
	
  public void f() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(ByAndroidUIAutomator.className("android.widget.Button")).click();
	  Thread.sleep(2000);
	  driver.findElement(ByAndroidUIAutomator.className("android.widget.TextView")).click();
	  Thread.sleep(2000);
	  driver.findElement(ByAndroidUIAutomator.id("com.ihg.apps.android:id/sign_in_member_id")).sendKeys("133785675");
	  driver.findElement(ByAndroidUIAutomator.id("com.ihg.apps.android:id/sign_in_pin")).sendKeys("1232");
	  driver.findElement(ByAndroidUIAutomator.id("com.ihg.apps.android:id/sign_in_action_btn")).click();
	  
	  Set<String> contexts = driver.getContextHandles();
	  
	  

	  for(String context1 : contexts) {

	      System.out.println(context1);
	      if(context1.toUpperCase().contains("WEB")) {
	    	  driver.context(context1);
	      }

	      
	  //会打印出  NATIVE_APP（原生app handle）和WEBVIEW_com.example.testapp(webview的 handle)

	  }
	  System.out.print(driver.getPageSource());
	  
//	  Thread.sleep(5000);
//	  driver.close();
	  

  }
}
