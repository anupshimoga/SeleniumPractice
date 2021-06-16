package com.class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.amazon.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//System.out.println(links.toString());
		
		for(int i=0; i<links.size(); i++) {
			String linksDisp = links.get(i).getText();
			if(!(linksDisp.isEmpty()))
				System.out.println(linksDisp);
		}
	}
}
