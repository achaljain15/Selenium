package SeleniumBasicFeatures;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Naukri {

	@Test(enabled = false)
	public void test() {
		LibraryFunctionBrowsers lib = new LibraryFunctionBrowsers();
		WebDriver driver = lib.launchBrowser("Chrome");
		driver.get("https://www.naukri.com");

		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String s : windows) {
			System.out.println(s);
			if (!s.equals(parent)) {
				driver.switchTo().window(s);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}

	@Test
	public void test2() {
		LibraryFunctionBrowsers lib = new LibraryFunctionBrowsers();
		WebDriver driver = lib.launchBrowser("Chrome");
		driver.get("https://www.naukri.com");
 
		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();

		/* Alternate path to click on Cognizant
		 * for (String s : windows) { driver.switchTo().window(s); List<WebElement> ele
		 * = driver.findElements(By.xpath("//img[@alt='Cognizant']")); if (ele.size() >
		 * 0) ele.get(0).click(); }
		 */
		
		for (String s : windows) {
				driver.switchTo().window(s); 
				if(driver.getTitle().equals("Cognizant")) {
		 driver.findElement(By.xpath("//img[@alt='Cognizant']")).click();
				}
	}
	}
}
