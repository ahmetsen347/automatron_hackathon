package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DestinationPage extends BasePage{

    public DestinationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Şu kriterlere göre filtrele:']")
    private WebElement validate_destination_page;

    @FindBy(xpath = "//*[@class='currency-trigger__text']")
    private WebElement currency_list_open_button;

    @FindBy(xpath ="//*[@class='header-menu_subgroup-container header-menusubgroup-container--lc-panel    header-menu_subgroup-container--currency']")
    private WebElement currency_popup_open_validation;

    @FindBy(xpath = "//*[@class='header-menu_item--last-row currency_text' and text()='€']'")
    private WebElement currency_select_euro;

    @FindBy(xpath = "//*[@class='currency-trigger__text' and text()='€']")
    private WebElement validate_currency_selected_euro;

    @FindBy(id = "price_box_1")
    private WebElement highest_price_input_area; // (166 set edilecek) db den al enter a tıkla

    @FindBy(xpath = "//*[@class='filter-tag-item__title' and text()='Fiyat (gecelik)']")
    private WebElement price_filter_added_validation;

    @FindBy(xpath = "//*[@class='filter-item-content' and text()='Aile/çocuklar için uygun']")
    private WebElement family_friendly_button;

    @FindBy(xpath = "//*[@class='filter-tag-item__title' and text()='Tesis olanakları']")
    private WebElement family_frendly_filter_added_validation;

    @FindBy(xpath = "//*[@class='filter-item-content' and text()='Kusursuz']")
    private WebElement guest_raitings_filter_perfect_button;

    @FindBy(xpath = "//*[@class='filter-tag-item__title' and text()='Konuk değerlendirmesi']")
    private WebElement guest_raitings_filter_added_validation;

    @FindBy(xpath = "//*[@class='filter-item-content' and text()='Ücretsiz iptal']")
    private WebElement free_cancellation_button;

    @FindBy(xpath = "//*[@class='filter-tag-item__title' and text()='Ödeme seçenekleri']")
    private WebElement free_cancellation_button_added_validation;

    @FindBy(xpath = "//*[@class='filter-btn more-less-btn' and @data-value='facilitiesFilterList']")
    private WebElement facilities_list_open_button;

    @FindBy(xpath = "//*[@class='filter-item-content' and text()='Sigara içilmeyen odalar']")
    private WebElement facilities_filter_open;

    @FindBy(xpath = "//*[@class='filter-item-content' and text()='Sigara içilmeyen odalar']")
    private WebElement non_smoking_rooms_button;

    @FindBy(xpath = "//*[@class='filter-item-content' and text()='Otel']")
    private WebElement accommodation_type_button_otel;

    @FindBy(xpath = "//*[@class='filter-tag-item__title' and text()='Konaklama tipi']")
    private WebElement accommodation_type_filter_added_validation;

    @FindBy(xpath = "//*[contains(@id,'hotel') and @data-element-index='0']/div/div/section/div[3]/ul/li[1]/h3")
    private WebElement filter_result_first_hotel_button;

    public boolean validateDestinationPage(){
        return validate_destination_page.isDisplayed();
    }

    public void clickCurrencyListOpenButton(){
        currency_list_open_button.click();
    }

    public boolean validateCurrencyPopupOpen(){
        return currency_popup_open_validation.isDisplayed();
    }

    public void selectCurrencyEuro(){
        currency_select_euro.click();
    }

    public boolean validateCurrencySelectedEuro(){
        return validate_currency_selected_euro.isDisplayed();
    }

    public void clickAndClearHighestPriceInputArea(){
        highest_price_input_area.click();
        highest_price_input_area.clear();
    }

    public void sendKeysToHighestPriceInputArea(String price){
        highest_price_input_area.sendKeys(price);
    }

    public boolean validatePriceFilterAdded(){
        return price_filter_added_validation.isDisplayed();
    }

    public void checkFamilyFriendlyCheckbox(){
        family_friendly_button.click();
    }

    public boolean validateFamilyFriendlyAdded(){
        return family_frendly_filter_added_validation.isDisplayed();
    }

    public void checkGuestRaitingsFilterPerfectRadioButton(){
        guest_raitings_filter_perfect_button.click();
    }

    public boolean validateGuestRaitingsFilterAdded(){
        return guest_raitings_filter_added_validation.isDisplayed();
    }

    public void clickFreeCancellationButton(){
        free_cancellation_button.click();
    }

    public boolean validateFreeCancellationButtonAddedValidation(){
        return free_cancellation_button_added_validation.isDisplayed();
    }

    public void clickFacilitiesListOpenButton(){
        facilities_list_open_button.click();
    }

    public void clickFacilitiesFilterOpen(){
        facilities_filter_open.click();
    }

    public void selectNonSmokingRooms(){
        non_smoking_rooms_button.click();
    }

    public void clickAccommodationTypeButtonOtel(){
        accommodation_type_button_otel.click();
    }

    public boolean validateAccommodationTypeFilterAddedValidation(){
        return accommodation_type_filter_added_validation.isDisplayed();
    }

    public void clickFilterResultFirstHotelButton(){
        filter_result_first_hotel_button.click();
    }
}
