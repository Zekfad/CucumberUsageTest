Feature: Selenium title test
  Run Selenium title tests

  Background:
    Given Selenium driver is ready

  Scenario Outline: Selenium title test
    Given URL is <url>
    Then Title should be <title>
  Examples:
    | url                 | title            |
    | https://example.com | "Example Domain" |
    | https://google.com  | "Google"         |
