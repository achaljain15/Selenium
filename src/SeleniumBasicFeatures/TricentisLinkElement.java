

package SeleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TricentisLinkElement {
	
	@Test 
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ssand\\eclipse-workspace\\SeleniumProject\\Drivers\\chromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		//driver.findElement(By.id("nav_automobile")).click();
		driver.findElement(By.xpath("//*[@id='nav_automobile']")).click();
		driver.findElement(By.id("make")).click();
		WebElement w=driver.findElement(By.id("make"));		
		Select s=new Select(w);
		s.selectByIndex(2);
	}

}




