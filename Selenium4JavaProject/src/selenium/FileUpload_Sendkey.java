package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Sendkey {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement browser = driver.findElement(By.xpath("//span[@class='browse']"));
		browser.click();
		
		Robot rb = new Robot();
		//get the file path
		StringSelection filepath = new StringSelection("F:\\Selenium notes\\Actions and window handle.docx");
		// copy path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		//press cntrl+v for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_V);
		//release keys
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		rb.keyRelease(KeyEvent.VK_V);
		//press enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//release enter key
		rb.keyRelease(KeyEvent.VK_ENTER);
						
		System.out.println("File Uploaded");
	
		

	}

}
