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
}
