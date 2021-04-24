package SeleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Element_DoubleClick {
	@Test
	public void doubleClick() {
		LibraryFunctionBrowsers l=new LibraryFunctionBrowsers();
		WebDriver driver=l.launchBrowser("Chrome");
		driver.get("https://demoqa.com/buttons");
		Actions action = new Actions (driver);
		
		WebElement element= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(element).build().perform();
		
		 element= driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		 action.contextClick(element).build().perform();
	}


}
