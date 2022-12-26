Feature: Selenium links test
  Run Selenium links tests

  Background:
    Given Selenium driver is ready

  Scenario Outline: Selenium link test
    Given URL is <url>
    Then Find element with xpath <xpath>
    Then Element should be a link
    Then Follow link element
	Then URL should be <link>
  Examples:
    | url                 | xpath                   | link                                  |
    | https://example.com | "/html/body/div/p[2]/a" | https://www.iana.org/domains/reserved |
