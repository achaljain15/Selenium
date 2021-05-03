package SeleniumBasicFeatures;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Element_UploadFile {
	
	@Test
	public void upload() throws AWTException, InterruptedException {
		
	LibraryFunctionBrowsers lib=new LibraryFunctionBrowsers();
	WebDriver driver=lib.launchBrowser("Chrome");
	
	driver.get("https://demoqa.com/upload-download");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@for='uploadFile']")).click();
	
	Robot robo = new Robot();
	StringSelection cbpath= new StringSelection("C:\\Users\\ssand\\eclipse-workspace\\Automation Framework\\src\\testData\\CertificateOfCompletion_Carrier 101.pdf");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cbpath, null);

	Thread.sleep(2000);
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.delay(2000);
	robo.keyPress(KeyEvent.VK_ENTER);
	
	
	}

}
