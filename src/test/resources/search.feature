@smokeTest
Feature: I want to test kurly search
  Scenario: search a simple string
    Given user open URL "https://www.kurly.com/m2/"
    When user search ""
    Then search result page contains "''"


