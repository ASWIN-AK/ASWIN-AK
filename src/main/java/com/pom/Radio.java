package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio {
private static WebDriver driver;
@FindBy(id="radiobutton_0")
private WebElement radd;
@FindBy(id="continue")
private WebElement cont;
public Radio(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2,this);
}
public WebElement getRadd() {
	return radd;
}
public WebElement getCont() {
	return cont;
}
}
