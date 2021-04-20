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
 * The type City report test.
 */
public class cityReportTest {
    private CityDAOImpl city;
    private List<City> cityListRet;

    /**
     * Sets up.
     */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        city = mock(CityDAOImpl.class);
        City cityMockedReturn = new City("Porto", "", "", 0);
        cityListRet = new ArrayList<>();
        cityListRet.add(cityMockedReturn);
    }


    /**
     * Largest to smallest test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestTest() throws Exception {
        Mockito.when(city.getAllCitiesLargestToSmallestWorld())
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport();
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    /**
     * Largest to smallest in continent test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestInContinentTest() throws Exception {
        Continent c = new Continent("europe");
        Mockito.when(city.getAllCitiesLargestToSmallestContinent(c))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(c);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    /**
     * Largest to smallest in region test.
     *
     * @throws Exception the exception
     */
    @Test
    public void largestToSmallestInPartialTest() throws Exception {
        numberOfCountries topN = new numberOfCountries(1);
        Mockito.when(city.getTopNCitiesLargestToSmallest(topN))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(topN);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    @Test
    public void largestToSmallestPartialContinentTest() throws Exception {
        Continent c = new Continent("europe");
        numberOfCountries topN = new numberOfCountries(1);
        Mockito.when(city.getTopNCitiesLargestToSmallestContinent(c,topN))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(c,topN);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    @Test
    public void largestToSmallestPartialRegionTest() throws Exception {
        Region c = new Region("europe");
        numberOfCountries topN = new numberOfCountries(1);
        Mockito.when(city.getTopNCitiesLargestToSmallestRegion(c,topN))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(c,topN);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    @Test
    public void largestToSmallestInCountryTest() throws Exception {
        Ctry country = new Ctry("europe");
        numberOfCountries topN = new numberOfCountries(1);
        Mockito.when(city.getAllCitiesLargestToSmallestCountry(country))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(country);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    @Test
    public void largestToSmallestInCountryPartialTest() throws Exception {
        Ctry country = new Ctry("europe");
        numberOfCountries topN = new numberOfCountries(1);
        Mockito.when(city.getTopNCitiesLargestToSmallestCountry(country, topN))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(country, topN);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    @Test
    public void largestToSmallestInDistrictPartialTest() throws Exception {
        District d = new District("europe");
        numberOfCountries topN = new numberOfCountries(1);
        Mockito.when(city.getTopNCitiesLargestToSmallestDistrict(d, topN))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(d, topN);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    @Test
    public void largestToSmallestInDistrictTest() throws Exception {
        District country = new District("europe");
        numberOfCountries topN = new numberOfCountries(1);
        Mockito.when(city.getAllCitiesLargestToSmallestDistrict(country))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(country);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }

    @Test
    public void largestToSmallestInRegionTest() throws Exception {
        Region c = new Region("europe");
        Mockito.when(city.getAllCitiesLargestToSmallestRegion(c))
                .thenReturn(cityListRet);
        CityReport citiesReport = new CityReport(city);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        citiesReport.generateReport(c);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Porto"));
    }
}
