package SeleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Element_Checkbox {

	@Test
	public void testCheckbox() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssand\\eclipse-workspace\\SeleniumProject\\Drivers\\chromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://demoqa.com/links");
			driver.manage().window().maximize(); 
			
			driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul[1]/li[@id=\"item-1\"]")).click();
			System.out.println("Checkbox menu clicked");
			
			System.out.println("Clicking on drop arrow button for more option to be visible under Home button");
			driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button")).click();
			driver.findElement(By.xpath("//label[@for='tree-node-home']/span")).click();
			System.out.println("Home Button Check box checked "+driver.findElement(By.xpath("//label[@for='tree-node-home']/span")).isSelected());
			
			System.out.println(driver.findElement(By.xpath("//*[@class='rct-checkbox']")).isSelected());
			System.out.println("Unchecking checkbox for 2nd one - Documents");
			driver.findElement(By.xpath("//label[@ for='tree-node-documents']/span")).click();
				
	
	}
	
}
