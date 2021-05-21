package com.step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hepler.File_Reader;
import com.hepler.Page_Object_Manager;
import com.pom.Booking_Page;
import com.pom.Login_Page;
import com.pom.Radio;
import com.pom.Search_Hotel;
import com.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.maven.Baseclass;

public class Step_Definiti0n extends Baseclass {

	public static WebDriver driver = Runner.driver;

	// Login_Page lp=new Login_Page(driver);

	Page_Object_Manager PM = new Page_Object_Manager(driver);

	@Given("^user lauching the browser$")
	public void user_lauching_the_browser() throws Throwable {
		String url = File_Reader.getinstance().getinstanceCR().url();
		getUrl(url);
	}

	@When("^user enter a username$")
	public void user_enter_a_username() throws Throwable {
		inputText(PM.getLp().getUsername(), "Sowmiyasri");
	}

	@When("^user enter a valid password$")
	public void user_enter_a_valid_password() throws Throwable {
		inputText(PM.getLp().getPassword(), "Sowmiya05");
	}

	@Then("^user verifying the valid username and password$")
	public void user_verifying_the_valid_username_and_password() throws Throwable {
		clickOnElement(PM.getLp().getLogin());
	}

	// Search_Hotel sh=new Search_Hotel(driver);

	@When("^user choose the location$")
	public void user_choose_the_location() throws Throwable {
		// dropDownSelection(sh.getLocate(),"index", "1");
		dropDownSelection(PM.getSh().getLocate(), "index", "1");
	}

	@When("^user choose the hotel$")
	public void user_choose_the_hotel() throws Throwable {
		// dropDownSelection(sh.getMotel(), "index", "2");

		dropDownSelection(PM.getSh().getMotel(), "index", "2");
	}

	@When("^user select the Roomtype$")
	public void user_select_the_Roomtype() throws Throwable {
		// dropDownSelection(sh.getType(), "index", "1");

		dropDownSelection(PM.getSh().getType(), "index", "1");
	}

	@When("^user select the Rooms$")
	public void user_select_the_Rooms() throws Throwable {
		// dropDownSelection(sh.getNos(), "index", "1");

		dropDownSelection(PM.getSh().getNos(), "index", "1");
	}

	@When("^user enter the check in date$")
	public void user_enter_the_check_in_date() throws Throwable {
		// inputText(sh.getPickin(), "28/01/2020");

		inputText(PM.getSh().getPickin(), "28/01/2020");
	}

	@When("^user enter the check out date$")
	public void user_enter_the_check_out_date() throws Throwable {
		// inputText(sh.getPick(), "30/02/2020");

		inputText(PM.getSh().getPick(), "30/02/2020");
	}

	@When("^user select adults in room$")
	public void user_select_adults_in_room() throws Throwable {
		// dropDownSelection(sh.getAdult(), "index", "2");

		dropDownSelection(PM.getSh().getAdult(), "index", "2");
	}

	@When("^user select childrens in room$")
	public void user_select_childrens_in_room() throws Throwable {
		// dropDownSelection(sh.getChild(), "index", "1");

		dropDownSelection(PM.getSh().getChild(), "index", "1");
	}

	@Then("^user verify above details$")
	public void user_verify_above_details() throws Throwable {
		// clickOnElement(sh.getSubmit());

		clickOnElement(PM.getSh().getSubmit());
	}
//	Radio rd= new Radio(driver);

	@When("^user select radio button$")
	public void user_select_radio_button() throws Throwable {
		// clickOnElement(rd.getRadd());

		clickOnElement(PM.getRd().getRadd());

	}

	@Then("^user verify details$")
	public void user_verify_details() throws Throwable {
		// clickOnElement(rd.getCont());

		clickOnElement(PM.getRd().getCont());
	}
	// Booking_Page bk = new Booking_Page(driver);

	@When("^user enter a first name$")
	public void user_enter_a_first_name() throws Throwable {
		// inputText( bk.getFrst(), "ak");

		inputText(PM.getBk().getFrst(), "AK");
	}

	@When("^user enter a last name$")
	public void user_enter_a_last_name() throws Throwable {
		// inputText(bk.getLst(), "ys");

		inputText(PM.getBk().getLst(), "YS");
	}

	@When("^user enter a billing address$")
	public void user_enter_a_billing_address() throws Throwable {
		// inputText(bk.getAddrz(), "valluavar");

		inputText(PM.getBk().getAddrz(), "Valluvar Nagar");
	}

	@When("^user enter a credit card number$")
	public void user_enter_a_credit_card_number() throws Throwable {
		// inputText(bk.getCerdit(), "8686546888888888");

		inputText(PM.getBk().getCerdit(), "8686546888888888");
	}

	@When("^user select credit card type$")
	public void user_select_credit_card_type() throws Throwable {
		// dropDownSelection(bk.getType(), "index", "1");

		dropDownSelection(PM.getBk().getType(),  "index", "1");
	}

	@When("^user select credit card expry date$")
	public void user_select_credit_card_expry_date() throws Throwable {
	//	dropDownSelection(bk.getDate(), "index", "5");
		
		dropDownSelection(PM.getBk().getDate(),"index", "5");
	}

	@When("^user select credit card month$")
	public void user_select_credit_card_month() throws Throwable {
	//	dropDownSelection(bk.getYear(), "index", "6");
		
		dropDownSelection(PM.getBk().getYear(),"index", "6");
	}

	@When("^user enter ccv number$")
	public void user_enter_ccv_number() throws Throwable {
	//	inputText(bk.getCcv(), "854");

		inputText(PM.getBk().getCcv(), "854");
	}

	@Then("^user book the hotel$")
	public void user_book_the_hotel() throws Throwable {
	//	clickOnElement(bk.getBook());
		
        clickOnElement(PM.getBk().getBook());
	}

}
