package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Image.html");
driver.manage().window().maximize();


driver.findElement(By.xpath("//label[@for='home']/following::img[@src='../images/home.png']")).click();
driver.navigate().back();

String s = driver.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/abcd.jpg']"))
		.getAttribute("OnClick");
if (s == null) {
	System.out.println("Broken image");
} else {
	System.out.println("Not broken image");
}

driver.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/keyboard.png']")).click();

driver.close();


	}

}
