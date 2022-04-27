package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Locators {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//2.
		String title = driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//3.
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		//4.
		WebElement myInfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
		myInfo.click();
		
		//5.
		WebElement contactLink = driver.findElement(By.linkText("Contact Details"));
		contactLink.click();
		
		//6.
		WebElement emergencyConLink = driver.findElement(By.xpath("//a[starts-with(@href,'/index.php/pim/viewEmergency')]"));
		emergencyConLink.click();
		
	}

}
