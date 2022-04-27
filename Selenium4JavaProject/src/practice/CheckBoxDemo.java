package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		WebElement checkBoxLink = driver.findElement(By.xpath("//*[@href='check-box-demo.php']"));
		checkBoxLink.click();
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='gridCheck']"));
		checkBox.click();
		
		WebElement msg1 = driver.findElement(By.xpath("//*[contains(text(),'Success ')]"));
		System.out.println(msg1.getText());
		
		WebElement selectButton = driver.findElement(By.xpath("//*[@id='button-two']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",selectButton);
		
		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='check-box-one']"));
		checkBox1.click();
		WebElement checkBox3 = driver.findElement(By.xpath("//*[@id='check-box-three']"));
		checkBox3.click();
		
		WebDriverWait expwait = new WebDriverWait(driver, 10);
		expwait.until(ExpectedConditions.visibilityOfAllElements(selectButton));
		selectButton.click();
		

	}

}
