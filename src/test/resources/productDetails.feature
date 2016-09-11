@smokeTest
Feature: I want to test Memebox productDetails page
  Scenario: verify product details page
    Given user open URL "http://www.memebox.com/"
    When user search "아임미미"
    And user goes product detail page
    Then product detail page contains "찜하기" in the "dealSwitch" area
    When user click to delivery
    Then product detail page contains "배송안내" in the "dealDelivery" area