package jobportal;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class pagination {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://nowhiren.com/");
		//driver.findElement(By.id("name_input2")).sendKeys("uber");
		String optionToSelect = new String("New York City,NY");
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys("New y");
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
	    String url;
	    try {
			driver.findElement(By.xpath("(//*[@class='pagination justify-content-end secondary-font'])")).click();
			url = (driver.getCurrentUrl());
		} catch (Exception e) {
			driver.findElement(By.xpath("(//*[@class='pagination justify-content-end secondary-font]")).click();
			 url = (driver.getCurrentUrl());

		}

		System.out.println("url");
		
		String subUrl = url.substring(0, url.length() - 1);
		int counter=2;
		while(true) {
			System.out.println(subUrl+counter);
			driver.get(subUrl+counter);
			System.out.println("text"+driver.findElement(By.xpath("(//*[@class='h4'])[1]")).getAttribute("innerHTML"));
			if(driver.findElement(By.xpath("(//*[@class='h4'])[1]")).getAttribute("innerHTML").contains("( 0 Jobs )")) {
				System.out.println("Condition met");
				break;
			}else {
				counter++;
				System.out.println(counter);
				System.out.println("Condition not met");
				
			}
			
			
		}

	    }
	    }

	    
        
	       


