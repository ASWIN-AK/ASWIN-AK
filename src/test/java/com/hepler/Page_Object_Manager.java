package com.hepler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Booking_Page;
import com.pom.Login_Page;
import com.pom.Radio;
import com.pom.Search_Hotel;

public class Page_Object_Manager {
	public static WebDriver driver;
public Login_Page  lp;
public Search_Hotel sh;
public Radio rd;
public Booking_Page bk;
public Page_Object_Manager(WebDriver driver2) {
this.driver =driver2;
PageFactory.initElements(driver2, this);


}
public Login_Page getLp() {
	lp= new Login_Page(driver);
	return lp;
}
public Search_Hotel getSh() {
	sh=new Search_Hotel(driver);
	return sh;
}
public Radio getRd() {
	rd = new Radio(driver);
	return rd;
}
public Booking_Page getBk() {
	bk=new Booking_Page(driver);
	return bk;
}
}
