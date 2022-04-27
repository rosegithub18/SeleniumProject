package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement textBox=driver.findElement(By.name("q"));
		textBox.sendKeys("Earth");
		WebElement searchButton=driver.findElement(By.name("btnK"));
		searchButton.click();
		driver.navigate().back();
		
		WebElement gmailLink=driver.findElement(By.className("gb_d"));
		gmailLink.click();

	}

}
