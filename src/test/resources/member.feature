@smokeTest
Feature: I want to test kurly member
  Scenario: login to kurly home
    Given user open URL "https://www.kurly.com/m2"
    When user click to login page
    When user put the id"kurkyumi"
    When user put the pw "111111111q"
    Then login result page contains "로그아웃"
