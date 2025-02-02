package com.packge.in;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleClass {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
		
	}
	@Test
public void windowHandleMethod() {
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	WebElement ele=driver.findElement(By.xpath("//input[@id='name']"));
	WebElement window=driver.findElement(By.id("newTabBtn"));
	ele.sendKeys("this is one");//
	window.click();
	String parentWindow=driver.getWindowHandle();
	Set<String> str=driver.getWindowHandles();
	System.out.println(str);
	for(String single:str) {
		
		if(!single.equals(parentWindow)) {
			driver.switchTo().window(single);
			driver.findElement(By.id("promptBox")).click();
		}
	}
	
	
}
}
