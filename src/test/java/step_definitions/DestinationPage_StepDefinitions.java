package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.DestinationPage;
import page_objects.MainPage;
import selenium_helpers.SeleniumDriver;
import sun.security.krb5.internal.crypto.Des;

public class DestinationPage_StepDefinitions {
    WebDriver driver = SeleniumDriver.baseDriver;
    DestinationPage destinationPage = new DestinationPage(driver);

    @When("^I will click Fiyat Goruntuleme$")
    public void ıWillClickFiyatGoruntuleme() throws Throwable {

    }

    @Then("^I should see Fiyat Goruntuleme pop-up$")
    public void ıShouldSeeFiyatGoruntulemePopUp() throws Throwable {

    }

    @And("^I will click Avro$")
    public void ıWillClickAvro() throws Throwable {

    }

    @Then("^I should see products list$")
    public void ıShouldSeeProductsList() throws Throwable {

    }

    @When("^I will fill price to high price area$")
    public void ıWillFillPriceToHighPriceArea() throws Throwable {

    }

    @And("^Aile/cocuklar icin uygun is chosen from the Aileler icin filtreler field$")
    public void aileCocuklarIcinUygunIsChosenFromTheAilelerIcinFiltrelerField() throws Throwable {

    }

    @And("^Kusursuz is chosen from the Konuk Degerlendirmesi field$")
    public void kusursuzIsChosenFromTheKonukDegerlendirmesiField(int arg0) throws Throwable {

    }

    @And("^Ucretsiz iptal is chosen from the Odeme secenekleri field$")
    public void ucretsizIptalIsChosenFromTheOdemeSecenekleriField() throws Throwable {

    }

    @And("^Kusursuz konum is chosen from the Kategoriye göre konuk değerlendirmesi field$")
    public void kusursuzKonumIsChosenFromTheKategoriyeGöreKonukDeğerlendirmesiField() throws Throwable {
    }

    @And("^Sigara icilmeyen odalar is chosen from the Tesis olanaklari field$")
    public void sigaraIcilmeyenOdalarIsChosenFromTheTesisOlanaklariField() throws Throwable {

    }

    @And("^Otel is chosen from the Konaklama tipi field$")
    public void otelIsChosenFromTheKonaklamaTipiField() throws Throwable {

    }
}
