package monday1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class apple {
	AppiumDriver driver;
	@Test
	
	void test1()
	{
		driver.findElement(AppiumBy.id("Animation"));  // element find karne ka tarika hain
	}
	
	
	public void TestRunner() throws InterruptedException, MalformedURLException
	
		{

		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:app", "storage:filename=ApiDemosdebug.apk");  // The filename of the mobile app
		caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
		caps.setCapability("appium:platformVersion", "15.0");
		caps.setCapability("appium:automationName", "UiAutomator2");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("appiumVersion", "2.11.0");
		sauceOptions.setCapability("username", "oauth-jirk08129-f9486");
		sauceOptions.setCapability("accessKey", "9550e85d-88e7-425c-a6a8-4b08226acd49");
		sauceOptions.setCapability("build", "<your build id>");
		sauceOptions.setCapability("name", "<your test name>");
		sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
		caps.setCapability("sauce:options", sauceOptions);

		// Start the session
		@SuppressWarnings("deprecation")
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		AndroidDriver driver = new AndroidDriver( caps);

		// replace with commands and assertions
		Thread.sleep(5000);
		String jobStatus = "passed"; // or "failed"

		// end the session
		driver.executeScript("sauce:job-result=" + jobStatus);
		driver.quit();
		}
	
	public static void main(String arg[]) {
		apple aa=new apple();
		aa.test1();
	}
}
	

