package Assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		By locator=By.xpath("//div[@class='orangehrm-login-footer-sm']/a");
		List<WebElement> footerlist=driver.findElements(locator);
		for(WebElement e:footerlist)
		{
			String text=e.getAttribute("href");
			
			System.out.println(text);
			
			if(text.contains("youtube"))
			{
				System.out.println(text);
				break;
			}

		}


	}

}
