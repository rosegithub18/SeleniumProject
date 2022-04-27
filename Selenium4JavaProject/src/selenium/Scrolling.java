package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2500)"); //scroll down
		//js.executeScript("window.scrollBy(0,-2500)"); //Scroll up
		
		WebElement backUp = driver.findElement(By.xpath("//*[contains(text(),'Backup')]"));
		System.out.println(backUp.getText());
		
		js.executeScript("arguments[0].scrollIntoView();",backUp);

		
	}

}
