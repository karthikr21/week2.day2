package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Edit.html");
	
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("karthikr9121@gmail.com");
	driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).clear();
	
	driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("TestLeaf");
	
	System.out.println(driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).getAttribute("value"));
	

	
	System.out.println(driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("value"));
	
	
	driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
	
	System.out.println(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled());
	
	driver.close();
	}

}
