package SeleniumBasicFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LibraryFunctionBrowsers {
	WebDriver driver;
	public WebDriver launchBrowser(String browser) {
	//	WebDriver driver= null;
		
		if(browser.equals("Chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ssand\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver(options);
		}
		else if(browser.equals("Firefox"))
	{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ssand\\eclipse-workspace\\SeleniumProject\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
	}
		return driver;
	}

}
