package first;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertyfile {
	static Properties pro= new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		//readPropertiesFile();
		
	}
	
     public static void readPropertiesFile() {

		try {
			InputStream input= new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\tutree\\src\\first\\demo.properties");
		    pro.load(input);
		   System.out.println(pro.getProperty("browser")); 
		   demo.browser =pro.getProperty("browser");
		   //System.out.println(demo.browser);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		public static void writePropertiesFile() {
		
			try {
				OutputStream output= new FileOutputStream("C:\\Users\\LENOVO\\eclipse-workspace\\tutree\\src\\first\\demo.properties");
			pro.setProperty("browser", "Firefox");
			pro.store(output, null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
}
