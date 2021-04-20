package com.napier.sem;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * The type Capital cities report test.
 */
public class CapitalCitiesReportTest {
    private CapitalCitiesDAOImpl capitalCity;
    private List<Country> countryListRet;
    private List<CapitalCities> capitalCitiesListRet;

    /**
     * Sets up.
     */
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


    /**
     * Largest to smallest test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestTest() throws Exception {
        Mockito.when(capitalCity.getAllCapitalCitiesLargestToSmallestWorld())
                .thenReturn(capitalCitiesListRet);
        CapitalCitiesReport capitalCitiesReport = new CapitalCitiesReport(capitalCity);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        capitalCitiesReport.generateReport();
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("United States Minor Outlying Islands"));
    }

    /**
     * Largest to smallest in continent test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestInContinentTest() throws Exception {
        Continent c = new Continent("europe");
        Mockito.when(capitalCity.getAllCapitalCitiesLargestToSmallestContinent(c))
                .thenReturn(capitalCitiesListRet);
        CapitalCitiesReport capitalCitiesReport = new CapitalCitiesReport(capitalCity);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        capitalCitiesReport.generateReport(c);
        buf.flush();
        String allWrittenLines = buf.toString();
        assertTrue(allWrittenLines.contains("United States Minor Outlying Islands"));
    }

    /**
     * Largest to smallest in region test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestInRegionTest() throws Exception {
        Region r = new Region("northamerica");

        Mockito.when(capitalCity.getAllCapitalCitiesLargestToSmallestRegion(r))
                .thenReturn(capitalCitiesListRet);
        CapitalCitiesReport capitalCitiesReport = new CapitalCitiesReport(capitalCity);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        capitalCitiesReport.generateReport(r);
        buf.flush();
        String allWrittenLines = buf.toString();
        assertTrue(allWrittenLines.contains("United States Minor Outlying Islands"));
    }

    /**
     * Largest to smallest in region partial test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestInRegionPartialTest() throws Exception {
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(capitalCity.getTopNCapitalCitiesLargestToSmallest(topN))
                .thenReturn(capitalCitiesListRet);
        CapitalCitiesReport capitalCitiesReport = new CapitalCitiesReport(capitalCity);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        capitalCitiesReport.generateReport(topN);
        buf.flush();
        String allWrittenLines = buf.toString();
        assertTrue(allWrittenLines.contains("United States Minor Outlying Islands"));
    }

    /**
     * Largest to smallest partial continent test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestPartialContinentTest() throws Exception {
        Continent c = new Continent("europe");
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(capitalCity.getTopNCapitalCitiesLargestToSmallestContinent(c, topN))
                .thenReturn(capitalCitiesListRet);
        CapitalCitiesReport capitalCitiesReport = new CapitalCitiesReport(capitalCity);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        capitalCitiesReport.generateReport(c, topN);
        buf.flush();
        String allWrittenLines = buf.toString();
        assertTrue(allWrittenLines.contains("United States Minor Outlying Islands"));
    }

    /**
     * Largest to smallest partial region test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestPartialRegionTest() throws Exception {
        Region r = new Region("northamerica");
        numberOfCountries topN = new numberOfCountries(1);

        Mockito.when(capitalCity.getTopNCapitalCitiesLargestToSmallestRegion(r, topN))
                .thenReturn(capitalCitiesListRet);
        CapitalCitiesReport capitalCitiesReport = new CapitalCitiesReport(capitalCity);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        capitalCitiesReport.generateReport(r, topN);
        buf.flush();
        String allWrittenLines = buf.toString();
        assertTrue(allWrittenLines.contains("United States Minor Outlying Islands"));
    }
}

