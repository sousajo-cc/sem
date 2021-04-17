package com.napier.sem;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * The type Country dao impl test.
 */
class CapitalCitiesDAOImplTest {
    /**
     * The Country.
     */
    private CapitalCitiesDAO capitalCity;
    /**
     * The Country list ret.
     */
    private List<CapitalCities> capitalCitiesListRet;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        capitalCity = mock(CapitalCitiesDAOImpl.class);
        CapitalCities capitalCitiesMockedReturn = new CapitalCities("UMI",
                "United States Minor Outlying Islands",
                2
        );
        capitalCitiesListRet = new ArrayList<>();
        capitalCitiesListRet.add(capitalCitiesMockedReturn);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * Get all countries pop from largest to smallest test.
     */
    @Test
    public void getAllCapitalCitiesLargestToSmallestWorldTest(){
        Mockito.when(capitalCity.getAllCapitalCitiesLargestToSmallestWorld())
                .thenReturn(capitalCitiesListRet);
        List<CapitalCities> ret = capitalCity.getAllCapitalCitiesLargestToSmallestWorld();
        assertEquals(ret, capitalCitiesListRet);
    }

    @Test
    public void getAllCapitalCitiesFromLargestToSmallestInContinentTest(){
        Continent c = new Continent("europe");

        Mockito.when(capitalCity.getAllCapitalCitiesLargestToSmallestContinent(c))
                .thenReturn(capitalCitiesListRet);
        List<CapitalCities> ret = capitalCity.getAllCapitalCitiesLargestToSmallestContinent(c);
        assertEquals(ret, capitalCitiesListRet);
    }

    @Test
    public void getAllCapitalCitiesFromLargestToSmallestInRegionTest(){
        Region r = new Region("northamerica");

        Mockito.when(capitalCity.getAllCapitalCitiesLargestToSmallestRegion(r))
                .thenReturn(capitalCitiesListRet);
        List<CapitalCities> ret = capitalCity.getAllCapitalCitiesLargestToSmallestRegion(r);
        assertEquals(ret, capitalCitiesListRet);
    }

    @Test
    public void getTopNCapitalCitiesFromLargestToSmallestTest(){
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(capitalCity.getTopNCapitalCitiesLargestToSmallest(topN))
                .thenReturn(capitalCitiesListRet);
        List<CapitalCities> ret = capitalCity.getTopNCapitalCitiesLargestToSmallest(topN);
        assertEquals(ret, capitalCitiesListRet);
    }

    @Test
    public void getLargestToSmallestPartialContinentTest(){
        Continent c = new Continent("europe");
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(capitalCity.getTopNCapitalCitiesLargestToSmallestContinent(c, topN))
                .thenReturn(capitalCitiesListRet);
        List<CapitalCities> ret = capitalCity.getTopNCapitalCitiesLargestToSmallestContinent(c, topN);
        assertEquals(ret, capitalCitiesListRet);
    }

    @Test
    public void getLargestToSmallestPartialRegionTest(){
        Region r = new Region("northamerica");
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(capitalCity.getTopNCapitalCitiesLargestToSmallestRegion(r, topN))
                .thenReturn(capitalCitiesListRet);
        List<CapitalCities> ret = capitalCity.getTopNCapitalCitiesLargestToSmallestRegion(r, topN);
        assertEquals(ret, capitalCitiesListRet);
    }
}
