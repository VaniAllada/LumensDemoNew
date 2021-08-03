Feature: Verify scroll up, scroll down action on HomePage

Background: Verify user is able to Login Lumens  application
 

    Given launch the Lumens website using property file
    When Go to Account and Select signin 
    Then Enter the username and password the input field and click login button
    

Scenario: Verify scroll up, scroll down action on HomePage
    
	Then Use scroll up/down method in home page