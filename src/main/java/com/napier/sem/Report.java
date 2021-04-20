package com.napier.sem;

/**
 * The interface Report.
 */
public interface Report {
    /**
     * Largest to smallest.
     */
    void largestToSmallest();

    /**
     * Largest to smallest in continent.
     *
     * @param name the name
     */
    void largestToSmallestInContinent(Continent name);

    /**
     * Largest to smallest in region.
     *
     * @param name the name
     */
    void largestToSmallestInRegion(Region name);

    /**
     * Largest to smallest partial.
     *
     * @param topN the top n
     */
    void largestToSmallestPartial(numberOfCountries topN);

    /**
     * Generate report.
     */
    void generateReport();

    /**
     * Generate report.
     *
     * @param name the name
     */
    void generateReport(Continent name);

    /**
     * Generate report.
     *
     * @param name the name
     */
    void generateReport(Region name);

    /**
     * Generate report.
     *
     * @param topN the top n
     */
    void generateReport(numberOfCountries topN);

    /**
     * Largest to smallest partial continent.
     *
     * @param name the name
     * @param topN the top n
     */
    void largestToSmallestPartialContinent(Continent name, numberOfCountries topN);

    /**
     * Generate report.
     *
     * @param name the name
     * @param topN the top n
     */
    void generateReport(Continent name, numberOfCountries topN);

    /**
     * Largest to smallest partial region.
     *
     * @param name the name
     * @param topN the top n
     */
    void largestToSmallestPartialRegion(Region name, numberOfCountries topN);

    /**
     * Generate report.
     *
     * @param name the name
     * @param topN the top n
     */
    void generateReport(Region name, numberOfCountries topN);

    /**
     * Largest to smallest in country.
     *
     * @param name the name
     */
    void largestToSmallestInCountry(Ctry name);

    /**
     * Generate report.
     *
     * @param name the name
     */
    void generateReport(Ctry name);

    /**
     * Largest to smallest in district.
     *
     * @param name the name
     */
    void largestToSmallestInDistrict(District name);

    /**
     * Generate report.
     *
     * @param name the name
     */
    void generateReport(District name);

    /**
     * Largest to smallest partial country.
     *
     * @param name the name
     * @param topN the top n
     */
    void largestToSmallestPartialCountry(Ctry name, numberOfCountries topN);

    /**
     * Generate report.
     *
     * @param name the name
     * @param topN the top n
     */
    void generateReport(Ctry name, numberOfCountries topN);

    /**
     * Largest to smallest partial district.
     *
     * @param name the name
     * @param topN the top n
     */
    void largestToSmallestPartialDistrict(District name, numberOfCountries topN);

    /**
     * Generate report.
     *
     * @param name the name
     * @param topN the top n
     */
    void generateReport(District name, numberOfCountries topN);
}
