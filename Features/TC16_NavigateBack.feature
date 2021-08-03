Feature: user is able to navigate back in page 

Background: Verify user is able to Login Lumens  application

    Given launch the Lumens website using property file
    When Go to Account and Select signin 
    Then Enter the username and password the input field and click login button
    
 Scenario: user is able to navigate back in page
 	
 	Then user should able to navigate the lights and navigate back to the homepage