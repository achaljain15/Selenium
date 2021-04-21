package SeleniumBasicFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Elements_MouseHover_DragDrop {
	
	WebDriver driver;
	Actions action;
	
	@Test
	public void launch() {
		LibraryFunctionBrowsers lib=new LibraryFunctionBrowsers();
		driver=lib.launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	
	
	@Test(dependsOnMethods = "launch")
	public void hover() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//div[text()='Home']"));
		action= new Actions(driver);
		action.moveToElement(ele).build().perform();	
		ele=driver.findElement(By.xpath("//a[@class='_6WOcW9']"));
		ele.click();
		Thread.sleep(5000);
		ele=driver.findElement(By.xpath("//div[@class='HQL4QS _28DFQy']/div[@class='_3FdLqY']"));
		action.dragAndDropBy(ele, 50, 0).build().perform();
		
		}
	
	@Test(dependsOnMethods="launch")
	public void table() {
		driver.get("https://demoqa.com/webtables");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='rt-tbody']/div"));
		System.out.println(list.size());
	}
	}
