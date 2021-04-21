package SeleniumBasicFeatures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Element_Alert {
@Test
public void alerts() throws InterruptedException {
	LibraryFunctionBrowsers lib=new LibraryFunctionBrowsers();
	WebDriver driver= lib.launchBrowser("Chrome");
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	Thread.sleep(1000);
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	alert.dismiss();
	String result= driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
	System.out.println(result);
	if(result.equals("You selected Cancel"))
	{
		System.out.println("Cancel success");
		System.out.println(result);
	}
	
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	alert.sendKeys("Achal Sameer");
	alert.accept();
	
}
}
