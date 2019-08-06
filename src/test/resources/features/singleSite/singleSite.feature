Feature: Validate 'watermark' link

  Scenario: update watermark option settings
    And click 'watermark' link
    And select "Yes" on enable option
    And select "Bottom Left" on Position option
    Then click in the bottom submit in watermark tab
