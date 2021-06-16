package com.class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Personal\\\\SeleniumTrainingByJitendra\\\\Tools\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\amazon.com");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for(int i=0; i<images.size(); i++) {
			String src = images.get(i).getAttribute("src");
			if(!(src.isEmpty())) {
				System.out.println(src);
			}
		
		}
	}

}
