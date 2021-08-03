Feature: user is able to add the product to cart

Background: Verify user is able to Login Lumens  application
 

    Given launch the Lumens website using property file
    When Go to Account and Select signin 
    Then Enter the username and password the input field and click login button
    
Scenario: user is able to view  the added product in the cart 
	 
	And Mouseover on lightenings and select the product 
	Then add the product to the cart 
	And user is able to view the cart 