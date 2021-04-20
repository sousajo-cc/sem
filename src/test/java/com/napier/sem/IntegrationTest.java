package com.napier.sem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Integration test.
 */
public class IntegrationTest {

    /**
     * Init.
     */
    @BeforeAll
    static void init()
    {
    }

    /**
     * Integration test run.
     */
    @Test
    void IntegrationTestRun()
    {
        CountryDAO countryDao = new CountryDAOImpl();
        List<Country> countries = countryDao.getAllCountriesPopFromLargestToSmallest();
        assertEquals(countries.get(0).getContinent().toLowerCase(), "asia");
    }
}
