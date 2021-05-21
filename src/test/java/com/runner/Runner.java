package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.hepler.File_Reader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import demo.maven.Baseclass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//features",glue = "com\\step_definition", monochrome = true, dryRun = false)
public class Runner {
public static WebDriver driver;
	@BeforeClass
	public static void set_up() throws Throwable {
		String Browser = File_Reader.getinstance().getinstanceCR().getbrowser();
		driver=Baseclass.browserLaunch(Browser);
		
	}
	@AfterClass
	public static void tear_down() {
		driver.close();
		
	}
}
