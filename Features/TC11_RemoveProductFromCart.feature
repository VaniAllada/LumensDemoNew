Feature: Verify the user able to remove specific product

Background: Verify user is able to Login Lumens  application
 

    Given launch the Lumens website using property file
    When Go to Account and Select signin 
    Then Enter the username and password the input field and click login button
    
Scenario: Verify the user able to remove specific product
	 
	Then Selcted Product add to cart and click on cart in HomePage
    Then Remove Product from the Cart