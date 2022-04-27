package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling_Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.xpath("//*[@id='loginform-username']"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.xpath("//*[@id='loginform-password']"));
		password.sendKeys("1q2w3e4r");
		WebElement remeberMeCheck = driver.findElement(By.xpath("//*[@id='loginform-rememberme']"));
		System.out.println(remeberMeCheck.isSelected());
		WebElement loginButton = driver.findElement(By.xpath("//*[@name='login-button']"));
		loginButton.click();
		
		WebElement clientTab = driver.findElement(By.xpath("//*[@href='/payrollapp/client/index']"));
		clientTab.click();
		
		WebElement table = driver.findElement(By.xpath("(//table[@class='table table-striped table-bordered'])//tr[9]//td[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",table );
		System.out.println(table.getText());
		
		js.executeScript("window.scrollBy(0,-1000)");
		WebElement carol = driver.findElement(By.xpath("//*[@class='dropdown-toggle']"));
		carol.click();
		WebElement logoutBtn = driver.findElement(By.xpath("//*[@class='logout-btn']"));
		logoutBtn.click();
		
		
		

	}

}
