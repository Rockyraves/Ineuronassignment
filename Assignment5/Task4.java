package Assignment5;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		String LinkedInID=driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).getAttribute("href");
		
		String facebookID=driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]")).getAttribute("href");
		String twitterID=driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]")).getAttribute("href");
		String youtubeID=driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).getAttribute("href");
		
		HashMap<String,String> m1=new HashMap<String,String>();
		m1.put("LinkedIn",LinkedInID);
		m1.put("FaceBook",facebookID);
		m1.put("Twitter",twitterID);
		m1.put("Youtube",youtubeID);
		
		System.out.println(m1);
		
		
	}

}
