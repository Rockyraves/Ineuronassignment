package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);//To avoid "NoSuchElementException" i used Thread.Sleep and waiting for 2 sec.
		
		WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']"));
		if(logo.isDisplayed())
		{
			System.out.println("Yes!!..logo is present in the application");
		}
		else
		{
			System.out.println("Sorry!!..logo is not present in the application");

		}
		
		driver.quit();
	}

}
