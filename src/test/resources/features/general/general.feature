Feature: Validate "General" link
  Scenario: update web site
    And click 'General' link
    And click TravelHope General > Settings link
    And load png image into 'Business Logo' from "C:\\newhtml.html"
    And load png image into 'Favicon' from "C:\\newhtml.html"
    And fill the input 'Business Name' with "PHPTRAVELS"
    And fill the input 'Site URL' with "https://www.phptravels.net"
    And fill the input 'License Key' with "license"
    And fill the input 'Copyrights' with "All Rights Reserved by PHPTRAVELS"
    And fill the input 'Home Title' with "PHPTRAVELS | Travel Technology Partner"
    And fill the input 'Default Keywords' with "php travels script, php hotels booking script, php reservation system"
    And fill the input 'Default Description' with "php travels is complete booking and reservation system provides complete solution for travel agency"
    And fill the input 'Google Map API' with "AIzaSyBxuDvvvAEk0SCERQ4wc7xfLeTHynMrMNg"
    And fill the input 'Tracking & Analytics' with "PHPTRAVELS"
    Then click in the buttom submit