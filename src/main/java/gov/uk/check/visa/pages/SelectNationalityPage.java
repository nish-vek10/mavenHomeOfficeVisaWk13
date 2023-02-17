package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    //Locators for each element
    @CacheLookup
    @FindBy(id = "response")
    WebElement chooseNationality;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    //Select Nationality from Dropdown Menu
    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(chooseNationality,nationality); //call method from Utility class
    }

    //Click on Continue
    public void clickNextStepButton() {
        clickOnElement(continueButton); //call method from Utility class
        log.info("Clicking on continue button: " + continueButton.toString()); //log action
    }
}