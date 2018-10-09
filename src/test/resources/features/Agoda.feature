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
    When I will click 'Fiyat Goruntuleme'
    Then I should see 'Fiyat Goruntuleme' pop-up
    And I will click 'Avro'
    Then I should see Agoda
    And I will fill first search-box 'Paris'
    And I will fill second search-box '20.04.2019'
    And I will fill third search-box '23.04.2019'
    Then I should see pop-up menu
    And I will choose 2 adults
    And I will choose 1 child
    And I will choose child age 2
    And I will click 'Aile odasi tercih ediyorum'
    And I will click 'Ara' button
    Then I should see the products are listed