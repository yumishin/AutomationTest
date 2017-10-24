@smokeTest
Feature: I want to test kurly member
  Scenario: login to kurly home
    Given user open URL "https://www.kurly.com/m2"
    When user click to login page
    When user put the id"kurlyumi"
    When user put the pw "111111111q"
    When user click to change the pwd in main pop-up
    When user click to login page
    When user click to logout
    Then login result page contains "로그아웃"
