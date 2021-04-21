package SeleniumBasicFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolsQATable {

	WebDriver driver;
	Actions action;

	@Test
	public void launch() {
		LibraryFunctionBrowsers lib = new LibraryFunctionBrowsers();
		driver = lib.launchBrowser("Chrome");
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "launch")
	public void table() {
		driver.get("https://demoqa.com/webtables");
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='rt-tbody']/div"));
		System.out.println(row.size());
		List<WebElement> col;
		for (int r = 0; r <= row.size(); r++) 
		{
			col = driver.findElements(By.xpath("//div[@class='rt-tbody']/div[" + r + "]"));
			for (int c = 1; c <= col.size(); c++)
			{
				WebElement ele=driver.findElement(By.xpath("//div[@class='rt-tbody']/div["+r+"]/div["+c+"]"));
				if((ele.getText()).equals(""))
					break;
				System.out.println(ele.getText());
				System.out.println();
			}
		}
	}
}
