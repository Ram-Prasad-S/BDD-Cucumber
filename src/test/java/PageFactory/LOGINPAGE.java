package PageFactory;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINPAGE {
	
	
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement PassWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButton;
	
	public void LOGINPAGE1(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void Login_Senario(String USERNAME, String PASSWORD) {
		
		
		UserName.sendKeys(USERNAME);
		PassWord.sendKeys(PASSWORD);
		LoginButton.click();
	}
	
	
	public void Login_DataTableWithoutHeaders(io.cucumber.datatable.DataTable dataTable) {
		
		String USERNAME = dataTable.cell(0, 0);
		String PASSWORD = dataTable.cell(0, 1);
		
		UserName.sendKeys(USERNAME);
		PassWord.sendKeys(PASSWORD);
		LoginButton.click();
	    
	}
	
	
	public void Login_DataTableWithHeaders(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String, String>> LoginData = dataTable.asMaps();
		
		for(int i=0;i<LoginData.size();i++)
		{
			String USERNAME = LoginData.get(i).get("UserName");
			String PASSWORD = LoginData.get(i).get("PassWord");
			
			UserName.sendKeys(USERNAME);
			PassWord.sendKeys(PASSWORD);
			LoginButton.click();
					
		}
		
	}


}
