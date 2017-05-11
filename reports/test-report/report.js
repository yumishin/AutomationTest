$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/member.feature");
formatter.feature({
  "line": 2,
  "name": "I want to test Memebox member",
  "description": "",
  "id": "i-want-to-test-memebox-member",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "login to memebox home",
  "description": "",
  "id": "i-want-to-test-memebox-member;login-to-memebox-home",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user open URL \"http://www.memebox.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click to login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user put the id\"testym141@memebox.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user put the pw \"123qwe\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "login result page contains \"로그아웃\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.memebox.com/",
      "offset": 15
    }
  ],
  "location": "StepDefinition.openChrome(String)"
});
formatter.result({
  "duration": 39866718981,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.clickToLogin()"
});
formatter.result({
  "duration": 155060029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testym141@memebox.com",
      "offset": 16
    }
  ],
  "location": "Step_member_Definition.email(String)"
});
formatter.result({
  "duration": 1502560315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123qwe",
      "offset": 17
    }
  ],
  "location": "Step_member_Definition.password(String)"
});
formatter.result({
  "duration": 192887660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "로그아웃",
      "offset": 28
    }
  ],
  "location": "StepDefinition.verifyResultLogin(String)"
});
formatter.result({
  "duration": 1872068210,
  "status": "passed"
});
formatter.after({
  "duration": 2311187477,
  "status": "passed"
});
});