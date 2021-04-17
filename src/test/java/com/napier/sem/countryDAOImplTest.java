package com.napier.sem;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Country dao impl test.
 */
class countryDAOImplTest {
    /**
     * The Country.
     */
    private CountryDAO country;
    /**
     * The Country list ret.
     */
    private List<Country> countryListRet;
    private List<Country> countryContListRet;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        country = Mockito.mock(CountryDAO.class);
        Country countryMockedReturn = new Country("UMI",
                "United States Minor Outlying Islands",
                "Oceania",
                "Micronesia/Caribbean",
                16.0,
                0,
                0,
                0.0,
                0.0,
                0.0,
                "United States Minor Outlying Islands",
                "Dependent Territory of the US",
                "George W. Bush",
                0,
                "UM"
        );
        countryListRet = new ArrayList<>();
        countryListRet.add(countryMockedReturn);

        Country countryContinentMockedReturn = new Country("IRL",
                "Ireland",
                "",
                "",
                16.0,
                0,
                0,
                0.0,
                0.0,
                0.0,
                "",
                "",
                "",
                0,
                ""
        );
        countryContListRet = new ArrayList<>();
        countryContListRet.add(countryContinentMockedReturn);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * Get all countries pop from largest to smallest test.
     */
    @Test
    public void getAllCountriesPopFromLargestToSmallestTest(){
        Mockito.when(country.getAllCountriesPopFromLargestToSmallest())
                .thenReturn(countryListRet);
        List<Country> ret = country.getAllCountriesPopFromLargestToSmallest();
        assertEquals(ret, countryListRet);
    }

    @Test
    public void getAllCountriesPopFromLargestToSmallestInContinentTest(){
        Continent c = new Continent("europe");

        Mockito.when(country.getAllCountriesPopFromLargestToSmallestInContinent(c))
                .thenReturn(countryListRet);
        List<Country> ret = country.getAllCountriesPopFromLargestToSmallestInContinent(c);
        assertEquals(ret, countryListRet);
    }

    @Test
    public void getAllCountriesPopFromLargestToSmallestInRegionTest(){
        Region r = new Region("northamerica");

        Mockito.when(country.getAllCountriesPopFromLargestToSmallestInRegion(r))
                .thenReturn(countryListRet);
        List<Country> ret = country.getAllCountriesPopFromLargestToSmallestInRegion(r);
        assertEquals(ret, countryListRet);
    }

    @Test
    public void getTopNCountriesPopFromLargestToSmallestTest(){
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(country.getTopNCountriesPopFromLargestToSmallest(topN))
                .thenReturn(countryListRet);
        List<Country> ret = country.getTopNCountriesPopFromLargestToSmallest(topN);
        assertEquals(ret, countryListRet);
    }

    @Test
    public void getLargestToSmallestPartialContinentTest(){
        Continent c = new Continent("europe");
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(country.getTopNCountriesPopFromLargestToSmallestContinent(c, topN))
                .thenReturn(countryListRet);
        List<Country> ret = country.getTopNCountriesPopFromLargestToSmallestContinent(c, topN);
        assertEquals(ret, countryListRet);
    }

    @Test
    public void getLargestToSmallestPartialRegionCountryTest(){
        Region r = new Region("northamerica");
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(country.getTopNCountriesPopFromLargestToSmallestContinent(r, topN))
                .thenReturn(countryListRet);
        List<Country> ret = country.getTopNCountriesPopFromLargestToSmallestContinent(r, topN);
        assertEquals(ret, countryListRet);
    }
}
