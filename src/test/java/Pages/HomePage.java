package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	WebDriver driver;
	
	public void Homepage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	
	public void Launch_ChromeBrowser() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	/*public void User_Enters_URL(String url) {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}*/
	public void LogOut() {
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		System.out.println("Logged out");
	}
	
	public void Close_Browser() {
		
		//driver.close();
		//driver.quit();
		System.out.println("close");
	}
	
	


}
