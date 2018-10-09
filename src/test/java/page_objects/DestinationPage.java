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
}
