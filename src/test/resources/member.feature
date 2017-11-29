@smokeTest
Feature: I want to test kurly member
  Scenario: login to kurly home
    Given user open URL "https://www.kurly.com/m2/"
    When login_user click to login page
    When sign up_user click the sign up
    Then sign up_page contains verify "회원가입"
    When sign up_input id "kurlyumiautotest"
    When sign up_click id check
    When sign up_input password "111111111q"
    When sign up_input password2 "111111111q"
    When sign up_input name "신유미테스트"
    When sign up_input email "kurlytest@kurly.com"
    When sign up_input phoneNumber1 "012"
    When sign up_input phoneNumber2 "3456"
    When sign up_input phoneNumber3 "7890"
    When sign up_click to get phoneNumber confirm
    When sign up_input phoneNumber confirm "1111"


    #When login_user put the id"kurlyumi"
    #When login_user put the pw "111111111q"
    #When login_user click to login page
    #When user click to logout

