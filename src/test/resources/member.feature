@smokeTest
Feature: I want to test Memebox member
  Scenario: login to memebox home
    Given user open URL "http://www.memebox.com/"
    When user click to login page
    When user put the id"testym141@memebox.com"
    When user put the pw "123qwe"
    Then login result page contains "로그아웃"

  Scenario: SignUp to memebox home
    Given user open URL "http://www.memebox.com/"
    When user click to SignUp page
