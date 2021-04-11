package com.napier.sem;

/**
 * The interface Report.
 */
public interface Report {
    void largestToSmallest();
    void largestToSmallestInContinent(Continent name);
    void largestToSmallestInRegion(Region name);
    void largestToSmallestPartial(numberOfCountries topN);
    void capitalCitiesLargestToSmallestWorld();
    void generateReportCapCitiesLargestToSmallest();
    void generateReport();
    void generateReport(Continent name);
    void generateReport(Region name);
    void generateReport(numberOfCountries topN);
}
