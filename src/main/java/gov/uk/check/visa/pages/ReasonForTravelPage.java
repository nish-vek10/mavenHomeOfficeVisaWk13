package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    //Locators for each element
    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    //Select Job Type
    public void selectReasonForVisit(String reason) {
        for (WebElement visit : reasonForVisitList) {
            if (visit.getText().equalsIgnoreCase(reason)) {
                clickOnElement(visit);
                break;
            }
        }
    }

    //Click on Continue
    public void clickNextStepButton() {
        clickOnElement(continueButton); //call method from Utility class
        log.info("Clicking on continue button: " + continueButton.toString()); //log action
    }
}
