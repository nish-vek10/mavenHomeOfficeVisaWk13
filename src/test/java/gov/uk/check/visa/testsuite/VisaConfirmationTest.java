package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    //Create objects
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }

    @Test (groups = {"smoke", "sanity", "regression"})
    //Verify if someone coming from Australia needs a visa for UK
    void anAustralianComingToUKForTourism() {
        startPage.clickStartNow(); //Click on Start Now
        selectNationalityPage.selectNationality("Australia"); //Select from dropdown
        selectNationalityPage.clickNextStepButton(); //Click on Continue
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clickNextStepButton(); //Click on Continue
        resultPage.confirmResultMessage("You will not need a visa to come to the UK"); //Compare and Verify
    }

    @Test (groups = "regression")
    //Verify if someone coming from Chile to work for more than 6 months needs a visa for UK
    void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.clickStartNow(); //Click on Start Now
        selectNationalityPage.selectNationality("Chile"); //Select from dropdown
        selectNationalityPage.clickNextStepButton(); //Click on Continue
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        reasonForTravelPage.clickNextStepButton(); //Click on Continue
        durationOfStayPage.selectLengthOfStay("more"); //Select longer than 6 months
        durationOfStayPage.clickNextStepButton(); //Click on Continue
        workTypePage.selectJobType("Health and care professional"); //Select job
        workTypePage.clickNextStepButton(); //Click on Continue
        resultPage.confirmResultMessage("You need a visa to work in health and care"); //Compare and Verify

    }

    @Test (groups = {"sanity", "regression"})
    //Verify if someone coming from Colombia to join a partner needs a visa for UK
    void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        startPage.clickStartNow(); //Click on Start Now
        selectNationalityPage.selectNationality("Colombia"); //Select from dropdown
        selectNationalityPage.clickNextStepButton(); //Click on Continue
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickNextStepButton(); //Click on Continue
        resultPage.confirmResultMessage("You may need a visa"); //Compare and Verify
    }
}
