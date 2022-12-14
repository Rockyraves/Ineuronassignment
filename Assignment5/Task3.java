package Assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);//To avoid "NoSuchElementException" i used Thread.Sleep and waiting for 2 sec.
		
		List<WebElement> footerList=driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		int footerCount=footerList.size();
		if(footerCount==4)
		{
			System.out.println("Yes!!!!....Contains four footers in the page");
		}
		driver.quit();
		

	}

}
 