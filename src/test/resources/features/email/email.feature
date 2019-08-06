Feature: Validate 'email' tab

  Scenario: Validate email tab
    And click 'email' tab
    And select "PHP Mailer" on 'Mailer' option
    And fill 'Email' with "bookings@domain.com"
    And fill 'Test Email Receiver' with "test@gmail.com"
    And click on 'Test Email'
    Then click in the bottom submit on 'email' tab
