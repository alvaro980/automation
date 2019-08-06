Feature: Validate 'serverInformation' tab

  Scenario: verified serverInformation option
    And click 'serverInformation' tab
    And should appear "Server OS" on enable option
    And should appear "Browser" on enable option
    And should appear "PHP Version" on enable option
    And should appear "Mysql Version" on enable option
    Then click in the bottom submit on 'server information' tab
