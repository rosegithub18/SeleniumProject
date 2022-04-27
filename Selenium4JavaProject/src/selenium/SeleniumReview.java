package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumReview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement inputFormLink = driver.findElement(By.xpath("//*[contains( @href,'simple')]"));
		inputFormLink.click();
		WebElement radioButton = driver.findElement(By.xpath("//*[starts-with(text(),'Radio')]"));
		Actions act = new Actions(driver);
		act.sendKeys(radioButton,Keys.ENTER).build().perform();
		
		WebElement femaleRadio = driver.findElement(By.xpath("//*[@id='inlineRadio21']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", femaleRadio);
		WebDriverWait expWait = new WebDriverWait(driver, 10);
		expWait.until(ExpectedConditions.elementToBeClickable(femaleRadio));
		femaleRadio.click();
		System.out.println(femaleRadio.isSelected());
		driver.quit();
         
	}

}
