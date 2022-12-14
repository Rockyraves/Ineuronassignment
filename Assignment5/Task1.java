package Assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//*******************************************************************//		
		String url=driver.getCurrentUrl();
		if(url.endsWith("login"))
		{
			System.out.println("Yes!! url Ends with Login");
		}
		else
		{
			System.out.println("No!!!!!!!!");
		}
		
		//*******************************************************************//	
		
		if(url.contains("demo"))
		{
			System.out.println("Yes!! url contains demo in the url");
		}
		else
		{
			System.out.println("No!!!!!!!!");
		}
		//*******************************************************************//	
		
		String title=driver.getTitle();
		if(title.contains("HRM"))
		{
			System.out.println("Yes!!.... HRM is present in the url");
		}
		else
		{
			System.out.println("No!!!!!!!!");
		}
		
		driver.quit();
		
		

	}

}
