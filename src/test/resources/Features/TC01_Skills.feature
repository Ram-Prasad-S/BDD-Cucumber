Feature: Create Skills Record automatiom in orange hrm 
	
		Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

		Scenario: TC01 Add Jobs - Particular Test
    When User Enters Username as "Admin" and Password as "admin123"
    Then Navigates to Skills Page
    Then Add Skill Records with SkillName as "Test Engineer" and Skill Dsescription as "Selenium Automation"
    When Click on Logout Button
    Then Close Browser
    
    
    



