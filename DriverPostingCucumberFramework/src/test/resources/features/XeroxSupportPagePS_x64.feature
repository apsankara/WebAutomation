@PS_x64bit
Feature: Test XeroxSupportHomePage for PS_x64bit
  Verify the Xerox Drivers posted in XeroxGPDHomePage

  Background: XeroxSupportPage Model Search
    Given User open URL "https://www.support.xerox.com"
    Then Validate the support page displayed
    When Type Driver "Xerox Global Print Driver"
    And Click on Search button
    And Clcik on Model Search Link
    Then Validate the Model LinkPage

  Scenario Outline: GPD PS_x64bit Driver Link Availability
    When SelectOS for PS_x64 <Platform>
    When SelectLanguage for PS_x64 <Language>
    When SelectTag for PS_x64 <Tag>
    And Click Apply Filters Btn_x64
    And Click PS_x64 Driver MoreDetails Link
    When Get PS_x64 Driver ReleasedDate <Released>
    When Get PS_x64 Driver Version <Version>
    When Get PS_x64 Driver Size <Size>
    When Get PS_x64 Driver Filename <Filename>
    When Get PS_x64 Driver Tagname <Tags>
    When Click CheckAgreeBtn
    When Clcik DownloadBtn

		
    Examples: 
      | Platform                   | Language         | Tag | Released             | Version            | Size           | Filename                            | Tags                        |
      | Windows 10 x64             | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows 11                 | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows 7 x64              | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows 8 x64              | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows 8.1 x64            | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows Server 2008 x64    | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows Server 2012 R2 x64 | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows Server 2012 x64    | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows Server 2016 x64    | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows Server 2019 x64    | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
      | Windows Server 2022 x64    | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
