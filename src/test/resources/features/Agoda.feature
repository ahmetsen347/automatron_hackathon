Feature: Automatron Team Agoda Test Automation Project Feature

  Scenario: Login to Agoda with e-mail
    Given I am on the Agoda homepage
    When I will click 'Giris Yapin' link
    Then I should see Login pop -up
    Then I will fill 'E-posta'
    Then I will fill 'Sifre'
    Then I will click 'Giris Yapin' button
    Then I should see Agoda homepage