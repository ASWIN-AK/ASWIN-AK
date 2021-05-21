package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
private static WebDriver driver;
@FindBy(id="first_name")
private WebElement frst;
@FindBy(id="last_name")
private WebElement lst;
@FindBy(id="address")
private WebElement addrz;
@FindBy(id="cc_num")
private WebElement cerdit;
@FindBy(id="cc_type")
private WebElement type;
@FindBy(id="cc_exp_month")
private WebElement date;
@FindBy(id="cc_exp_year")
private WebElement year;
@FindBy (id="cc_cvv")
private WebElement ccv;
@FindBy(id="book_now")
private WebElement book;

public WebElement getFrst() {
	return frst;
}

public WebElement getLst() {
	return lst;
}

public WebElement getAddrz() {
	return addrz;
}

public WebElement getCerdit() {
	return cerdit;
}

public WebElement getType() {
	return type;
}

public WebElement getDate() {
	return date;
}

public WebElement getYear() {
	return year;
}

public WebElement getCcv() {
	return ccv;
}

public WebElement getBook() {
	return book;
}

public Booking_Page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
}
}
