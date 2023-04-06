package Interview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Feno's family\\eclipse-workspace\\Selenium\\src\\Interview"); 
	WebDriver a= new ChromeDriver();
	a.get("https://adactinhotelapp.com/SearchHotel.php");
	TakesScreenshot screenShot = (TakesScreenshot)a;
	File sc = screenShot.getScreenshotAs(OutputType.FILE);
	File f = new File("I:\\screenshot\\ss.jpg");
	FileUtils.copyFile(sc, f);
	
	
	
	
	
	
	
	
	
	
}
}
