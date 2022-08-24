@supportpage
Feature: Test XeroxSupportHomePage
  Verify the Xerox Drivers posted in support.xerox.com Homepage

  Background: XeroxSupportPage Model Search
    Given User open URL "https://www.support.xerox.com"
    Then Validate the support page displayed
    When Type Driver "Xerox Global Print Driver"
    And Click on Search button
    And Clcik on Model Search Link
    Then Validate the Model LinkPage
    
    
  