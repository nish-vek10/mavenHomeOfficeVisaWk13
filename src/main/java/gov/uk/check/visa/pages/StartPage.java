package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    //Locators for each element
    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNow;

    //Click on "Start Now"
    public void clickStartNow() {
        clickOnElement(startNow); //call method from Utility class
        log.info("Clicking on start now: " + startNow.toString()); //log action
    }
}
