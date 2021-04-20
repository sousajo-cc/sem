package com.napier.sem;

import java.util.Map;

public interface genericReportDAO {
    String getPopulationInfoByCountry();
    String getPopulationInfoByRegion();
    String getPopulationInfoByContinent();
    String getAllPopulation();
    String getAllPopulationInAContinent(String continent);
    String getAllPopulationInARegion(String region);
    Map<String, String> getLanguagesInfo();
    String getAllPopulationInACountry(String country);
    String getAllPopulationInADistrict(String district);
    String getAllPopulationInACity(String city);
}
