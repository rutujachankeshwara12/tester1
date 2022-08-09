package jobportal;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class search1 {
	private static String[] links = null;
	private static int linksCount = 0;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://nowhiren.com/");
		//driver.findElement(By.id("name_input2")).sendKeys("uber");
		String optionToSelect = new String("Nacogdoches County,TX");
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys("Na");
		Thread.sleep(3000);
		List<WebElement> option= driver.findElements(By.xpath("//*[@id='select2-inputAddress2-results']/li"));
		System.out.println(option.size());
		Thread.sleep(3000);
		for(WebElement ele:option) {
			if((ele.getText()).contains(optionToSelect)) {
				ele.click();
				break; 
			}
		}
		driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[3]/input")).click();
		String a=driver.getCurrentUrl();
		System.out.println("URL" +a);
		String b=driver.getTitle();
		System.out.println(b);
		WebElement c=driver.findElement(By.xpath("//section[@class='pt-4 pt-md-5 mt-2 mt-md-0']/div/div/div/nav/ol"));
	    System.out.println(c.getText());
		WebElement d=driver.findElement(By.xpath("//section[@class='py-2 d-none d-lg-block']/div/div[1]/div/h2"));
	    System.out.println(d.getText());
	    List<WebElement> e=driver.findElements(By.xpath("//a[@class='letter-spacing-1 font-bold']"));
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
	 // navigate to each Link on the webpage
	 for(int i=0;i<linksCount;i++)
	 {
	 driver.navigate().to(links[i]);
	 Thread.sleep(3000);
	 driver.findElement(By.name("name")).sendKeys("Rutuja");
	 driver.findElement(By.name("email")).sendKeys("tester@grr.la");
	 driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
	 driver.findElement(By.xpath("//button[@class='btn default-btn rounded w-100 ']")).click();
	 Thread.sleep(3000);
	 driver.navigate().back();
	
	 }	
				
		

	}

}
