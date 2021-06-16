package com.selenium.allclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AOpenBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
		"D:\\Personal\\SeleniumTrainingByJitendra\\Tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}

}
