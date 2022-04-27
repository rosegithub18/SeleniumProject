package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement userText = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userText.sendKeys("Admin");
		
		WebElement pwd = driver.findElement(By.cssSelector("input#txtPassword"));
		pwd.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[starts-with(@name,'Sub')]"));
		loginButton.click();
		
		WebElement timeLink = driver.findElement(By.xpath("//*[text()='Time']"));
		timeLink.click();
		
		WebElement attLink = driver.findElement(By.linkText("Attendance"));
		attLink.click();
		
	
		WebElement recordLink = driver.findElement(By.xpath("//*[contains(text(),'Records')]"));
		recordLink.click();
		
		WebElement calender = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
		calender.click();
		
		
		

	}

}
