package com.napier.sem;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class CountryReportTest {
    private CountryDAOImpl country;
    private List<Country> countryListRet;
    private List<Country> countryContListRet;

@org.junit.jupiter.api.BeforeEach
    void setUp() {
        country = mock(CountryDAOImpl.class);
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
    }


    @Test
    public void largestToSmallestTest() throws Exception {
        Mockito.when(country.getAllCountriesPopFromLargestToSmallest())
                .thenReturn(countryListRet);
        CountryReport countryReport = new CountryReport(country);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        countryReport.generateReport();
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("Micronesia/Caribbean"));
    }

    @Test
    public void largestToSmallestInContinentTest() throws Exception {
        Continent c = new Continent("europe");
        Mockito.when(country.getAllCountriesPopFromLargestToSmallestInContinent(c))
                .thenReturn(countryListRet);
        CountryReport countryReport = new CountryReport(country);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        countryReport.generateReport(c);
        buf.flush();
        String allWrittenLines = buf.toString();
        assertTrue(allWrittenLines.contains("Micronesia/Caribbean"));
    }

    @Test
    public void largestToSmallestInRegionTest() throws Exception {
        Region r = new Region("northamerica");

        Mockito.when(country.getAllCountriesPopFromLargestToSmallestInRegion(r))
                .thenReturn(countryListRet);
        CountryReport countryReport = new CountryReport(country);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        countryReport.generateReport(r);
        buf.flush();
        String allWrittenLines = buf.toString();
        assertTrue(allWrittenLines.contains("Micronesia/Caribbean"));
    }

}

