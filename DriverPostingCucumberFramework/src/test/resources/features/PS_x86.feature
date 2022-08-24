Feature: Test XeroxGPDHomePage
  Verify the Xerox Drivers posted in XeroxGPDHomePage
  
@PS_X86  
Scenario Outline: GPD PS_x86bit Driver Link Availability
    When SelectOS for PS_x86 <Platform>
    When SelectLanguage for PS_x86 <Language>
    When SelectTag for PS_x86 <Tag>
    And Click Apply Filters Btn_x86
    And Click PS_x86 Driver MoreDetails Link
    When Get PS_x86 Driver ReleasedDate <Released>
    When Get PS_x86 Driver Version <Version>
    When Get PS_x86 Driver Size <Size>
    When Get PS_x86 Driver Filename <Filename>
    When Get PS_x86 Driver Tagname <Tags>

    Examples: 
      | Platform            | Language         | Tag | Released             | Version            | Size           | Filename                            | Tags                        |
      | Windows 10          | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
      | Windows 7           | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
      | Windows 8           | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
      | Windows 8.1         | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
      | Windows Server 2008 | English (Global) | GPD | Released: 08/12/2022 | Version: 5.887.3.1 | Size: 40.36 MB | Filename: UNIV_5.887.3.1_PS_x86.zip | Tags: GPD, PostScript, WHQL |
