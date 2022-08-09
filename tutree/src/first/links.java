package first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class links {
	private static int linksCount = 0;
	//private static String links= null;
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jobsleeve.com/");
		WebElement a= driver.findElement(By.xpath("//section[@id='recommended_jobs_by_company']"));
		WebElement b= a.findElement(By.id("amazon-jobs"));
		List<WebElement> e=b.findElements(By.tagName("a"));
		linksCount = e.size();
		System.out.println("Total no of links Available: "+linksCount);  
		 HashSet<String> uniqueURLs = new HashSet<String>();
		    // Add all your elements to hashset
		    for(WebElement link: e){
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
		 
		 
	}

}
