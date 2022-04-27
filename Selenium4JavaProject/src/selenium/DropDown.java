package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php/");
		driver.manage().window().maximize();

		WebElement passengerDrop = driver.findElement(By.name("passCount"));
		passengerDrop.click();
		Select select = new Select(passengerDrop);
		
		//select.selectByIndex(2); //By index
		//select.selectByValue("3"); //by value
		select.selectByVisibleText("2"); //by visible text
		
		WebElement departDrop = driver.findElement(By.name("fromPort"));
		departDrop.click();
		Select sel = new Select(departDrop);
		sel.selectByValue("London");
		
		
		
		
		
	}

}
