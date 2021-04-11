package com.napier.sem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IntegrationTest {

    @BeforeAll
    static void init()
    {
    }

    @Test
    void testGetTopNCountries()
    {
        for(App.reportTypes t : App.reportTypes.values()){
            numberOfCountries n = new numberOfCountries(1);
            t.createReportFor(n);
        }
    }
}
