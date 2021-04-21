package SeleniumBasicFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class Elements_WebTable_W3 {

	WebDriver driver;

	@Test
	public void launch() {
		LibraryFunctionBrowsers lib = new LibraryFunctionBrowsers();
		driver = lib.launchBrowser("Chrome");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}

	@Test
	public void testTable() throws InterruptedException {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List<WebElement> col;
		Thread.sleep(2000);
		for (int r = 2; r <=rows.size(); r++) {
			col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + r + "]/td"));
			for (int c = 1; c <= col.size(); c++) 
				{
					WebElement ele = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + r + "]/td[" + c + "]"));
					System.out.print(ele.getText()+"\t\t");
				}
			System.out.println("");
		}
	}

}
