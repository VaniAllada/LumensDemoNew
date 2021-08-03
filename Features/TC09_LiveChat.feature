Feature: LiveChat Operation

Background: Verify user is able to Login Lumens  application
 

    Given launch the Lumens website using property file
    When Go to Account and Select signin 
    Then Enter the username and password the input field and click login button
    
Scenario: user is able to Login Live chat   
    
    Then user should click livechat on homepage and login with valid credentials 