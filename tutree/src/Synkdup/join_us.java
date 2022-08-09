package Synkdup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class join_us {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
       driver.get("https://beta.synkdup.com/");
       driver.findElement(By.partialLinkText("Join")).click();
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rutujachankeshwara12@gmail.com");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
       driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}
