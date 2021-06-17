package com.selenium.allclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebScrapping {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://slidesgo.com/theme/sales-forecast-business-plan#search-Business+Plan&position-11&results-18");
		List<WebElement> img =  driver.findElements(By.xpath("//*[@id=\"slide\"]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[9]/img"));
		for(int i=0; i<img.size(); i++) {
			String s = img.get(i).getAttribute("srcset");
			System.out.println(s);
		}
	}
}
