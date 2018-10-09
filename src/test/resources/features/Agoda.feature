Feature: Automatron Team Agoda Test Automation Project Feature

  Scenario: Login to Agoda with e-mail
    Given I am on the Agoda homepage
    When I will click 'Giris Yapin' link
    Then I should see Login pop -up
    Then I will fill 'E-posta'
    Then I will fill 'Sifre'
    Then I will click 'Giris Yapin' button
    Then I should see Agoda homepage

  Scenario: Paris Otel First Search
    Given I must be logged in Agoda website
    And I will fill first search-box with city
    And I will fill second datepicker with startDate
    And I will fill third datepicker with finishDate
    Then I should see attendee pop-up menu
    And I will choose 1 child
    And I will choose child age 2
    And I will click 'Aile odasi tercih ediyorum'
    And I will click 'Ara' button
    Then I should see the products are listed