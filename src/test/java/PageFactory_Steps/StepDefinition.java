package PageFactory_Steps;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HOMEPAGE;
import PageFactory.LOGINPAGE;
import PageFactory.SKILLSPAGE;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	HOMEPAGE hp= new HOMEPAGE();
	LOGINPAGE lp= new LOGINPAGE();
	SKILLSPAGE sp= new SKILLSPAGE();

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
		
		lp.LOGINPAGE1(driver);
		lp.Login_Senario(USERNAME, PASSWORD);		
	}

	@Then("Navigates to Skills Page")
	public void navigates_to_skills_page() {
		
		sp.SKILLSPAGE1(driver);
		sp.Navigate_to_SkillsPAge();		
	}

	@When("Add Skill Records with SkillName as {string} and Skill Dsescription as {string}")
	public void add_skill_records_with_skill_name_as_and_skill_dsescription_as(String SKILLNAME, String SKILLDESCR) throws InterruptedException {
	
		sp.SKILLSPAGE1(driver);
		sp.Add_SkillRecords_Senario(SKILLNAME, SKILLDESCR);		
	}

	@When("Click on Logout Button")
	public void click_on_logout_button() {
		
		hp.HOMEPAGE1(driver);
		hp.Click_On_LogOutButton();		
	}

	@Then("Close Browser")
	public void close_browser() {
		
		hp.HOMEPAGE1(driver);
		hp.Close_Browser();		
	}
	
	
	@When("User Enters Username and Password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		lp.LOGINPAGE1(driver);
		lp.Login_DataTableWithoutHeaders(dataTable);
	}
	
	
	@Then("Add Skill Records Using DataTable")
	public void add_skill_records_using_data_table(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
	    sp.SKILLSPAGE1(driver);
	    sp.Add_SkillRecords_DataTable_Without_Headers(dataTable);
	}
	
	
	@When("User Enters Username and Password DataTable With Headers")
	public void user_enters_username_and_password_data_table_with_headers(io.cucumber.datatable.DataTable dataTable) {
	    
		lp.LOGINPAGE1(driver);
		lp.Login_DataTableWithHeaders(dataTable);		
	}
	
	
	@Then("Add Skill Records Using DataTable With Headers")
	public void add_skill_records_using_data_table_with_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		sp.SKILLSPAGE1(driver);
		sp.Add_SkillRecords_DataTable_With_Headers(dataTable);
		
	}

}
