package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//input[@autocorrect='off']")
    public WebElement destination;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
        public WebElement checkInClick;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkout']")
    public WebElement checkOutClick;
    @FindBy(xpath = "//span[@class='inline-flex leading-none -rotate-90 transform transform']")
    public WebElement propertyType;

    @FindBy(xpath = "//li[@data-testid='accommodation-type-filter-entire house / apartment']")
    public WebElement entireHouseCheckbox;
     @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement applyButton;


   @FindBy(xpath = "//span[text()='Montréal']")
        public WebElement montreal;

    @FindBy(id = "input-auto-complete")
    public WebElement InputBanf;

    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
    public WebElement inputCheckIn;

    @FindBy(xpath = "//label[@data-testid=\"tonight-index-label\"]")
    public WebElement InpurData;

    @FindBy(xpath = "//span[@data-testid='search-form-guest-selector-value']\n")
    public WebElement clickApply;

    @FindBy(xpath = "//button[@type='button' and @class='SearchButtonWithLoader_button___1Bps' and @data-testid='search-button-with-loader']\n")
    public WebElement SearchButton;
    @FindBy(xpath = "//button[@type='button' and @class='absolute right-0 m-4 z-5' and @data-testid='calendar-button-close']\n")
    public WebElement clickX;
    @FindBy(xpath = "//span[@title='Banff Park Lodge'] ")

    public static WebElement Hotels;


}
