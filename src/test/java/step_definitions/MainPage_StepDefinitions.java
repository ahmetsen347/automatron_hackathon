package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_helpers.XmlHelper;
import data_objects.LoginData;
import data_objects.RezervationData;
import data_objects.RootData;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page_objects.MainPage;
import selenium_helpers.ScreenshotHelper;
import selenium_helpers.SeleniumDriver;

import java.util.List;

public class MainPage_StepDefinitions {
    private final static Logger executionLogger = Logger.getLogger("executionLogger");
    WebDriver driver = SeleniumDriver.baseDriver;
    MainPage mainPage = new MainPage(driver);
    RootData rootData = XmlHelper.getRootDataFromXml();
    String loginEmail;
    String loginPassword;
    String city;
    String startDate;
    String finishDate;

    private void getRequiredData(){
        List<LoginData> loginDataList = rootData.getLoginDataList();
        List<RezervationData> rezervationDataList = rootData.getRezervationDataList();
        for (LoginData loginData : loginDataList){
            loginEmail = loginData.getEmail();
            loginPassword = loginData.getPassword();
        }
        for (RezervationData rezervationData : rezervationDataList){
            city = rezervationData.getCity();
            startDate = rezervationData.getStartDate();
            finishDate = rezervationData.getFinishDate();
        }
    }

    // Login to Agoda with e-mail
    @Given("^I am on the Agoda homepage$")
    public void i_am_on_the_Agoda_homepage() throws Throwable {
        executionLogger.info("Started Scenario Login to Agoda with e-mail");
        getRequiredData();
        Assert.assertEquals(true, mainPage.validateSignInButton());
        ScreenshotHelper.takeScreenshot(driver,"I am on the Agoda homepage", true);
    }

    @When("^I will click 'Giris Yapin' link$")
    public void i_will_click_Giris_Yapin_link() throws Throwable {
        mainPage.clickSignInButton();
    }

    @Then("^I should see Login pop -up$")
    public void i_should_see_Login_pop_up() throws Throwable {
        Assert.assertEquals(true, mainPage.validateSignInPanel());
        ScreenshotHelper.takeScreenshot(driver,"I should see Login pop -up", true);
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
        ScreenshotHelper.takeScreenshot(driver,"I should see Agoda homepage", true);
        executionLogger.info("Scenario Login to Agoda Finished");
    }

    //Paris Otel First Search
    @Given("^I must be logged in Agoda website$")
    public void ı_must_be_logged_in_Agoda_website() throws Throwable {
        Assert.assertEquals(true, mainPage.validateLoginValidationClass());
    }

    @And("^I will fill first search-box with city$")
    public void iWillFillFirstSearchBoxWithCity() throws Throwable {
        Assert.assertEquals(true, mainPage.validateLocationInputArea());
        mainPage.clickAndClearLocationInputArea();
        mainPage.sendKeysToLocationInputArea("Paris");
        Assert.assertEquals(true, mainPage.validateFirstLocation());
        mainPage.selectFirstLocation();
    }

    @And("^I will fill second datepicker with startDate$")
    public void iWillFillSecondDatepickerWithStartDate() throws Throwable {
        Assert.assertNotEquals(true, mainPage.validateNextMonthButton());
        mainPage.clickNextMonthButtonSixTimes();
        //Assert.assertNotEquals(true, mainPage.validateSelectedMonthIsDisplayed());
        mainPage.selectFirstDateAfterValidation();
    }

    @And("^I will fill third datepicker with finishDate$")
    public void iWillFillThirdDatepickerWithFinishDate() throws Throwable {
        mainPage.selectSecondDateAfterValidation();
    }

    @Then("^I should see attendee pop-up menu$")
    public void iShouldSeeAttendeePopUpMenu() throws Throwable {
        Assert.assertEquals(true, mainPage.validateRoomPopup());
    }

    @Then("^I will choose (\\d+) child$")
    public void ı_will_choose_child(int arg1) throws Throwable {
        Assert.assertEquals(true, mainPage.validateChildAgesPopup());
        mainPage.clickChildAgeCountUpButton();
    }

    @Then("^I will choose child age (\\d+)$")
    public void ı_will_choose_child_age(int arg1) throws Throwable {
        Assert.assertEquals(true, mainPage.validateChildCount());
        mainPage.clickChildAgesPopupOpenButton();
        mainPage.selectChildAgeSelectButton();
    }

    @Then("^I will click 'Aile odasi tercih ediyorum'$")
    public void ı_will_click_Aile_odasi_tercih_ediyorum() throws Throwable {
        mainPage.checkFamilyRoomCheckbox();
    }

    @Then("^I will click 'Ara' button$")
    public void ı_will_click_Ara_button() throws Throwable {
        mainPage.clickSearchButton();
    }

    @Then("^I should see the products are listed$")
    public void ı_should_see_the_products_are_listed() throws Throwable {
        mainPage.clickSearchButtonForResults();
    }
}
