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
Feature: Validating Place APIs
  I want to use this template for my feature file

  @AddPlace @Regression
  Scenario Outline: Verify if place is being successfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When User calls "AddPlaceAPI" with "Post" Http request
    Then The API call is successful with status code 200
    And "status" in response body is "OK"
		And "scope" in response body is "APP"
		And Verify place_id created maps to "<name>" using "GetPlaceAPI"
  
  Examples:
  	| name    | language | address       			 |
  	| AAhouse | English  | World Cross Center  |
  #	| BBhouse | German   | Globe Cross Center  |
  	
  @DeletePlace @Regression
	Scenario: Verify if Delete Place functionality is working
    Given DeletePlace Payload
    When User calls "DeletePlaceAPI" with "Post" Http request
    Then The API call is successful with status code 200
    And "status" in response body is "OK"
		