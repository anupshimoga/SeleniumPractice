package com.class4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231346502315%7Ce%7Cfacebook%7C&placement=&creative=231346502315&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIqsn-wYee7wIVViQrCh1WxwSjEAAYASAAEgK3b_D_BwE");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);
//		Select select1 = new Select(month);
//		Select select2 = new Select(year);
//		
//		select.selectByVisibleText("14");
		select.selectByIndex(5);

//		select1.selectByVisibleText("Jun");
//		select2.selectByVisibleText("1988");

		DropDownUtil.selectDropDown(day, "14");
		DropDownUtil.selectDropDown(month, "Jun");
		DropDownUtil.selectDropDown(year, "1988");
		ArrayList<String> arr = DropDownUtil.getAllDropDown(day);
		System.out.println(arr);
		List<WebElement> day1 = driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> month1 = driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> year1 = driver.findElements(By.xpath("//select[@id='year']/option"));
		DropDownUtil.dropdownWithoutSelectClass("12", day1);
		DropDownUtil.dropdownWithoutSelectClass("Jun", month1);
		DropDownUtil.dropdownWithoutSelectClass("1988", year1);
		driver.quit();
	}
}
