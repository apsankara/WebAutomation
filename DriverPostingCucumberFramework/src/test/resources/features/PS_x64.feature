Feature: Test XeroxGPDHomePage
  Verify the Xerox Drivers posted in XeroxGPDHomePage
  
@PS_x64bit
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

    Examples: 
      | Platform            | Language         | Tag | Released             | Version            | Size           | Filename                            | Tags                        |   
      | Windows 10 x64      | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 42.35 MB | Filename: UNIV_5.887.3.1_PS_x64.zip | Tags: GPD, PostScript, WHQL |
