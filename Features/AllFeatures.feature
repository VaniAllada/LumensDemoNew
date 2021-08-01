Feature: This is to test User Registration operation in Lumens page

@Scenario1
Scenario: Verifying User Registration functionality
	Given user able to open browser and enter url
	Then user able to mouseover on account and select my account
	Then user able to fill details for account creation
	Then user able to click createaccount button

@Scenario2
Scenario: user is able to Login Lumens  application
    Given user able to open browser and enter url
    When Mouse over to account and click sign In button
    Then Enter the valid credentials