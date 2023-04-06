package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Feno's family\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https:demo.guru99.com/test/guru99home/");
		WebElement b = d.findElement(By.xpath("//iframe[@src='ads.html']"));
		d.switchTo().frame(b);
		WebElement a = d.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		a.click();

	}
}
