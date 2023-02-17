package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    //Locators for each element
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yesLocator;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement noLocator;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "Yes":
                clickOnElement(yesLocator); //Select Yes as the status
                break;
            case "No":
                clickOnElement(noLocator); //Select No as the status
                break;
        }
    }

    //Click on Continue
    public void clickNextStepButton() {
        clickOnElement(continueButton); //call method from Utility class
        log.info("Clicking on continue button: " + continueButton.toString()); //log action
    }
}