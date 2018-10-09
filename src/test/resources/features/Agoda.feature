Feature: Automatron Team Agoda Test Automation Project Feature

  Scenario: Login to Agoda with e-mail
    Given I am on the Agoda homepage
    When I will click "Giriş Yapın" link
    Then I should see Login pop -up
    Then I will fill "E-posta"
    Then I will fill "Şifre"
    Then I will click "Giriş Yapın" button
    Then I should see Agoda homepage