@smokeTest
Feature: I want to test Memebox member
  Scenario: login to memebox home
    Given user open URL "http://www.memebox.com/"
    When user click to login page
    When user put the id and pw "testym141@memebox.com","123qwe"
    Then login result page contains "로그아웃"
