package SKILLS_STEPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SkillsStepDefinition {

	WebDriver driver;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();

	}
	
	@When("User Enters URL")
	public void user_enters_url() {
	    
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User Enters UserName and PassWord and Click on Enter Button")
	public void user_enters_user_name_and_pass_word_and_click_on_enter_button() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("Click on Admin")
	public void click_on_admin() {
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		
	}

	@Then("Click on Qualifications")
	public void click_on_qualifications() {
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		
	}

	@Then("Click on Skills")
	public void click_on_skills() {
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		
	}

	@Then("Click on Add Button")
	public void click_on_add_button() {
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();		
		
	}

	@Then("Add SkillName and SkillDesc")
	public void add_skill_name_and_skill_desc() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Java111");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Java111Descr");		
		Thread.sleep(2000);
		
	}

	@Then("Click on Save")
	public void click_on_save() {
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	}
	
	@When("Click on logout button")
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

}
