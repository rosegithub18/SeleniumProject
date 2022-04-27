package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php/");
		driver.manage().window().maximize();
		
		WebElement onewayRadio = driver.findElement(By.xpath("//*[@value='oneway']"));
		//System.out.println(onewayRadio.isDisplayed());//to check element is displayed or not
		
		onewayRadio.click();
		System.out.println(onewayRadio.isSelected());//element is selected or not
		
		
		WebElement agileProjectLink = driver.findElement(By.xpath("//*[contains(text(),'Agile')]"));
		System.out.println(agileProjectLink.isDisplayed());

	}

}
