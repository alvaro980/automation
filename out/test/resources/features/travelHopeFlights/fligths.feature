Feature: Validate "TRAVELHOPE FLIGHTS link
  Scenario: update travelhope flights settings
    And click "TravelHope Flights" link
    And click TravelHope Flights > Settings link
    And fill the input API Endpoint with "https://bookingengine.co/api/flight/"
    And fill the input OTA ID with "8ed24880-e6ad-11e8-a4c9-15f8a84bf814"
    And select the option "Production" in API Environment
    Then click in the bottom submit
