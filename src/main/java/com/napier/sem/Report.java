package com.napier.sem;

/**
 * The interface Report.
 */
public interface Report {
    void largestToSmallest();
    void largestToSmallestInContinent(Continent name);
    void largestToSmallestInRegion(Region name);
    void largestToSmallestPartial(numberOfCountries topN);
    void generateReport();
    void generateReport(Continent name);
    void generateReport(Region name);
    void generateReport(numberOfCountries topN);
    void largestToSmallestPartialContinent(Continent name, numberOfCountries topN);
    void generateReport(Continent name, numberOfCountries topN);
    void largestToSmallestPartialRegion(Region name, numberOfCountries topN);
    void generateReport(Region name, numberOfCountries topN);
}
