package com.napier.sem;

import java.util.List;

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
    public void generateReport() {
        largestToSmallest();
    }
}
