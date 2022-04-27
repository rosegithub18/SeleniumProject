package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement radioButtonDemo = driver.findElement(By.xpath("//*[@href='radio-button-demo.php']"));
		radioButtonDemo.click();
		
		WebElement genderRadio = driver.findElement(By.cssSelector("input#inlineRadio2"));
		genderRadio.click();
		
		System.out.println(genderRadio.isSelected());
		
		WebElement button1 = driver.findElement(By.cssSelector("button#button-one"));
		button1.click();
		
		WebElement message1 = driver.findElement(By.xpath("//*[@id='message-one']"));
		
		System.out.println(message1.getText());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
 
	}

}