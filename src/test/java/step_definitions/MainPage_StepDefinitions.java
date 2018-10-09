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
}
