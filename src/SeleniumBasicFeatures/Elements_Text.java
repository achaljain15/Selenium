package SeleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Elements_Text {
	@Test
	public void testTextBox() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssand\\eclipse-workspace\\SeleniumProject\\Drivers\\chromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver=new ChromeDriver(options);	
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
			
		//click on TextBox item element link, enter text and submit
		driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@placeholder='Full Name']")).sendKeys("Achal Jain");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)"); Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//scroll to end of page height
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
}
