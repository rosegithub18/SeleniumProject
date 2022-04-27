package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.opesmount.in/grocerystore1/");
		
		//driver.get("http://www.opesmount.in/grocerystore1/index.php?route=account/login");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Rose");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pwd.sendKeys("1234");
		
		
		//a[text()='Forgot your password?']
		
		
		//by css selector
		
		//WebElement emailText = driver.findElement(By.cssSelector("input.form-control"));//tag name.class value
		//WebElement emailText = driver.findElement(By.cssSelector("input#input-email"));//tag name#id
		//WebElement emailText=driver.findElement(By.cssSelector("input[name=email]"));//tagname[name=value]
		//emailText.sendKeys("am.rose.mary@gmail.com");
		
		//using tag name
		//WebElement searchBox = driver.findElement(By.tagName("input"));
		//searchBox.sendKeys("Contact",Keys.ENTER);
		
		//by name
		//WebElement searchBox=driver.findElement(By.name("search"));
		//searchBox.sendKeys("Contact",Keys.ENTER);
		//searchBox.sendKeys("Contact");
		//WebElement searchButton=driver.findElement(By.className("fa fa-search"));
		//searchButton.click();
		
		//By LinkText and partial Link text
		/*WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		driver.switchTo().alert().dismiss();  //to dismiss pop-us
		WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgotten"));
		forgotPassword.click();*/
		
		//driver.close();

	}

}
