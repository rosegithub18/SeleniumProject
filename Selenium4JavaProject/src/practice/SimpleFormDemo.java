package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement simpeFormLink = driver.findElement(By.linkText("Simple Form Demo"));
		simpeFormLink.click();
		
		WebElement msgTextBox = driver.findElement(By.xpath("//*[@id='single-input-field']"));
		msgTextBox.sendKeys("Welcome to Selenium");
		WebElement showmsgButton = driver.findElement(By.xpath("//*[@id='button-one']"));
		showmsgButton.click();
		WebElement message = driver.findElement(By.xpath("(//*[@class='my-2'])[1]"));
		System.out.println(message.getText());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		WebElement valueA = driver.findElement(By.xpath("//*[@id='value-a']"));
		valueA.sendKeys("10");
		WebElement valueB = driver.findElement(By.xpath("//*[@id='value-b']"));
		valueB.sendKeys("20");
		WebElement getTotal = driver.findElement(By.xpath("//*[@id='button-two']"));
		getTotal.click();
		WebElement total = driver.findElement(By.xpath("//*[@id='message-two']"));
		System.out.println(total.getText());
		
		

	}

}
