package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\SeleniumTrainingByJitendra\\Tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Title is matching");
		}
		else {
			System.out.println("Title is not matching");
		}
		String getUrl = driver.getCurrentUrl();
		System.out.println(getUrl);
		driver.quit();
		System.out.println(driver.getTitle());//Session Id Becomes Null and We dont get title
		
	}
	
}
