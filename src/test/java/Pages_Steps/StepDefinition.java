package Pages_Steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	HomePage hp = new HomePage();
	LoginPage lp = new LoginPage();
	SkillsPage sp= new SkillsPage();

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
		
		lp.Loginpage(driver);
		lp.Login(USERNAME, PASSWORD);
		
	}

	@Then("Navigates to Skills Page")
	public void navigates_to_skills_page() {
		
		sp.Skillspage(driver);
		sp.Navigate_To_SkillsPage();
		
	}

	@When("Add Skill Records with SkillName as {string} and Skill Dsescription as {string}")
	public void add_skill_records_with_skill_name_as_and_skill_dsescription_as(String SKILLNAME, String SKILLDESCR) throws InterruptedException {
		sp.Skillspage(driver);
		sp.Add_SkillRecords(SKILLNAME, SKILLDESCR);
		
		
	}

	@When("Click on Logout Button")
	public void click_on_logout_button() {
		hp.Homepage(driver);
		hp.LogOut();
	
	}

	@Then("Close Browser")
	public void close_browser() {
		hp.Homepage(driver);
		hp.Close_Browser();
		
	}
	
	
	@When("User Enters Username and Password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		lp.Loginpage(driver);
		lp.Login_DataTable_Without_Headers(dataTable);
		
	}
	
	
	@Then("Add Skill Records Using DataTable")
	public void add_skill_records_using_data_table(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		
		sp.Skillspage(driver);
		sp.Add_SkillRecords_DataTable_Without_Header(dataTable);	    
	}
	
	
	@When("User Enters Username and Password DataTable With Headers")
	public void user_enters_username_and_password_data_table_with_headers(io.cucumber.datatable.DataTable dataTable) {
	    
		lp.Loginpage(driver);
		lp.Login_DataTable_With_Headers(dataTable);
		
	}
	
	
	@Then("Add Skill Records Using DataTable With Headers")
	public void add_skill_records_using_data_table_with_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		sp.Skillspage(driver);
		sp.Add_SkillRecords_DataTable_With_Header(dataTable);		
	}

}
