package com.napier.sem;

import java.util.List;

/**
 * The interface Capital Cities dao.
 */
public interface CapitalCitiesDAO {
    /**
     * Gets all capital cities organized by largest population to smallest.
     *
     * @return all capital cities organized by largest population to smallest.
     */
    List<CapitalCities> getAllCapitalCitiesLargestToSmallestWorld();
    List<CapitalCities> getAllCapitalCitiesLargestToSmallestContinent(Continent continent);
    List<CapitalCities> getAllCapitalCitiesLargestToSmallestRegion(Region region);
    List<CapitalCities> getTopNCapitalCitiesLargestToSmallest(numberOfCountries topN);
    List<CapitalCities> getTopNCapitalCitiesLargestToSmallestContinent(Continent continent, numberOfCountries topN);
    List<CapitalCities> getTopNCapitalCitiesLargestToSmallestRegion(Region region, numberOfCountries topN);
}
