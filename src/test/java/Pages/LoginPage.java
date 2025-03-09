package Pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	
	public void Loginpage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void Login(String USERNAME, String PASSWORD) {
		
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	public void Login_DataTable_Without_Headers(io.cucumber.datatable.DataTable dataTable) {
		
		String USERNAME = dataTable.cell(0, 0);
		String PASSWORD = dataTable.cell(0, 1);
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}
	
	
	public void Login_DataTable_With_Headers(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String, String>> LoginData = dataTable.asMaps();
		
		for(int i=0;i<LoginData.size();i++)
		{
			String USERNAME = LoginData.get(i).get("UserName");
			String PASSWORD = LoginData.get(i).get("PassWord");
			
			driver.findElement(By.name("username")).sendKeys(USERNAME);
			driver.findElement(By.name("password")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
					
		}
		
	}

}
