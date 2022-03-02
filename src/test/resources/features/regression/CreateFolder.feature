Feature: Create new folder
  @RegressionTest @End2End
  Scenario: Create new folder in EDAM
    Given User click on selected brand folder
    When User click on create button
    And User click on folder button
    Then user enters data in the form and save
      | OptionsList | Title                        | Name                         |
      | folder      | Test-Automation-CreateFolder | Test-Automation-CreateFolder |
    And user delete selected folder or asset
      | OptionsList | Title                        |
      | folder      | Test-Automation-CreateFolder |

