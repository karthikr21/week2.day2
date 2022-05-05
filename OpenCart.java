package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/register");

driver.manage().window().maximize();

driver.findElement(By.id("input-username")).sendKeys("karthik");
driver.findElement(By.id("input-firstname")).sendKeys("karthik");
driver.findElement(By.id("input-lastname")).sendKeys("raja");
driver.findElement(By.id("input-email")).sendKeys("karthikr9121@gmail.com");
driver.findElement(By.id("input-country")).sendKeys("India");
driver.findElement(By.id("input-password")).sendKeys("test123");
//driver.close();

	}

}
