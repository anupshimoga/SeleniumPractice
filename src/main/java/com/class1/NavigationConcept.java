package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Personal\\\\SeleniumTrainingByJitendra\\\\Tools\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https:\\amazon.com");
		System.out.println(driver.getTitle());
		
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login&_ga=2.205345872.173809949.1614708369-1466355394.1614708369&__cf_chl_jschl_tk__=be88101d36108e84bad209d51dab6c567611c24f-1614708395-0-ARNtjKinYgFitOKh6umKTqykR5s6XLGti1ikaNMWmhgSdEltrdFM6-6TPxj4dleqNY7H9x-5foTeFB2oJ99vXdaRc86J_-FYKQ_e63F1WJ88TOs9mZ1yE3wqnjvupSV5GXXNgmqwvQCM1FgcnZXiT8QtgKFR1MgGYBLmVl-JXmzrmq8XQbtupk6AYcTF51IIiPN7zz7z0z-KsWNMGqQ_1RBDyLAgnFBcdGBfgGFiViaVkbkghujinLF2YaWZZwUZdTJKrBneCPZWqcHfbou15kgcazDh9bjzZNiAeZPePZdwL-3HMKnDoaUxJNwQSOlJIs_3ckH4oexHEedzGEYH0PHMPWevJZvFTjfsZkm2YHFUgpZJWyYrp1xmU3BlK08Ha3sA8_SBZRj_VyxwF3Juwp1qTn-5mIxHs1VrctYmqrcpThpzhtuzl7bqicTt-egnbgNHaJc6LTk8PUePEKGdh2IWwthBN9lt91Sp-sGWjWzpp5up5oz6mk0rhoKZlp-AwQqGxSC91PdI1BJ5sYuKgo17GohNLo95mN3nga6TNPpN");
		Thread.sleep(5000);
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("test123@gmail.com");
		
		WebElement pwd =driver.findElement(By.id("password"));
		pwd.sendKeys("test123");
		
	}
}
