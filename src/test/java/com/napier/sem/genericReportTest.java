package com.napier.sem;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class genericReportTest {
    private genericReportDAOImpl g;
    String mockedReturn = "mockedReturn";


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        g = mock(genericReportDAOImpl.class);
    }


    @Test
    public void populationReportByCountryTest() throws Exception {
        genericReport genericReport = new genericReport(g);
        Mockito.when(g.getPopulationInfoByCountry())
                .thenReturn(mockedReturn);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        genericReport.populationReportByCountry();
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("mockedReturn"));
    }

    @Test
    public void populationReportByContinentTest() throws Exception {
        genericReport genericReport = new genericReport(g);
        Mockito.when(g.getPopulationInfoByContinent())
                .thenReturn(mockedReturn);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        genericReport.populationReportByContinent();
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("mockedReturn"));
    }

    @Test
    public void populationReportByRegionTest() throws Exception {
        genericReport genericReport = new genericReport(g);
        Mockito.when(g.getPopulationInfoByRegion())
                .thenReturn(mockedReturn);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        genericReport.populationReportByRegion();
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("mockedReturn"));
    }

    @Test
    public void populationInRegionTest() throws Exception {
        Region r = new Region("northamerica");
        genericReport genericReport = new genericReport(g);
        Mockito.when(g.getAllPopulationInARegion(r.name))
                .thenReturn(mockedReturn);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        genericReport.generateReport(r);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("mockedReturn"));
    }

    @Test
    public void populationInContinentTest() throws Exception {
        Continent r = new Continent("Europe");
        genericReport genericReport = new genericReport(g);
        Mockito.when(g.getAllPopulationInAContinent(r.name))
                .thenReturn(mockedReturn);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        genericReport.generateReport(r);
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("mockedReturn"));
    }

    @Test
    public void populationTest() throws Exception {
        genericReport genericReport = new genericReport(g);
        Mockito.when(g.getAllPopulation())
                .thenReturn(mockedReturn);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        genericReport.populationReport();
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("mockedReturn"));
    }

    @Test
    public void generateReportTest() throws Exception {
        genericReport genericReport = new genericReport(g);
        Mockito.when(g.getPopulationInfoByRegion())
                .thenReturn(mockedReturn);
        Mockito.when(g.getPopulationInfoByContinent())
                .thenReturn(mockedReturn);
        Mockito.when(g.getPopulationInfoByCountry())
                .thenReturn(mockedReturn);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        genericReport.generateReport();
        verify(g, times(1)).getPopulationInfoByRegion();
        verify(g, times(1)).getPopulationInfoByContinent();
        verify(g, times(1)).getPopulationInfoByCountry();
        verify(g, times(1)).getAllPopulation();
        verify(g, times(1)).getLanguagesInfo();
        buf.flush();
        String allWrittenLines = buf.toString();
        System.out.println(allWrittenLines);
        assertTrue(allWrittenLines.contains("mockedReturn"));
    }
}
