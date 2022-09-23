@PCL6_x86bit
Feature: Test XeroxSupportHomePage for PS_x86bit
  Verify the Xerox Drivers posted in XeroxGPDHomePage

  Background: XeroxSupportPage Model Search
    Given User open URL "https://www.support.xerox.com"
    Then Validate the support page displayed
    When Type Driver "Xerox Global Print Driver"
    And Click on Search button
    And Clcik on Model Search Link "Drivers & Downloads - Xerox Global Print Driver" 
    Then Validate the Model LinkPage

  Scenario Outline: GPD PS_x86bit Driver Link Availability
    When SelectOS for PS_x86 <Platform>
    When SelectLanguage for PS_x86 <Language>
    When SelectTag for PS_x86 <Tag>
    And Click Apply Filters Btn_x86
    And Click PS_x86 Driver MoreDetails Link <Filename>
    When Get PS_x86 Driver ReleasedDate <Released>
    When Get PS_x86 Driver Version <Version>
    When Get PS_x86 Driver Size <Size>
    When Get PS_x86 Driver Filename <Filename>
    When Get PS_x86 Driver Tagname <Tags>
    When Click CheckAgreeBtn
    When Clcik DownloadBtn

    Examples: 
      | Platform            | Language         | Tag | Released             | Version            | Size           | Filename                            | Tags                        |
      | Windows 10          | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
      | Windows 7           | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
      | Windows 8           | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
      | Windows 8.1         | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
      | Windows Server 2008 | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
