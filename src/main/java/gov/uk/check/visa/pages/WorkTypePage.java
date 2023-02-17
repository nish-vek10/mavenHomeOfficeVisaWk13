package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    //Locators for each element
    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> selectJobTypeList;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    //Select Job Type
    public void selectJobType(String job) {
        for (WebElement jobOptions : selectJobTypeList) {
            if (jobOptions.getText().equalsIgnoreCase(job)) {
                clickOnElement(jobOptions);
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
