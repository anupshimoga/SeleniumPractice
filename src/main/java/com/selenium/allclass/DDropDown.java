package com.selenium.allclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement day = driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[1]"));
		WebElement month = driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[2]"));
		WebElement year = driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[3]"));

		selectDropDown(day, "06",DEnumSelectType.INDEX.toString());
		selectDropDown(month, "08", DEnumSelectType.VALUE.toString());
		selectDropDown(year, "1999", DEnumSelectType.VISIBLETEXT.toString());
	}

	public static void selectDropDown(WebElement selectType, String value, String string) {
		switch (string) {
		case "value":
			Select select = new Select(selectType);
			select.selectByValue(value);
			break;

		case "index":
			Select select1 = new Select(selectType);
			select1.selectByIndex(Integer.parseInt(value));
			break;

		case "visibletext":
			Select select2 = new Select(selectType);
			select2.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please enter the right type");
			break;
		}
	}
}
