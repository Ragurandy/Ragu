package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgFrame {
	
	
	@Test
	public void testFrame () {


WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://leafground.com/frame.xhtml");
driver.switchTo().frame(0);
driver.findElement(By.xpath("//*[text()='Click Me' and contains(@style,'fe875')]")).click();


}
}
