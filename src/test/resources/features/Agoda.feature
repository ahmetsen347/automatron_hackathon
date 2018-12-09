Feature: Automatron Team Agoda Test Automation Project Feature

  Scenario: Login to Agoda with e-mail
    Given I am on the Agoda homepage
    When I will click 'Giris Yapin' link
    Then I should see Login pop -up
    Then I will fill 'E-posta'
    Then I will fill 'Sifre'
    Then I will click 'Giris Yapin' button
    Then I should see Agoda homepage
"""
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

    Scenario: Paris Detail Search
    Given I should see the products are listed
    When I will click Fiyat Goruntuleme
    Then I should see Fiyat Goruntuleme pop-up
    And I will click Avro
    Then I should see products list
    When I will fill price to high price area
    And Aile/cocuklar icin uygun is chosen from the Aileler icin filtreler field
    And Kusursuz is chosen from the Konuk Degerlendirmesi field
    And Ucretsiz iptal is chosen from the Odeme secenekleri field
    And Kusursuz konum is chosen from the Kategoriye göre konuk değerlendirmesi field
    And Sigara icilmeyen odalar is chosen from the Tesis olanaklari field
    And Otel is chosen from the Konaklama tipi field

  Scenario: Paris Hotel Reservations
    Given I must see otel for Paris
    When I will click Rezervasyon Yap ve Sonra Ode button
    Then I should see Payment Option Popup
    Then I will click Sonra Odeyin button
    Then I should see Ad Soyad
    Then I should see e-posta
    Then I will click Devam button

  Scenario: Paris Hotel Checkout
    Given I must see Odeme Bilgileri page
    When I should see  Kayitli Kartlarim
    Then I will fill CVV
    Then I will click Ayirtin & Sonra Ödeyin
"""
"""
  Scenario: Flights to Paris
    When I w ill click Ucuslar
    And I will fill to where city area
    And I will fill depart date
    And I will fill return date
    And I will choose 2 adult
    And I will choose 1 child
    And I will click Ara button
    Then I should see the products are listed

  # Scenario: Roma First Search
    Given I must be logged in Agoda website
    And I will fill first search-box Roma'
    And I will fill start date
    And I will fill end date
    Then I should see pop-up menu
    And I will choose 1 child
    And I will choose child age 2
    And I will click Aile odasi tercih ediyorum
    And I will click Ara button
    Then I should see the products are listed

  Scenario: Roma Detail Search
    Given I should see the products are listed
    When I will click Fiyat Goruntuleme
    Then I should see Fiyat Goruntuleme pop-up
    And I will click Avro
    Then I should see products list
    When I will fill price to high price area
    And Aile/cocuklar icin uygun is chosen from the Aileler icin filtreler field
    And 8+ Kusursuz is chosen from the Konuk Degerlendirmesi field
    And Ucretsiz iptal is chosen from the Odeme secenekleri field
    And Kusursuz konum is chosen from the Kategoriye göre konuk değerlendirmesi field
    And Sigara icilmeyen odalar is chosen from the Tesis olanaklari field
    And Otel is chosen from the Konaklama tipi field
    Then I should see the products are listed

  Scenario: Roma Hotel Reservations
    Given I must see otel for Roma
    When I will click Rezervasyon Yap ve Sonra Ode button
    Then I should see Payment Option Popup
    Then I will click Sonra Odeyin button
    Then I should see Ad Soyad
    Then I should see e-posta
    Then I will click Devam button

  Scenario: Roma Hotel Checkout
    Given I must see Odeme Bilgileri page
    When I should see  Kayitli Kartlarim
    Then I will fill CVV
    Then I will click Ayirtin & Sonra Ödeyin


  Scenario: Flights to Roma

    Given I should see Agoda homepage
    When I will click Ucuslar
    And I will fill to where city area
    And I will fill depart date
    And I will fill return date
    And I will choose 2 adult
    And I will choose 1 child
    And I will click Ara button
    Then I should see the products are listed


  Scenario: Sign Out
    Given I must be logged in Agola website
    When I will click Hesabim
    And I should see header menu group
    And I will click Oturumu Kapat
    Then I should see return Agoda homepage


  Scenario: Login Negative Case
    Given I am on the Agoda homepage
    When I will click Giris Yapin link
    Then I should see Login pop-up
    Then I will fill E-posta
    Then I will fill Sifre
    Then I will click Giris Yapin button
    Then I should see warning message


  Scenario: Flights Negative Case

    Given I should see Agoda homepages
    When I will click Ucuslar
    And I will click Ara button
    Then I should see warning message
"""
