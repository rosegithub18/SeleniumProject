package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_RobotClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("F:\\Selenium notes\\Actions and window handle.docx");
		
		WebElement termCheckBox = driver.findElement(By.className("field_check"));
		termCheckBox.click();
		
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='submitbutton']"));
		submitBtn.click();
		

	}

}
