package jobportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://nowhiren.com/");
		System.out.print(driver.findElement(By.xpath("/html/body/section[1]/div[1]/div/div[1]/h1[1]/span[1]")).getText());
		System.out.print(driver.findElement(By.xpath("/html/body/section[1]/div[1]/div/div[1]/h1[1]/span[2]")).getText());
	    System.out.print(driver.findElement(By.xpath("/html/body/section[1]/div[1]/div/div[1]/h1[2]/span[1]")).getText());
		System.out.print(driver.findElement(By.xpath("/html/body/section[1]/div[1]/div/div[1]/h1[2]/span[2]")).getText());
	    System.out.println(driver.findElement(By.xpath("/html/body/section[1]/div[1]/div/div[1]/h2")).getText());
		driver.findElement(By.linkText("JobSeeker")).click();
		driver.findElement(By.linkText("JobSeeker Login")).click();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("tester16@grr.la");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@id=\"contact\"]/button")).click();
        
	}
	

		
	}


