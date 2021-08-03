Feature: user is able to Signout Lumens  application

Background: Verify user is able to Login Lumens  application
 

    Given launch the Lumens website using property file
    When Go to Account and Select signin 
    Then Enter the username and password the input field and click login button
    
 Scenario: user is able to Signout Lumens  application
   
    Then again mousehover on account click on signOut