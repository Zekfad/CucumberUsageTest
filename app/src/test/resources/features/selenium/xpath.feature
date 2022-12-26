Feature: Selenium XPath test
  Run Selenium XPath tests

  Background:
    Given Selenium driver is ready

  Scenario Outline: Selenium XPath presence test
    Given URL is <url>
    Then Find element with xpath <xpath>
  Examples:
    | url                 | xpath                   |
    | https://example.com | "/html/body/div/h1"     |
    | https://example.com | "/html/body/div/p[1]"   |
    | https://example.com | "/html/body/div/p[2]/a" |


  Scenario Outline: Selenium XPath value test
    Given URL is <url>
    Then Find element with xpath <xpath>
    Then Element contents should be <contents>
  Examples:
    | url                 | xpath                   | contents              |
    | https://example.com | "/html/body/div/h1"     | "Example Domain"      |
    | https://example.com | "/html/body/div/p[1]"   | "This domain is for use in illustrative examples in documents. You may use this domain in literature without prior coordination or asking for permission." |
    | https://example.com | "/html/body/div/p[2]/a" | "More information..." |
