package practice;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FromSubmit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		WebElement text1 = driver.findElement(By.xpath("//*[@id='validationCustom01']"));
		text1.sendKeys("Rose",Keys.TAB);
		WebElement text2 = driver.findElement(By.xpath("//*[@id='validationCustom02']"));
		text2.sendKeys("Mary",Keys.TAB);
		WebElement text3 = driver.findElement(By.xpath("//*[@id='validationCustomUsername']"));
		text3.sendKeys("am.rose.mary@gmail.com",Keys.TAB);
		WebElement text4 = driver.findElement(By.xpath("//*[@id='validationCustom03']"));
		text4.sendKeys("Banglore",Keys.TAB);
		WebElement text5 = driver.findElement(By.xpath("//*[@id='validationCustom04']"));
		text5.sendKeys("Karanataka",Keys.TAB);
		WebElement text6 = driver.findElement(By.xpath("//*[@id='validationCustom05']"));
		text6.sendKeys("560102",Keys.TAB);
		WebElement check1 = driver.findElement(By.xpath("//*[@id='invalidCheck']"));
		check1.click();
		WebElement submitbtn = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/button"));
		
		Wait<WebDriver> fluWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		fluWait.until(ExpectedConditions.elementToBeClickable(submitbtn));
		//submitbtn.click();
		action.sendKeys(submitbtn, Keys.ENTER).build().perform();
		action.contextClick(submitbtn).build().perform();
		

	}

}
