package SeleniumBasicFeatures;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_Windows {
	WebDriver driver;
	Actions action;

	@Test
	public void launch() {
		LibraryFunctionBrowsers lib = new LibraryFunctionBrowsers();
		driver = lib.launchBrowser("Chrome");
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "launch", enabled = false)
	public void newTab() {
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		Set<String> windows = driver.getWindowHandles();
		String firstTab = driver.getWindowHandle();
		for (String s : windows) {
			if (!s.equals(firstTab)) {
				driver.switchTo().window(s);
				System.out.println("New Tab opened and tab title is " + driver.getCurrentUrl());
			}
		}

	}

	@Test
	public void testWindows() {
		driver.get("https://demoqa.com/browser-windows");
		String firstTab = driver.getWindowHandle();
		int afterCount;
		driver.findElement(By.id("windowButton")).click();
		Set<String> windows = driver.getWindowHandles();
		afterCount = windows.size();
		if (afterCount == 2) {
			for (String s : windows)
				if (!s.equals(firstTab))
					System.out.println(driver.switchTo().window(s).getTitle());
		}
	}

	@Test
	public void testNewWindowText() {
		driver.get("https://demoqa.com/browser-windows");
		String firstTab = driver.getWindowHandle();
		int afterCount;
		driver.findElement(By.id("messageWindowButton")).click();
		Set<String> windows = driver.getWindowHandles();
		afterCount = windows.size();
		if (afterCount == 2) {
			for (String s : windows)
				if (!s.equals(firstTab)) {
					System.out.println(driver.switchTo().window(s).getTitle());
			System.out.println(driver.findElement(By.xpath("/html/body[contains(text().'Knowledge')]")).getText());
				}
		}
	}
}
