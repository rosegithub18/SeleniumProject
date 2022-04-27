package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		WebElement amtDrag = driver.findElement(By.xpath("//*[text()=' 5000 ']"));
		WebElement amtDrop= driver.findElement(By.xpath("(//*[@class='placeholder'])[2]"));
		action.dragAndDrop(amtDrag, amtDrop).build().perform();
	//	driver.quit();

	}

}
