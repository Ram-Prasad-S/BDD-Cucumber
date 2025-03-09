package Pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillsPage {
	
	WebDriver driver;
	
	public void Skillspage(WebDriver driver1)
	{
		this.driver= driver1;
	}
	
	public void Navigate_To_SkillsPage() {
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		
		
	}
	
	public void Add_SkillRecords(String SKILLNAME, String SKILLDESCR) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SKILLNAME);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SKILLDESCR);	
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
	}
	
	
	public void Add_SkillRecords_DataTable_Without_Header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		
		
		List<List<String>> LoginRecords = dataTable.cells();
		
		for (int i=0; i<LoginRecords.size();i++)
		{
			String SKILLNAME = LoginRecords.get(i).get(0);
			String SKILLDESCR = LoginRecords.get(i).get(1);	
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SKILLNAME);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SKILLDESCR);	
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(2000);
		}		
	    
	}
	
	public void Add_SkillRecords_DataTable_With_Header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		
		List<Map<String, String>> SkillsData = dataTable.asMaps();
	   
		for(int i=0;i<SkillsData.size();i++)
		{
			String SKILLNAME = SkillsData.get(i).get("SkillName");
			String SKILLDESCR = SkillsData.get(i).get("SkillDescription");
			
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SKILLNAME);
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SKILLDESCR);	
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			Thread.sleep(2000);
		}
		
		
	}

}
