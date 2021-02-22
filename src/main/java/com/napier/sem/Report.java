package com.napier.sem;

/**
 * The interface Report.
 */
public interface Report {
    void largestToSmallest();
    void largestToSmallestInContinent(Continent name);
    void largestToSmallestInRegion(Region name);
    void generateReport();
    void generateReport(Continent name);
    void generateReport(Region name);
}
