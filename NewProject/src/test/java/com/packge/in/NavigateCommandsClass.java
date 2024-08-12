package com.packge.in;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommandsClass {

	@Test
	public void setUp() {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/");
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("purushothamallam332@gmail.com");
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("888@Hello");
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	Cookie cooks=new Cookie("name", "purushotham");
driver.manage().addCookie(cooks);
	driver.manage().deleteCookie(cooks);
Cookie cook=(Cookie)driver.manage().getCookieNamed("name");
//for(Cookie cok:cook) {
	System.out.println(cook.getValue());
//}
	}
	
}