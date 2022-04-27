package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleInput {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement selectInputLink = driver.findElement(By.linkText("Select Input"));
		selectInputLink.click();
		
		WebElement selColor = driver.findElement(By.xpath("//*[@id='single-input-field']"));
		//selColor.click();
		Select sel = new Select(selColor);
		sel.selectByIndex(2);
		//sel.deselectByVisibleText("Yellow");
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id='button-first']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",button1);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(button1));
		button1.click();

	}

}
