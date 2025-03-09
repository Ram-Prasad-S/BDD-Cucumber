Feature: Create Skills Record automatiom in orange hrm 
	
		Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

		Scenario: TC01 Add Jobs - Particular Test
    When User Enters Username and Password DataTable With Headers
    			|UserName|PassWord|
    			|Admin|admin123|
    			
    Then Navigates to Skills Page
    Then Add Skill Records Using DataTable With Headers
    		|SkillName|SkillDescription|
    		|Selenium333|SeleniumDescription333|
    		|Selenium666|SeleniumDescription666|
    		|Selenium999|SeleniumDescription999|
    		|Selenium|SeleniumDescription|
    			
    When Click on Logout Button
    Then Close Browser
    
    
    



