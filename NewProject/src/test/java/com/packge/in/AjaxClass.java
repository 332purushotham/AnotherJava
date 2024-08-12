package com.packge.in;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.driverfactory.in.ConfigReader;

public class AjaxClass extends ConfigReader{
	public AjaxClass() throws IOException {

		PageFactory.initElements(driver, this);
	}	
	@Test
public void ajaxMethod()
{
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.xpath("//div[@class='dropdown']/child::button")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Gmail']")));
	ele.click();
}
}
