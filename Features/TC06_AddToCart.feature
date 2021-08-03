Feature: user is able to add the product to cart

Background: Verify user is able to Login Lumens  application
 

    Given launch the Lumens website using property file
    When Go to Account and Select signin 
    Then Enter the username and password the input field and click login button
    
Scenario: user is able to add the product to cart
 	
 	Then user able to navigate to ligthings and Large Chandelier
 	Then user is able to select the product and add to cart