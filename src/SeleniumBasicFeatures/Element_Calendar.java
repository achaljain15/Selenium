package SeleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Element_Calendar {
	@Test
	public void testCal() {
	LibraryFunctionBrowsers lib=new LibraryFunctionBrowsers();
	WebDriver driver;
	
	driver=lib.launchBrowser("Chrome");
	driver.manage().window().maximize();	
	driver.get("http://sampleapp.tricentis.com/101/app.php");
	driver.findElement(By.xpath("//*[@id='opendateofmanufacturecalender']/i")).click();
	
	String expYear="2017";
	String expMonth="March";
	String expdate="10";
	
	//Year
	WebElement year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
	WebElement back=driver.findElement(By.xpath("//a[@title='Prev']"));
	
	String actYear=year.getText();
	while(!actYear.equals(expYear))
	{
		back=driver.findElement(By.xpath("//a[@title='Prev']"));
		back.click();
		year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		actYear=year.getText();
	}

	//Year
		WebElement month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				
		String actMonth=year.getText();
		while(!actMonth.equals(expMonth))
		{
			back=driver.findElement(By.xpath("//a[@title='Prev']"));
			back.click();	
			month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			actMonth=month.getText();
		}
		
		//Date
		
		WebElement date=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='"+expdate+"']"));
		date.click();

}
}
