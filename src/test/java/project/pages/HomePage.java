package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@class='SearchButtonWithLoader_button___1Bps']")
    public WebElement searchButton;




}