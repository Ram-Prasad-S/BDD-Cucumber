package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOMEPAGE {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")
	WebElement UserButton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
	WebElement LogoutButton;
	
	public void HOMEPAGE1(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void Click_On_LogOutButton() {
		
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
