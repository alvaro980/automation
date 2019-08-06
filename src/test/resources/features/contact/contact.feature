Feature: Validate 'contact' tab

  Scenario: Validate contact tab
    And click 'contact' tab
    And fill 'Phone number' input with "+1-234-56789"
    And fill 'Email' input with "info@travelagency.com"
    And fill 'Address' input with "1355 Market St, Suite 900 San Francisco, United States "
    Then click in the bottom submit on 'contact' tab
