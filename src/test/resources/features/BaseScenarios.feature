@Chrome
Feature: BaseScenarios
  These scenarios can be used in any project

  Background:
    Given I am on the base page

  Scenario: 01. Validate the title of a website
    Then I see the page title contains "DuckDuckGo"

  Scenario: 02. Validate the Url of the website
    Then I see the page Url contains "https://start.duckduckgo.com"

  Scenario: 03. Validate the PageSource string on the website
    Then I see "DuckDuckGo" in the PageSource

  Scenario: 04. Validate existence of multiple texts in PageSource
    Then I see
      | DuckDuckGo     |
      | search engine  |
      | track you      |