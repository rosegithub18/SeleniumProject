package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/drag-drop.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement drag1 = driver.findElement(By.xpath("//*[text()='Draggable n°1']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='mydropzone']"));
		
		WebDriverWait exp = new WebDriverWait(driver, 20);
		exp.until(ExpectedConditions.elementToBeClickable(drop));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag1,drop).build().perform();

	}

}
