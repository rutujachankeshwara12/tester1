package jobportal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class EmployersofChoice {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://nowhiren.com/");
		WebElement b= driver.findElement(By.xpath("//section[@id='EmployerOfChoice']"));
		List<WebElement> links=b.findElements(By.tagName("a"));
		System.out.println("Total Count:" + links.size());
	    // Create hashset
	    HashSet<String> uniqueURLs = new HashSet<String>();
	    // Add all your elements to hashset
	    for(WebElement link: links){
	        uniqueURLs.add(link.getAttribute("href"));
	    }
	    for (String urlUniqueItem: new ArrayList<String>(uniqueURLs)) {
	        System.out.println(urlUniqueItem);
	 }
	    ArrayList<String> al = new ArrayList<String>(uniqueURLs);
	    System.out.println(al.size());
	    for(int i=0;i<al.size();i++)
		 {
		 driver.navigate().to(al.get(i));
		 Thread.sleep(3000);
		 driver.navigate().back();
		 }
	    driver.quit();	    
	}
}

	
