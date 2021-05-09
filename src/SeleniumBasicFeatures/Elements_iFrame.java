package SeleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements_iFrame {
	
	public static void main(String[] args) {
		WebDriver driver;
		LibraryFunctionBrowsers lib=new LibraryFunctionBrowsers();
		driver=lib.launchBrowser("Chrome");
		driver.manage().window().maximize();
		
		driver.get("https://paytmmall.com/");
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		//driver.findElement(null)
		
	}

}
