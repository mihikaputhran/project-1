#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Search Page
 

  @tag1
  Scenario: Search a Product positive test (Test1, Test2)
    Given User Enters amazon.com
    And User enters search creteria 
    When user click search button
    Then Products matching to the search creteria should be displayed.
   

  @tag2
  Scenario Outline: User clicks search button without entering search creteria.
    Given User enters amazon.com
    When User clicks serach button.
    Then Error message should be displayed to enter search creteria.

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
