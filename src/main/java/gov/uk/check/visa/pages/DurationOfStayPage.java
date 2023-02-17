package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    //Locators for each element
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "less":
                clickOnElement(lessThanSixMonths); //Select 6 or less
                break;
            case "more":
                clickOnElement(moreThanSixMonths); //Select 6+
                break;
        }
    }

    //Click on Continue
    public void clickNextStepButton() {
        clickOnElement(continueButton); //call method from Utility class
        log.info("Clicking on continue button: " + continueButton.toString()); //log action
    }
}
