package Synkdup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
       driver.get("https://beta.synkdup.com/");
       driver.findElement(By.linkText("Signup")).click();
       driver.findElement(By.id("fname")).sendKeys("jhdkj");
       driver.findElement(By.id("lname")).sendKeys("hjsj");
       driver.findElement(By.id("email-address")).sendKeys("testmar16@grr.la");
       driver.findElement(By.id("phoneno")).sendKeys("1234567890");
       driver.findElement(By.id("password")).sendKeys("123456");
       driver.findElement(By.id("confirm_password")).sendKeys("123456");
       driver.findElement(By.xpath("//input[@id='formSubmit']")).click();

	}
}
