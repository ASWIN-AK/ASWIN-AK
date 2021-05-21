Feature: user want to check a application

Scenario: user Login the Login page
    Given user lauching the browser
    When user enter a username
    And user enter a valid password
    Then user verifying the valid username and password
 
Scenario: User checking search hotel 
    
    When user choose the location
    And user choose the hotel
    And user select the Roomtype
    And user select the Rooms
    And user enter the check in date
    And user enter the check out date
    And user select adults in room
    And user select childrens in room	
    Then user verify above details
    
    
Scenario: user going to select hotel

    When user select radio button
    Then user verify details
    
    
Scenario: user booking a hotel
    When user enter a first name
    And user enter a last name
    And user enter a billing address
    And user enter a credit card number
    And user select credit card type
    And user select credit card expry date
    And user select credit card month
    And user enter ccv number
    Then user book the hotel
    