package first;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.CharMatcher;

public class demo {
	
public static String browser;
static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		propertyfile.readPropertiesFile();
		driver= new FirefoxDriver();
		//driver= new ChromeDriver();
		driver.get("https://jobsdive.com/");
		driver.quit();
		String str= "apple";
	    for(int i=0; i<str.length(); i++) {
	      if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
	          str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
	          str.charAt(i) == 'u')
	        
	        System.out.println("Given string contains " + 
	            str.charAt(i)+" at the index " + i);
	    }
	    String text="Hello1010&23@";
		System.out.println(CharMatcher.digit().retainFrom(text));
	}
}


