package SeleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Element_Click {


	@Test
	@Parameters("browser")
	public void testDynamicClick(String browser) {		
		LibraryFunctionBrowsers l=new LibraryFunctionBrowsers();
		WebDriver driver=l.launchBrowser(browser);
		//Navigate to URL- Click Buttons page
		driver.get("https://demoqa.com/buttons");
		System.out.println(Thread.currentThread());
		//Maximize
		driver.manage().window().maximize();
		
		//Third button click
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();	
	}
}
