package test.android.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumStartHuaWei {
	AppiumDriver<WebElement> driver= null;
	@BeforeClass
	 public void init() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		desiredCapabilities.setCapability("noReset",true);//��ֹ�ذ�װapp
		desiredCapabilities.setCapability("noSign", true);//���ñ�������ǩ��
		desiredCapabilities.setCapability("platformName", "android");
    	desiredCapabilities.setCapability("platformVersion", "8.1.0");
		desiredCapabilities.setCapability("deviceName", "OPPO");
		desiredCapabilities.setCapability("udid", "b9ba75ea");
//		desiredCapabilities.setCapability("app", "C:\\Users\\yangjuan.jiang\\Desktop\\AutomationTesting\\android-sdk_r24.4.1-windows\\aibizhi_87.apk");
		desiredCapabilities.setCapability("appActivity", "com.adesk.picasso.view.MainActivity");
		desiredCapabilities.setCapability("appPackage", "com.lovebizhi.wallpaper");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
//		desiredCapabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	  }
	
	
 
@Test
  public void fdddd() throws InterruptedException {
	  Thread.sleep(8000);
	  // uiautomator id
//	  driver.findElement(ByAndroidUIAutomator.id("com.lovebizhi.wallpaper:id/nav_persion_ll")).click();
	  // id
	  driver.findElement(By.id("com.lovebizhi.wallpaper:id/nav_persion_ll")).click();
	  // xpath
//	  driver.findElement(By.xpath(//android.widget.RelativeLayout/android.widget.LinearLayout[]))
//	  driver.findElement(By.id("com.lovebizhi.wallpaper:id/user_login_adesk_rl")).click();
	  Thread.sleep(2000);
	  
	  // register ע���¼
//	  driver.findElement(By.id("com.lovebizhi.wallpaper:id/user_register")).click(); 
//	  Thread.sleep(2000);
//      driver.findElement(By.id("com.lovebizhi.wallpaper:id/register_mail")).sendKeys("767525867@qq.com");
//      driver.findElement(By.id("com.lovebizhi.wallpaper:id/register_nickname")).sendKeys("jojo");
//      driver.findElement(By.id("com.lovebizhi.wallpaper:id/register_password")).sendKeys("qweqaz");
//      Thread.sleep(2000);
//      driver.findElement(By.id("com.lovebizhi.wallpaper:id/register_finish")).click();
	  
	  // login ��ע���û���¼
//	    driver.findElement(By.id("com.lovebizhi.wallpaper:id/user_name")).sendKeys("767525867@qq.com"); 
//	    driver.findElement(By.id("com.lovebizhi.wallpaper:id/user_pwd")).sendKeys("qweqaz"); 
//	    driver.findElement(By.id("com.lovebizhi.wallpaper:id/user_comment_login")).click(); 
	  
	  driver.findElement(By.id("com.lovebizhi.wallpaper:id/user_feedback_rl")).click();
	  
	  Set<String> contexts = driver.getContextHandles();
	  
	  

	  for(String context1 : contexts) {

	      System.out.println(context1);
	      if(context1.toUpperCase().contains("WEB")) {
	    	  driver.context(context1);
	      }

	      
	  //���ӡ��  NATIVE_APP��ԭ��app handle����WEBVIEW_com.example.testapp(webview�� handle)

	  }
	  System.out.print(driver.getPageSource());

	  
//	  Thread.sleep(3000);
//	  driver.close();
  }
}
