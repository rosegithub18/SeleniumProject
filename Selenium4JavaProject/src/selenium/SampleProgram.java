package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launch browser
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		

	}

}
