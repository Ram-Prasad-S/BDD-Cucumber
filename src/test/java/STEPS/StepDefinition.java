package STEPS;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User Enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String USERNAME, String PASSWORD) {
		
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("Navigates to Skills Page")
	public void navigates_to_skills_page() {
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		
		
	}

	@When("Add Skill Records with SkillName as {string} and Skill Dsescription as {string}")
	public void add_skill_records_with_skill_name_as_and_skill_dsescription_as(String SKILLNAME, String SKILLDESCR) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SKILLNAME);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SKILLDESCR);	
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
	}

	@When("Click on Logout Button")
	public void click_on_logout_button() {
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		System.out.println("Logged out");
		
	}

	@Then("Close Browser")
	public void close_browser() {
		
		//driver.close();
		//driver.quit();
		System.out.println("close");
		
	}
	
	
	@When("User Enters Username and Password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		String USERNAME = dataTable.cell(0, 0);
		String PASSWORD = dataTable.cell(0, 1);
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}
	
	
	@Then("Add Skill Records Using DataTable")
	public void add_skill_records_using_data_table(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		
		
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
	
	
	@When("User Enters Username and Password DataTable With Headers")
	public void user_enters_username_and_password_data_table_with_headers(io.cucumber.datatable.DataTable dataTable) {
	    
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
	
	
	@Then("Add Skill Records Using DataTable With Headers")
	public void add_skill_records_using_data_table_with_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		
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
