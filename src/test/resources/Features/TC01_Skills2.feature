Feature: Create Skills Record automatiom in orange hrm 
	
		Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

		Scenario Outline: TC01 Add Jobs - Particular Test
    When User Enters Username as "Admin" and Password as "admin123"
    Then Navigates to Skills Page
    Then Add Skill Records with SkillName as <SkillName> and Skill Dsescription as <SkillDescr>
    When Click on Logout Button
    Then Close Browser
    Examples:
    |SkillName|SkillDescr|
    |"Java111"|"SkillDescr111"|
    |"Java222"|"SkillDescr222"|
    |"Java333"|"SkillDescr333"|
    |"Java444"|"SkillDescr444"|
    
    



