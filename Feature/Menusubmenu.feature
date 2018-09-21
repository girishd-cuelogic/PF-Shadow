@smoke
Feature:User should be able to click on account manager menu

Background: Flow from homepage to Account manager menu

Given Users should navigate to login page and clicks on login

#Scenario: Click on account manager menu
#When User Clicks on account manager menu
#And User clicks on users submenu
#And User clicks on Add User button
#And User enters information on add user pop up
#And User clicks on add user button
#Then User should see add user successful message
	
#Scenario: I want to update user 
#When User Clicks on account manager menu
#And User clicks on users submenu
#And I click edit icon from the user list
#And I update user details 
#And I click on update button
#Then I should see page with message User was successfully updated

Scenario: I want to delete user 
When User Clicks on account manager menu
And User clicks on users submenu
And I click delete icon from the user list
And I click on delete button
Then I should see page with message User was successfully deleted

