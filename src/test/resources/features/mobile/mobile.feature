Feature: Validate 'mobile' tab

  Scenario: Validate mobile tab
    And click 'mobile' tab
    And fill 'Api key' input with "phptravels"
    And fill 'MObile Section Footer' with "https://itunes.apple.com/us/app/phptravels/id1018217005?mt=8"
    And fill 'URL' input with "https://play.google.com/store/apps/details?id=com.phptravelsnative"
    Then click in the bottom submit on 'server mobile' tab
