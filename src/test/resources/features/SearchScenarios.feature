@Firefox
Feature: Search Scenarios
  As a user of Google, I want to be able to search for stuff

  Scenario: 01. Search and select a result
    Given I am on the search page
    When I search for "Reddit homepage"
    And I view the first result
    Then I see the Reddit homepage