package SeleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Element_DropDown {
	@Test
	public void test1() {
		
		LibraryFunctionBrowsers lib=new LibraryFunctionBrowsers();
		WebDriver driver=lib.launchBrowser("Chrome");
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		
		WebElement drop= driver.findElement(By.id("make"));
		
		Select select=new Select(drop);
		select.selectByIndex(3);
		select.selectByVisibleText("Mazda");
		select.selectByValue("BMW");
	}

}
