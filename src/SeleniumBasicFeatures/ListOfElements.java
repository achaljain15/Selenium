package SeleniumBasicFeatures;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class ListOfElements {
	@Test 
	public void test1() throws InterruptedException
	{
	
	//Link, WebElement, text box, button, alerts, pop up, drop down, radio button, check box,image, combo box, iframe, tool tip
	//window based pop up, web table, multiple window
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ssand\\eclipse-workspace\\SeleniumProject\\Drivers\\chromeDriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
	WebDriver driver=new ChromeDriver(options);	
	driver.get("https://demoqa.com/links");
	driver.manage().window().maximize();
		
	WebElement element= driver.findElement(By.id("simpleLink"));
	//System.out.println("Element get text "+element.getText());
	Assert.assertEquals(element.getText(), "Home");
	//Verify.verifyNotNull(element.getText(), "Homen");
	System.out.println(driver.getTitle());
	
	String parent=driver.getWindowHandle();
	Set <String> win= driver.getWindowHandles();
	int countbefore= win.size();
	System.out.println("Count of windows before click-" + countbefore);
	 
	element.click();
	System.out.println(driver.getTitle());
	win= driver.getWindowHandles();
	 int countafter=win.size();
	 System.out.println("Count of windows after click-" + countafter);
	Assert.assertEquals(countafter, countbefore+1);
	//Verify.verify(true, parent, countafter, countbefore+1);
	
	for(String s : win)
	if(!s.equals(parent))
	{
		Thread.sleep(2000);
		driver.switchTo().window(s);
		driver.close();
	}
	

}
}