package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
public static WebDriver driver;
@FindBy(id="location")
private WebElement locate;
@FindBy(id="hotels")
private WebElement motel;
@FindBy(id="room_type")
private WebElement type;
@FindBy(id="room_nos")
private WebElement nos;
@FindBy(id="datepick_in")
private WebElement pickin;
@FindBy(id="datepick_out")
private WebElement pick;
@FindBy(id="adult_room")
private WebElement adult;
@FindBy(id="child_room")
private WebElement child;
@FindBy(id="Submit")
private WebElement submit;

public Search_Hotel(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
}
public WebElement getLocate() {
	return locate;
}
public WebElement getMotel() {
	return motel;
}
public WebElement getType() {
	return type;
}
public WebElement getNos() {
	return nos;
}
public WebElement getPick() {
	return pick;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild() {
	return child;
}
public WebElement getSubmit() {
	return submit;
}
public WebElement getPickin() {
	return pickin;

}

}

