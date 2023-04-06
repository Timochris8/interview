package Interview;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Feno's family\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://demo.automationtesting.in/Alerts.html");
	
	WebElement a = d.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	a.click();
	
	WebElement b = d.findElement(By.xpath("//button[@onclick='promptbox()']"));
	b.click();
	
	Alert c = d.switchTo().alert();
	c.sendKeys("press");
	
	
	Thread.sleep(3000);
	//positive
	c.accept();
	//negative
	c.dismiss();
	
}
}