package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumAutomation {

	public static void main(String[] args) {
		// get Browser
		WebDriverManager.chromedriver().setup();
		// create chrome obj
		
	ChromeDriver driver = new ChromeDriver();
	
	
	driver.get("http://leaftaps.com/opentaps/control/main");      // get url location in driver
	
	driver.manage().window().maximize();           // to maximize
	driver .findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("karthik");
	driver.findElement(By.xpath("//select[@name='dataSourceId']")).click();
	driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstNameLocal')]")).sendKeys("karthik");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("raja");
	
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	driver.close();

	}

}
