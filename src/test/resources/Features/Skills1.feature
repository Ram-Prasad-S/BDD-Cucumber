Feature: Add Skills Records in OPEN ORANG HRM USING Automation

Background: Common steps 
    Given User launch chrome browser
    When User Enters URL
    
Scenario: TC01 Add Skills Records- Paricular Test Object

	When User Enters UserName and PassWord and Click on Enter Button
	Then Click on Admin
	Then Click on Qualifications
	And Click on Skills
	Then Click on Add Button
	Then Add SkillName and SkillDesc
	And Click on Save
	When Click on logout button
  Then Close Browser