package com.packge.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionsClass {

	public static void main(String[] args)
{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.xpath("//button[@onclick='setTimeout(myFunction,3000)']")).click();
}
}
