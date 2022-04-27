package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Table2_Task {

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
		
		WebElement createClient = driver.findElement(By.xpath("//*[@href='/payrollapp/client/create']"));
		createClient.click();
		
		WebElement branch = driver.findElement(By.xpath("//*[@id='client-branch_id']"));
		Select sel = new Select(branch);
		sel.selectByVisibleText("Alpha_new");
		
		WebElement division = driver.findElement(By.xpath("//*[@id='client-division_id']"));
		Select sel1 = new Select(division);
		sel1.selectByVisibleText("NewAlpha");
		
		WebElement clientName = driver.findElement(By.xpath("//*[@id='client-client_name']"));
		clientName.sendKeys("Rose");
		
		WebElement address = driver.findElement(By.xpath("//*[@id='client-client_address']"));
		address.sendKeys("Newyork,USA");
		
		WebElement postcode = driver.findElement(By.xpath("//*[@id='client-postcode']"));
		postcode.sendKeys("340089");
		
		WebElement invoiceContact = driver.findElement(By.xpath("//*[@id='client-invoice_contact']"));
		invoiceContact.sendKeys("dfswgf");
		
		WebElement phone = driver.findElement(By.xpath("//*[@id='client-phone']"));
		phone.sendKeys("1454667");
		
		WebElement email = driver.findElement(By.xpath("//*[@id='client-email']"));
		email.sendKeys("dfswgf@gmail.com");
		
		WebElement companyReg = driver.findElement(By.xpath("//*[@id='client-company_reg']"));
		companyReg.sendKeys("ffgf");

		WebElement invoiceOrder = driver.findElement(By.xpath("//*[@id='client-invoice_order']"));
		Select sel2 = new Select(invoiceOrder);
		sel2.selectByVisibleText("Invoice per worker");
		
		WebElement invoiceDeliveryMethod = driver.findElement(By.xpath("//*[@id='client-invoice_delivery_method']"));
		Select sel3 = new Select(invoiceDeliveryMethod);
		sel3.selectByVisibleText("Paper");
		
		WebElement masterDocument = driver.findElement(By.xpath("//*[@id='client-master_document']"));
		Select sel4 = new Select(masterDocument);
		sel4.selectByVisibleText("Print");
		
		
		WebElement settlementDays = driver.findElement(By.xpath("//*[@id='client-settilement_days']"));
		settlementDays.sendKeys("56");
		
		WebElement vatRate = driver.findElement(By.xpath("//*[@id='client-vat_rate']"));
		Select sel5 = new Select(vatRate);
		sel5.selectByVisibleText("VAT 5.00%");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement saveBtn = driver.findElement(By.xpath("//*[@class='btn btn-success']"));
		saveBtn.click();
		
		
		
		
		
		

	}

}
