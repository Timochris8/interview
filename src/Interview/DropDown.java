package Interview;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Feno's family\\eclipse-workspace\\Selenium\\src\\Interview"); 
		WebDriver a= new ChromeDriver();
		a.get("https://www.facebook.com/");
		WebElement b = a.findElement(By.xpath("[text()='Create New Account']"));
		b.click();
		WebElement c = a.findElement(By.id("month"));
		Select d = new Select(c);
		d.selectByIndex(2);
		d.selectByValue("4");
		d.selectByVisibleText("Dec");
				
}
}