package PageFactory;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SKILLSPAGE {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	WebElement AdminButton;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")
	WebElement QualificationsTab;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")
	WebElement SkillsOption;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	WebElement AddButton;
	
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	WebElement SkillNameTextBox;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
	WebElement SkillDescrptionTextBox;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement SaveButton;
	
	
	
	public void SKILLSPAGE1(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void Navigate_to_SkillsPAge() {
		
		AdminButton.click();
		QualificationsTab.click();
		SkillsOption.click();
		}
	
	public void Add_SkillRecords_Senario(String SKILLNAME, String SKILLDESCR) throws InterruptedException {
		
		AddButton.click();
		SkillNameTextBox.sendKeys(SKILLNAME);
		SkillDescrptionTextBox.sendKeys(SKILLDESCR);	
		SaveButton.click();
		Thread.sleep(2000);
		
	}
	
	
	public void Add_SkillRecords_DataTable_Without_Headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {		
		
		List<List<String>> LoginRecords = dataTable.cells();
		
		for (int i=0; i<LoginRecords.size();i++)
		{
			String SKILLNAME = LoginRecords.get(i).get(0);
			String SKILLDESCR = LoginRecords.get(i).get(1);
			
			AddButton.click();
			SkillNameTextBox.sendKeys(SKILLNAME);
			SkillDescrptionTextBox.sendKeys(SKILLDESCR);	
			SaveButton.click();
			Thread.sleep(2000);
		}		
	    
	}
	
	
	public void Add_SkillRecords_DataTable_With_Headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		
		List<Map<String, String>> SkillsData = dataTable.asMaps();
	   
		for(int i=0;i<SkillsData.size();i++)
		{
			String SKILLNAME = SkillsData.get(i).get("SkillName");
			String SKILLDESCR = SkillsData.get(i).get("SkillDescription");
			
			AddButton.click();
			SkillNameTextBox.sendKeys(SKILLNAME);
			SkillDescrptionTextBox.sendKeys(SKILLDESCR);	
			SaveButton.click();
			Thread.sleep(2000);
			
			
			
		}
		
		
	}


}
