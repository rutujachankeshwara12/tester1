package first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class demo1 {
	private static String[] links = null;
	private static int linksCount = 0;
	int j=0;

	
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
		 //for(int i=0;i<linksCount;i++) {
		// for(WebElement element: e) {
		 int i = linksCount;
		    while(i >0) {
			 try {
			    //if(e.get(i).getAttribute("href") != null) {
				 WebElement c= driver.findElement(By.xpath("//*[@id=\"recommended_jobs_by_company\"]/div/div/div/div["+i+"]"));
			    	//WebElement a= c.findElement(By.xpath("//*[@class='rec-jobs-by-comp tab-pane  fade in active show']"));
			    	//WebElement b= c.findElement(By.id("amazon-jobs"));
					List<WebElement> e1=c.findElements(By.tagName("a"));
					linksCount = e1.size();
					System.out.println("Total no of links Available: "+linksCount);  
					 HashSet<String> uniqueURLs = new HashSet<String>();
					    // Add all your elements to hashset
					    for(WebElement link: e1){
					        uniqueURLs.add(link.getAttribute("href"));
					    }
					    for (String urlUniqueItem: new ArrayList<String>(uniqueURLs)) {
					        System.out.println(urlUniqueItem);      
					 }
					    ArrayList<String> al = new ArrayList<String>(uniqueURLs);
					    System.out.println(al.size());
					    for(int i1=0;i1<al.size();i1++)
						 {
						 driver.navigate().to(al.get(i1));
						 Thread.sleep(3000);
						 driver.navigate().back();
						 }
			    }
			 //}
			    catch(StaleElementReferenceException e1) {
			    	System.out.println("success");
			    	
		        }
			    i--;
		 }    
		 
			    
	//driver.quit();
	}
}

