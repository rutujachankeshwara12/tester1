package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jd {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver= new ChromeDriver();

			driver.get("https://jobsdive.com/job-vacancy/amazon-workforce-staffing-amazon-warehouse-staffing-jobs-near-me-openings-for-a-limited-period-jobs-in-abercrombie-nd-58001-512");

			driver.manage().window().maximize();
			Thread.sleep(5000);

			WebElement p = driver.findElement(By.xpath("//input[@type='submit']"));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView();", p);
			jse.executeScript("arguments[0].click();", p);
		}

	}


