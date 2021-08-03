Feature: user is able to add the product to cart

Background: Verify user is able to Login Lumens  application
 

    Given launch the Lumens website using property file
    When Go to Account and Select signin 
    Then Enter the username and password the input field and click login button
    
Scenario: User able to increase the quantity of the product 
	
	Then select the product and increase the quantity of the product