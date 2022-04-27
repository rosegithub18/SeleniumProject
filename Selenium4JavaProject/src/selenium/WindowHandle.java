package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		WebElement newTab = driver.findElement(By.xpath("//*[@id='tabButton']"));
		newTab.click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> toIterate = allWindows.iterator();
		while(toIterate.hasNext())
		{
			String childWindows = toIterate.next();
		if(!parentWindow.equalsIgnoreCase(childWindows))
		{
			driver.switchTo().window(childWindows);
			WebElement message = driver.findElement(By.id("sampleHeading"));
			System.out.println(message.getText()); 
			
		}
		}
		
	driver.switchTo().window(parentWindow);

	}

}
