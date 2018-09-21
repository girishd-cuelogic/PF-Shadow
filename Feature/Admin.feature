@smoke

Feature: Add new account for shadow application
	I should be able to add new user
Background: Flow from Homepage to User menu
Given I should navigate to login page and clicks on login
	

Scenario: I want to add new account
When click on admin menu
And click on create account submenu
And Enter account name and click on next button
Then I should see page with message Account created successfully