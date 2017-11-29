@smokeTest
Feature: I want to test kurly productDetails page
  Scenario: verify product details page
    Given user open URL "https://www.kurly.com/m2/"
    When user goes main popular-goods page
    Then product detail page contains "" in the "" area
    And user goes product detail page
    Then product detail page contains "찜하기" in the "dealSwitch" area
    When user click to delivery
