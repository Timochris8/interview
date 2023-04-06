package Interview;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Feno's family\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		WebElement a = d.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("iphone");
		a.sendKeys(Keys.ENTER);
		WebElement b = d.findElement(By.xpath("//span[text()='Apple iPhone 14 128GB Starlight']"));
		b.click();
		
		String pa = d.getWindowHandle();
		System.out.println(pa);
		Set<String> c = d.getWindowHandles();
		
		for (String z : c)	{
			if (!z.equals(pa)) {
				d.switchTo().window(z);
			}
		}
		
		WebElement y = d.findElement(By.xpath("//input[@type='button']"));
		y.click();
		
		
		
		
		
		
		
}
}