package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDragandDrop {
	
	
		
		
		@Test
		public void testdrag () {


	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://leafground.com/drag.xhtml");
	
	
	WebElement From=driver.findElement(By.xpath("//*[text()='Drag to target']"));	
    
    WebElement To=driver.findElement(By.xpath("//*[text()='Drop here']"));					
    		
    Actions act=new Actions(driver);					

    act.dragAndDrop(From, To).build().perform();		
}		

}
