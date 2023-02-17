package gov.uk.check.visa.testbase;

import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * Created by Bhavesh
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    @Parameters("browser")
    public void setUp() throws InterruptedException{
        selectBrowser(browser);
        new Utility().clickOnAcceptCookies();
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
