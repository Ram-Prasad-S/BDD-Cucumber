Feature: Create Skills Record automatiom in orange hrm 
	
		Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

		Scenario: TC01 Add Jobs - Particular Test
    When User Enters Username and Password
    
    			|Admin|admin123|
    			
    Then Navigates to Skills Page
    Then Add Skill Records Using DataTable
    
    		|Selenium222|SeleniumDescription222|
    		|Selenium555|SeleniumDescription555|
    		|Selenium888|SeleniumDescription888|
    		|Selenium000|SeleniumDescription000|
    			
    When Click on Logout Button
    Then Close Browser
    
    
    



