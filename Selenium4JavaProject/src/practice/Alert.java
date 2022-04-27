package practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		WebElement click1 = driver.findElement(By.xpath("//*[@class='btn btn-success']"));
		click1.click();
		driver.switchTo().alert().accept();
		
		WebElement click2 = driver.findElement(By.xpath("//*[@class='btn btn-warning']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", click2);
		click2.click();
		driver.switchTo().alert().dismiss();
		
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2000)");
		
		WebElement click3 = driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
		click3.click();
		Wait<WebDriver> fluWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		fluWait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys("Jake");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		

	}

}
