package shreyamukherjeedemo;

import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class AppiumBasics  {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
	/*	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Shreya Mukherjee//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		*/
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("ShreyaPhone");
		options.setApp("C://Users//Shreya Mukherjee//eclipse-workspace//Learning//src//test//java//resources//ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		//service.stop();
		driver.quit();
		 
		
		
		
	}


}
