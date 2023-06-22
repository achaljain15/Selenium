package com.cdk;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

@Slf4j
public class FirstSel {
    public static void main(String args[])

    {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\jainac\\workspace\\Sele\\src\\test\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\demoqa.com\\widgets");
        driver.manage().window().maximize();
//        Assert.assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText(),"HOME");
        Assert.assertEquals(driver.findElement(By.className("main-header")).getText(),"Widgets");
        log.info("Home is present");
        driver.get("https://demoqa.com/links");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        for(WebElement elements: list)
            System.out.println(elements.getText());
    }

}
