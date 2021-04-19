package com.napier.sem;

import java.util.List;

/**
 * The interface City dao.
 */
public interface CityDAO{
    /**
     * Gets all cities organized by largest population to smallest.
     *
     * @return all cities organized by largest population to smallest.
     */
    List<City> getAllCitiesLargestToSmallestWorld();
    List<City> getAllCitiesLargestToSmallestContinent(Continent continent);
    List<City> getAllCitiesLargestToSmallestRegion(Region region);
    List<City> getAllCitiesLargestToSmallestCountry(Ctry country);
    List<City> getAllCitiesLargestToSmallestDistrict(District district);
    List<City> getTopNCitiesLargestToSmallest(numberOfCountries topN);
    List<City> getTopNCitiesLargestToSmallestContinent(Continent continent, numberOfCountries topN);
    List<City> getTopNCitiesLargestToSmallestRegion(Region region, numberOfCountries topN);
    List<City> getTopNCitiesLargestToSmallestCountry(Ctry country, numberOfCountries topN);
    List<City> getTopNCitiesLargestToSmallestDistrict(District district, numberOfCountries topN);
}
