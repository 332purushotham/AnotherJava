package com.pages.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {
	WebDriver driver;
public UploadPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(id="fileField")
public WebElement ele;

public void upload(String strr) {
	ele.sendKeys(strr);
}
}
