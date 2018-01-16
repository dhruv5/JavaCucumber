$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/FirstFeature.feature");
formatter.feature({
  "line": 1,
  "name": "check the login",
  "description": "",
  "id": "check-the-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 242116,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "To test",
  "description": "",
  "id": "check-the-login;to-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "start the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "login",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Shut",
  "keyword": "When "
});
formatter.match({
  "location": "stepImplementation.start_the_app()"
});
formatter.result({
  "duration": 168258986,
  "status": "passed"
});
formatter.match({
  "location": "implementation2.login()"
});
formatter.result({
  "duration": 138367,
  "status": "passed"
});
formatter.match({
  "location": "implementation2.shut()"
});
formatter.result({
  "duration": 64308,
  "status": "passed"
});
formatter.after({
  "duration": 62327,
  "status": "passed"
});
});