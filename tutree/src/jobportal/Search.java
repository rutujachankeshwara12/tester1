package jobportal;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://nowhiren.com/");
		
		driver.findElement(By.id("name_input2")).sendKeys("uber");
		String optionToSelect = new String("Darke County,OH");
		Thread.sleep(3000);
		int count=0;
        driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys("Da");
		Thread.sleep(3000);
		List<WebElement> option= driver.findElements(By.xpath("//*[@id='select2-inputAddress2-results']/li"));
		System.out.println(option.size());
		Thread.sleep(3000);
		for(WebElement ele:option) {
			//String currentoption=ele.getText();
			if((ele.getText()).contains(optionToSelect)) {
				//ele.sendKeys(Keys.ARROW_DOWN);
				//ele.sendKeys(Keys.ENTER);
				ele.click();
				count++;
				break; 
			}
		}
		if(count!=0) {
			System.out.println(optionToSelect +"selected");
		}
		else {
			System.out.println("not available");
		}
		driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[3]/input")).click();
	}
}
		
		
		
		
	
