package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	@Test
	private void Test1() throws InterruptedException {


WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://leafground.com/window.xhtml");

String mainWindowHandle = driver.getWindowHandle();
driver.findElement(By.xpath("//span[text()='Open']")).click();
Set<String> allWindowHandles = driver.getWindowHandles();
Iterator<String> iterator = allWindowHandles.iterator();

while (iterator.hasNext()) {
    String ChildWindow = iterator.next();
        if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
        driver.switchTo().window(ChildWindow);
        Thread.sleep(3000);
        
    }
        driver.findElement(By.xpath("//a[@id='layout-config-button']//following::*")).click();
        Thread.sleep(3000);
        
        driver.switchTo().window(mainWindowHandle);
        driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
        
        
        
        
       
}
}
	}


