package com.napier.sem;

import java.util.List;

/**
 * The type Country report.
 */
public class CountryReport implements Report {
    private CountryDAO countryDao;

    CountryReport(CountryDAO countryDao){
        this.countryDao = countryDao;
    }

    @Override
    public void largestToSmallest() {
        List<Country> countries = this.countryDao.getAllCountriesPopFromLargestToSmallest();
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestInContinent(Continent continent) {
        List<Country> countries = this.countryDao.getAllCountriesPopFromLargestToSmallestInContinent(continent);
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestInRegion(Region region) {
        List<Country> countries = this.countryDao.getAllCountriesPopFromLargestToSmallestInRegion(region);
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartial(numberOfCountries topN) {
        List<Country> countries = this.countryDao.getTopNCountriesPopFromLargestToSmallest(topN);
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartialContinent(Continent name, numberOfCountries topN){
        List<Country> countries = countryDao.getTopNCountriesPopFromLargestToSmallestContinent(name, topN);
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartialRegion(Region name, numberOfCountries topN){
        List<Country> countries = countryDao.getTopNCountriesPopFromLargestToSmallestContinent(name, topN);
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }
    @Override
    public void generateReport() {
        largestToSmallest();
    }
    @Override
    public void generateReport(Continent continent) {
        largestToSmallestInContinent(continent);
    }
    @Override
    public void generateReport(Region region) {
        largestToSmallestInRegion(region);
    }
    @Override
    public void generateReport(numberOfCountries topN) {
        largestToSmallestPartial(topN);
    }
    @Override
    public void generateReport(Continent name, numberOfCountries topN){
        largestToSmallestPartialContinent(name, topN);
    }
    @Override
    public void generateReport(Region name, numberOfCountries topN){
        largestToSmallestPartialRegion(name, topN);
    }
}
