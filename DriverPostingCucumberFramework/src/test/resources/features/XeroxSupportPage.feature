Feature: Test XeroxSupportHomePage
  Verify the Xerox Drivers posted in support.xerox.com Homepage

  Background: XeroxSupportPage Model Search
    Given User open URL "https://www.support.xerox.com"
    Then Validate the support page displayed
    When Type Driver "Xerox Global Print Driver"
    And Click on Search button
    And Clcik on Model Search Link
    Then Validate the Model LinkPage

  Scenario Outline: GPD model Validate Drivers Availability
    When SelectOS <Platform>
    When SelectLanguage <Language>
    When SelectTag <Tag>
    And Click Apply Filters Btn
    And Click PS Driver MoreDetails Link
    And closebrowser

    Examples: 
      | Platform            | Language         | Tag |
      | Windows 10          | English (Global) | GPD |
      | Windows 7           | English (Global) | GPD |
      | Windows 8           | English (Global) | GPD |
      | Windows 8.1         | English (Global) | GPD |
      | Windows Server 2008 | English (Global) | GPD |
