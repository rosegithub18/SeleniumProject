package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", iFrame);
		driver.switchTo().frame("a077aa5e");
		
		WebElement clickOnIframe = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		clickOnIframe.click();
		
		
		driver.switchTo().parentFrame();
		
		
		WebElement eMail = driver.findElement(By.id("philadelphia-field-email"));
		eMail.sendKeys("am.rose.mary@gmail.com");
		Thread.sleep(2000);
		driver.close();
		//driver.quit();


	}

}
