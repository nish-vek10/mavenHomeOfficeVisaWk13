package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "SearchDataSet")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
/*1*/              {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent",
                    "Permanent Tester jobs in Harrow on the Hill"},
///*2*/              {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent",
//                    "Tester jobs in Harrow on the Hill"},
///*3*/              {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent",
//                    "Tester jobs in Harrow on the Hill"},
///*4*/              {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent",
//                    "Tester jobs in Harrow on the Hill"},
///*5*/              {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent",
//                    "Tester jobs in Harrow on the Hill"},
///*6*/              {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent",
//                    "Tester jobs in Harrow on the Hill"},
///*7*/              {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent",
//                    "Tester jobs in Harrow on the Hill"}
        };
        return data;
    }
}
