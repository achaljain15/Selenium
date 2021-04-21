package SeleniumBasicFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstSelenium {

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ssand\\eclipse-workspace\\SeleniumProject\\Drivers\\chromeDriver.exe");

		// To Remove string on Chrome browser- Chrome is being controlled by automated
		// test software
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);

		/*
		 * Option 2- for removing the string ChromeOptions options = new
		 * ChromeOptions(); options.setExperimentalOption("useAutomationExtension",
		 * false);
		 * options.setExperimentalOption("excludeSwitches",Collections.singletonList(
		 * "enable-automation")); WebDriver driver = new ChromeDriver(options);
		 */

		driver.manage().window().maximize();
		driver.get("http:\\www.google.com");
		driver.get("http:\\www.facebook.com");
		System.out.println(driver.getTitle());

		// driver.close();

	}
}
