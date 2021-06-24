package com.base;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_TEST {

	public static WebDriver driver;
	public static Properties prop;

	public Base_TEST() throws Exception {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Maven_A\\src\\main\\java\\com\\config\\config.properties");
		prop.load(ip);
	}

	public static void initialization() {
		System.setProperty("webdriver.gecko.driver", "D:\\Maven_A\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
}
