Feature: Validate 'serverInformation' tab

  Scenario: verified serverInformation option
    And click 'serverInformation' tab
    And should appear "Server OS" available first option
    And should appear "Browser" available second option
    And should appear "PHP Version" available three option
    And should appear "Mysql Version" available four option
    Then click in the bottom submit on 'server information' tab
