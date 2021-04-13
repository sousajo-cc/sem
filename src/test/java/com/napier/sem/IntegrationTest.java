package com.napier.sem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {

    @BeforeAll
    static void init()
    {
    }

    @Test
    void IntegrationTestRun()
    {
        CountryDAO countryDao = new CountryDAOImpl();
        List<Country> countries = countryDao.getAllCountriesPopFromLargestToSmallest();
        assertEquals(countries.get(0).getContinent().toLowerCase(), "asia");
    }
}
