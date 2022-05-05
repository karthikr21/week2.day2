package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// Get Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//get url
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

driver.findElement(By.xpath("//h1[@class='page-header']")).getText();
System.out.println(driver.findElement(By.xpath("//h1[@class='page-header']")).getText());
driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
driver.close();



	}

}
