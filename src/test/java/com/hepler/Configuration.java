package com.hepler;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
	public static Properties p;

	public Configuration() throws Throwable {
		//File f = new File(System.getProperty("\\src\\test\\java\\com\\hepler\\Configuration.Properties"));
	
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\maven\\src\\test\\java\\com\\hepler\\Configuration.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getbrowser() {
		String browser = p.getProperty("Browser");
		return browser;
	}

	public String url() {
		String url = p.getProperty("Url");
		return url;
	}
}
