package com.napier.sem;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class cityReportTest {
    private CityDAOImpl city;
    private List<City> cityListRet;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        city = mock(CityDAOImpl.class);
        City cityMockedReturn = new City("Porto", "", "", 0);
        cityListRet = new ArrayList<>();
        cityListRet.add(cityMockedReturn);
    }


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
