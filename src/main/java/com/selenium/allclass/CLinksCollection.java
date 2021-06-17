package com.selenium.allclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLinksCollection {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linksAmazon = driver.findElements(By.tagName("a"));
		System.out.println(linksAmazon.size());
		
		for(int i =0; i<linksAmazon.size(); i++) {
			String links = linksAmazon.get(i).getAttribute("href");	
				System.out.println(links);
			}
	driver.quit();
	}
}
