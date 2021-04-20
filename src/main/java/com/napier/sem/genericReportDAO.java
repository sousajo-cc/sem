package com.napier.sem;

import java.util.Map;

/**
 * The interface Generic report dao.
 */
public interface genericReportDAO {
    /**
     * Gets population info by country.
     *
     * @return the population info by country
     */
    String getPopulationInfoByCountry();

    /**
     * Gets population info by region.
     *
     * @return the population info by region
     */
    String getPopulationInfoByRegion();

    /**
     * Gets population info by continent.
     *
     * @return the population info by continent
     */
    String getPopulationInfoByContinent();

    /**
     * Gets all population.
     *
     * @return the all population
     */
    String getAllPopulation();

    /**
     * Gets all population in a continent.
     *
     * @param continent the continent
     * @return the all population in a continent
     */
    String getAllPopulationInAContinent(String continent);

    /**
     * Gets all population in a region.
     *
     * @param region the region
     * @return the all population in a region
     */
    String getAllPopulationInARegion(String region);

    /**
     * Gets languages info.
     *
     * @return the languages info
     */
    Map<String, String> getLanguagesInfo();

    /**
     * Gets all population in a country.
     *
     * @param country the country
     * @return the all population in a country
     */
    String getAllPopulationInACountry(String country);

    /**
     * Gets all population in a district.
     *
     * @param district the district
     * @return the all population in a district
     */
    String getAllPopulationInADistrict(String district);

    /**
     * Gets all population in a city.
     *
     * @param city the city
     * @return the all population in a city
     */
    String getAllPopulationInACity(String city);
}
