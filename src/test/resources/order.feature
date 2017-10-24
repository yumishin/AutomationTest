@smokeTest
Feature: I want to test kurly order.
  Scenario: login to kurly.com home
    Given user open URL "https://www.kurly.com/m2"
    When user click to login page
    When user put the id"kurlyumi"
    When user put the pw "111111111q"
    Then Check the main URL
    When user goes main popular-goods page

