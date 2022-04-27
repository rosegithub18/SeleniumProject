package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
		/*WebElement customerID = driver.findElement(By.name("cusid"));
		customerID.sendKeys("rose");
		
		WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
		submit.click();
		
		driver.switchTo().alert().accept();
	
		
		driver.switchTo().alert().accept();*/
		
		WebElement clickMeButton = driver.findElement(By.xpath("//*[@class='btn btn-success']"));
		clickMeButton.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		// handling alert by passing value
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		WebElement promptBox = driver.findElement(By.xpath("//*[contains(text(),'Prompt ')]"));
		promptBox.click();
		
		WebDriverWait explWait = new WebDriverWait(driver,10);
		explWait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().sendKeys("Jack");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

}
