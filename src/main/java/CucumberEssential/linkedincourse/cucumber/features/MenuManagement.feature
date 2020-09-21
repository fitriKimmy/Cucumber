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
Feature: Menu Management

@SmokeTest
Scenario: Add menu Item
Given I have menu item with name "Cucumber Sandwich" with price 20
When I add that menu item
Then menu item with name "Cucumber Sandwich" should be added

@RegularTest
Scenario: Add second menu Item
Given I have menu item with name "Chicken Sandwich" with price 25
When I add that menu item
Then menu item with name "Cucumber Sandwich" should be added

@RegularTest @NightlyBuild
Scenario: Add third menu Item
Given I have menu item with name "Chicken Tuna Sandwich" with price 30
When I add that menu item
Then menu item with name "Cucumber Sandwich" should be added