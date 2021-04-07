package com.napier.sem;

import java.util.List;

/**
 * The type Country report.
 */
public class CountryReport implements Report {
    @Override
    public void largestToSmallest() {
        CountryDAO countryDao = new CountryDAOImpl();
        List<Country> countries = countryDao.getAllCountriesPopFromLargestToSmallest();
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }

    @Override
    public void largestToSmallestInContinent(Continent continent) {
        CountryDAO countryDao = new CountryDAOImpl();
        List<Country> countries = countryDao.getAllCountriesPopFromLargestToSmallestInContinent(continent);
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }

    @Override
    public void largestToSmallestInRegion(Region region) {
        CountryDAO countryDao = new CountryDAOImpl();
        List<Country> countries = countryDao.getAllCountriesPopFromLargestToSmallestInRegion(region);
        for (Country c:countries){
            System.out.println(c.toString());
        }
    }

    @Override
    public void largestToSmallestPartial(numberOfCountries topN) {
        CountryDAO countryDao = new CountryDAOImpl();
        List<Country> countries = countryDao.getTopNCountriesPopFromLargestToSmallest(topN);
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

}
