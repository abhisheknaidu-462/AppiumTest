import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver;
		
		//AndroidDriver driver;
		
		try {
			openCalculator();
		} catch(Exception exception) {
			System.out.println("Exception");

			System.out.println(exception.getCause());
		}
		

	}

	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pixel_2_API_29_Q");
		cap.setCapability("udid", "emulator-5556");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.ca.mas.masunit"); //com.ca.mas.masunit.MASMainActivity - MASUnit Tests
		cap.setCapability("appActivity", "com.ca.mas.masunit.MASMainActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		System.out.println(url);

		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started.........");
	}
}
