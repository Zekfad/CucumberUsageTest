Feature: Find schedule on RSREU website
  Test if there is schedule on RSREU website

  Background:
    Given Selenium driver is ready

  Scenario: Find schedule
    Given URL is http://rsreu.ru/
    Then Find link with text "Студенту"
    Then Hover over element
    Then Wait 250 ms
    Then Find link with text "Расписание занятий"
    Then Follow link element
    Then Find link with text "ФВТ 2 курс"
    Then Element should be a link
