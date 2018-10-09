package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sign-in-btn")
    private WebElement signin_button;

    @FindBy(xpath = "//*[@class='SignInPanel']")
    private WebElement signin_panel;

    @FindBy(id = "signin-email-input")
    private WebElement login_email_input_area;

    @FindBy(id = "signin-password-input")
    private WebElement login_password_input_area;

    @FindBy(id = "sign-in-submit-button")
    private WebElement signin_submit_button;

    @FindBy(xpath = "//*[contains(@class,'header-dropdown__user-icon bg-user-icon')]")
    private WebElement login_validation_class;

    @FindBy(xpath = "//button[@class='btn Searchbox__searchButton Searchbox__searchButton--active']")
    private WebElement search_button;

    @FindBy(xpath = "//*[@id='SearchBoxContainer']/div[1]/div/div[1]/div/div/input")
    private WebElement location_input_area;

    @FindBy(xpath = "//*[@class='Suggestion Suggestion__categoryName'][1]")
    private WebElement first_location_choose;

    @FindBy(xpath = "//*[@class=\"SearchBoxTextDescription__title\" and @data-selenium='checkInText']")
    private WebElement date_input_button;

    @FindBy(xpath = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next  ficon ficon-18 ficon-edge-arrow-right']")
    private WebElement next_month_button;

    @FindBy(xpath = "//*[contains (text(),'Nisan 2019')]")
    private WebElement date_validate_text;

    @FindBy(xpath = "//*[@id='SearchBoxContainer']/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[3]/div[6]/span")
    private WebElement fist_date_select_after_validation;

    @FindBy(xpath = "//*[@id='SearchBoxContainer']/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[4]/div[2]/span")
    private WebElement second_date_select_after_validation;

    @FindBy(xpath = "//*[@class='Popup Occupancy']")
    private WebElement room_popup_validation;

    @FindBy(xpath = "//*[@class='ChildAges']")
    private WebElement child_ages_popup_validation;

    @FindBy(xpath = "//*[@data-selenium='occupancyChildren']//*[@class='PlusMinusRow__plus']")
    private WebElement child_count_up_button;

    @FindBy(xpath = "//*[@data-selenium='desktop-occ-children-value' and text()='1']")
    private WebElement child_count_validation;

    @FindBy(xpath = "//*[@id='SearchBoxContainer']/div[1]/div/div[5]/div/div/div/div[4]/ul/li/div/select")
    private WebElement child_ages_popup_open_button;

    @FindBy(xpath = "//*[@id='SearchBoxContainer']/div[1]/div/div[5]/div/div/div/div[4]/ul/li/div/select/option[4]")
    private WebElement child_age_select_button;

    @FindBy(xpath = "//*[@class='CheckboxContainer-Checkbox Medium']")
    private WebElement family_room_check_box;


    public boolean validateSignInButton(){
        return signin_button.isDisplayed();
    }

    public void clickSignInButton(){
        signin_button.click();
    }

    public boolean validateSignInPanel(){
        return signin_panel.isDisplayed();
    }

    public void clickAndClearLoginEmailInputArea(){
        login_email_input_area.clear();
        login_email_input_area.click();
    }

    public void sendKeysToLoginEmailInputArea(String email){
        login_email_input_area.sendKeys(email);
    }

    public void clickAndClearLoginPasswordInputArea(){
        login_password_input_area.clear();
        login_password_input_area.click();
    }

    public void sendKeysToLoginPasswordInputArea(String email){
        login_password_input_area.sendKeys(email);
    }

    public void clickSignInSubmitButton(){
        signin_submit_button.click();
    }

    public boolean validateLoginValidationClass(){
        return login_validation_class.isDisplayed();
    }

    public void clickSearchButton(){
        search_button.click();
    }

    public boolean validateLocationInputArea(){
        return location_input_area.isDisplayed();
    }

    public void clickAndClearLocationInputArea(){
        location_input_area.clear();
        location_input_area.click();
    }

    public void sendKeysToLocationInputArea(String searchLocation){
        location_input_area.sendKeys(searchLocation);
    }

    public boolean validateFirstLocation(){
        return first_location_choose.isDisplayed();
    }

    public void selectFirstLocation(){
        first_location_choose.click();
    }

    public boolean validateNextMonthButton(){
        return next_month_button.isDisplayed();
    }

    public void clickNextMonthButtonSixTimes(){
        next_month_button.click();
        next_month_button.click();
        next_month_button.click();
        next_month_button.click();
        next_month_button.click();
        next_month_button.click();
    }

    public boolean validateSelectedMonthIsDisplayed(){
        return date_validate_text.isDisplayed();
    }

    public void selectFirstDateAfterValidation(){
        fist_date_select_after_validation.click();
    }

    public void selectSecondDateAfterValidation(){
        second_date_select_after_validation.click();
    }

    public boolean validateRoomPopup(){
        return room_popup_validation.isDisplayed();
    }

    public boolean validateChildAgesPopup(){
        return child_ages_popup_validation.isDisplayed();
    }

    public void clickChildAgeCountUpButton(){
        child_count_up_button.click();
    }

    public boolean validateChildCount(){
        return child_count_validation.isDisplayed();
    }

    public void clickChildAgesPopupOpenButton(){
        child_ages_popup_open_button.click();
    }

    public void selectChildAgeSelectButton(){
        child_age_select_button.click();
    }

    public void checkFamilyRoomCheckbox(){
        family_room_check_box.click();
    }

    public void clickSearchButtonForResults(){
        search_button.click();
    }
}
