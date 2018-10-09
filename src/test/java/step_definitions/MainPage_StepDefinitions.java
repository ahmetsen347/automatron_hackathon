package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_helpers.XmlHelper;
import data_objects.LoginData;
import data_objects.RootData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page_objects.MainPage;
import selenium_helpers.SeleniumDriver;

import java.util.List;

public class MainPage_StepDefinitions {
    WebDriver driver = SeleniumDriver.baseDriver;
    MainPage mainPage = new MainPage(driver);
    RootData rootData = XmlHelper.getRootDataFromXml();
    String loginEmail;
    String loginPassword;

    private void getRequiredData(){
        List<LoginData> loginDataList = rootData.getLoginDataList();
        for (LoginData loginData : loginDataList){
            loginEmail = loginData.getEmail();
            loginPassword = loginData.getPassword();
        }
    }

    @Given("^I am on the Agoda homepage$")
    public void i_am_on_the_Agoda_homepage() throws Throwable {
        getRequiredData();
        Assert.assertEquals(true, mainPage.validateSignInButton());
    }

    @When("^I will click 'Giris Yapin' link$")
    public void i_will_click_Giris_Yapin_link() throws Throwable {
        mainPage.clickSignInButton();
    }

    @Then("^I should see Login pop -up$")
    public void i_should_see_Login_pop_up() throws Throwable {
        Assert.assertEquals(true, mainPage.validateSignInPanel());
    }

    @Then("^I will fill 'E-posta'$")
    public void i_will_fill_E_posta() throws Throwable {
        mainPage.clickAndClearLoginEmailInputArea();
        mainPage.sendKeysToLoginEmailInputArea(loginEmail);
    }

    @Then("^I will fill 'Sifre'$")
    public void i_will_fill_Sifre() throws Throwable {
        mainPage.clickAndClearLoginPasswordInputArea();
        mainPage.sendKeysToLoginPasswordInputArea(loginPassword);
    }

    @Then("^I will click 'Giris Yapin' button$")
    public void i_will_click_Giris_Yapin_button() throws Throwable {
        mainPage.clickSignInSubmitButton();
    }

    @Then("^I should see Agoda homepage$")
    public void i_should_see_Agoda_homepage() throws Throwable {
        Assert.assertEquals(true, mainPage.validateLoginValidationClass());
    }

    @Given("^I am on the Agoda homepage$")
    public void ı_am_on_the_Agoda_homepage() throws Throwable {

    }

    @When("^I will click 'Giris Yapin' link$")
    public void ı_will_click_Giris_Yapin_link() throws Throwable {

    }

    @Then("^I should see Login pop -up$")
    public void ı_should_see_Login_pop_up() throws Throwable {

    }

    @Then("^I will fill 'E-posta'$")
    public void ı_will_fill_E_posta() throws Throwable {

    }

    @Then("^I will fill 'Sifre'$")
    public void ı_will_fill_Sifre() throws Throwable {

    }

    @Then("^I will click 'Giris Yapin' button$")
    public void ı_will_click_Giris_Yapin_button() throws Throwable {

    }

    @Then("^I should see Agoda homepage$")
    public void ı_should_see_Agoda_homepage() throws Throwable {

    }

    @Given("^I must be logged in Agoda website$")
    public void ı_must_be_logged_in_Agoda_website() throws Throwable {

    }

    @When("^I will click 'Fiyat Goruntuleme'$")
    public void ı_will_click_Fiyat_Goruntuleme() throws Throwable {

    }

    @Then("^I should see 'Fiyat Goruntuleme' pop-up$")
    public void ı_should_see_Fiyat_Goruntuleme_pop_up() throws Throwable {

    }

    @Then("^I will click 'Avro'$")
    public void ı_will_click_Avro() throws Throwable {

    }

    @Then("^I should see Agoda$")
    public void ı_should_see_Agoda() throws Throwable {

    }

    @Then("^I will fill first search-box 'Paris'$")
    public void ı_will_fill_first_search_box_Paris() throws Throwable {

    }

    @Then("^I will fill second search-box '(\\d+)\\.(\\d+)\\.(\\d+)'$")
    public void ı_will_fill_second_search_box(int arg1, int arg2, int arg3) throws Throwable {

    }

    @Then("^I will fill third search-box '(\\d+)\\.(\\d+)\\.(\\d+)'$")
    public void ı_will_fill_third_search_box(int arg1, int arg2, int arg3) throws Throwable {

    }

    @Then("^I should see pop-up menu$")
    public void ı_should_see_pop_up_menu() throws Throwable {

    }

    @Then("^I will choose (\\d+) adults$")
    public void ı_will_choose_adults(int arg1) throws Throwable {

    }

    @Then("^I will choose (\\d+) child$")
    public void ı_will_choose_child(int arg1) throws Throwable {

    }

    @Then("^I will choose child age (\\d+)$")
    public void ı_will_choose_child_age(int arg1) throws Throwable {

    }

    @Then("^I will click 'Aile odasi tercih ediyorum'$")
    public void ı_will_click_Aile_odasi_tercih_ediyorum() throws Throwable {

    }

    @Then("^I will click 'Ara' button$")
    public void ı_will_click_Ara_button() throws Throwable {

    }

    @Then("^I should see the products are listed$")
    public void ı_should_see_the_products_are_listed() throws Throwable {

    }




}
