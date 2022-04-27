package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigateCom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launch browser
		driver.get("https://www.selenium.dev/");
		//refresh page
		driver.navigate().refresh();
		//print title of the page
	    String title=driver.getTitle();
        System.out.println(title);
        //launch url using navigate
        driver.navigate().to("https://www.dev.to/t/selenium");
        //refresh page
        driver.navigate().refresh();
        //print current url of page
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //navigate backward
        driver.navigate().back();
        //navigate forward
        driver.navigate().forward();
        //Close all browser windows
        driver.quit();
	}

}
