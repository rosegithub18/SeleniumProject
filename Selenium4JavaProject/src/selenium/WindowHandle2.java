package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		WebElement openWindowButton = driver.findElement(By.id("newWindowBtn"));
		WebDriverWait expWait = new WebDriverWait(driver, 10);
		expWait.until(ExpectedConditions.elementToBeClickable(openWindowButton));
		openWindowButton.click();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> toIterate = allWindow.iterator();
		
		while(toIterate.hasNext())
		{
			String childWindows = toIterate.next();
			if(!parentWindow.equalsIgnoreCase(childWindows))
			{
				driver.switchTo().window(childWindows);
				driver.manage().window().maximize();
				
				JavascriptExecutor js =(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)");
				WebElement firstName = driver.findElement(By.xpath("//*[@id='firstName']"));
				firstName.sendKeys("Rose");
				driver.close();
				
				//js.executeScript("argumets[0].scrollIntoView();",firstName );
			}
		}
		
		driver.switchTo().window(parentWindow);
		driver.close();
		
		

	}

}
