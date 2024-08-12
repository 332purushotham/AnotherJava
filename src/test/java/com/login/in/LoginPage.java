package com.login.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	@Test
public void alunch()
{
		WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();	

driver.get("https://tutorialsninja.com/demo/");

}
	
	@Test
	@Parameters({"user","password"})
public void loginApp(String username,String password)
{
	driver.findElement(By.xpath("//a[@title='My Account']")).click();
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.id("input-email")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}

