package jobportal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Recommended_Jobs_By_Company {
	private static String[] links = null;
	private static int linksCount = 0;

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://jobsleeve.com/");
		//WebElement b= driver.findElement(By.xpath("//section[@id='recommended_jobs_by_company']"));
		List<WebElement> e=driver.findElements(By.xpath("//*[@id=\"recommended_jobs_by_company\"]/div/div/div/div[1]/div/ul/li/a"));
		linksCount = e.size();
	    System.out.println("Total no of links Available: "+linksCount);
	    links= new String[linksCount];
	    System.out.println("List of links Available: ");  
	 // print all the links from webpage 
	 for(int i=0;i<linksCount;i++)
	 {
	 links[i] = e.get(i).getAttribute("href");
	 System.out.println(e.get(i).getAttribute("href"));
	 }
	 @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
		 for(WebElement element: e) {
			    if(element.getAttribute("href") != null) {
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			        wait.until(ExpectedConditions.elementToBeClickable(element));
			        Thread.sleep(3000);
			        
			        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			         
			    }
			}
	//driver.quit();
	}
}

