@smokeTest
Feature: I want to test Memebox search
  Scenario: search a simple string
    Given user open URL "http://www.memebox.com/"
    When user search "아임미미"
    Then search result page contains "'아임미미'"


