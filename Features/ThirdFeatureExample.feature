Feature: EXAMPLE 
Scenario Outline: Eating
  Given there are <start> 
  When I eat <eat>
  Then I should have <left>

  Examples:
    | start | eat | left |
    |  12   |  5  |  7   |
    |  20   |  5  |  15  |