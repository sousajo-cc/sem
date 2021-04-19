package com.napier.sem;

import java.util.List;

public class CityReport implements Report {
    private CityDAO CityDAO;
    CityReport(CityDAO capitalCity){
        this.CityDAO = capitalCity;
    }
    @Override
    public void largestToSmallest(){
        List<City> cities = this.CityDAO.getAllCitiesLargestToSmallestWorld();
        for (City c:cities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestInContinent(Continent continent){
        List<City> cities = this.CityDAO.getAllCitiesLargestToSmallestContinent(continent);
        for (City c:cities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestInRegion(Region region){
        List<City> cities = this.CityDAO.getAllCitiesLargestToSmallestRegion(region);
        for (City c:cities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartial(numberOfCountries topN){
    }
    @Override
    public void generateReport(){
        largestToSmallest();
    }
    @Override
    public void generateReport(Continent name){
        largestToSmallestInContinent(name);
    }
    @Override
    public void generateReport(Region name){
        largestToSmallestInRegion(name);
    }
    @Override
    public void generateReport(numberOfCountries topN){
    }
    @Override
    public void largestToSmallestPartialContinent(Continent name,numberOfCountries topN){
    }
    @Override
    public void generateReport(Continent name,numberOfCountries topN){
    }
    @Override
    public void largestToSmallestPartialRegion(Region name,numberOfCountries topN){
    }
    @Override
    public void generateReport(Region name,numberOfCountries topN){
    }
    @Override
    public void largestToSmallestInCountry(Ctry country){
        List<City> cities = this.CityDAO.getAllCitiesLargestToSmallestCountry(country);
        for (City c:cities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void generateReport(Ctry name){
        largestToSmallestInCountry(name);
    }
    @Override
    public void largestToSmallestInDistrict(District district){
        List<City> cities = this.CityDAO.getAllCitiesLargestToSmallestDistrict(district);
        for (City c:cities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void generateReport(District name){
        largestToSmallestInDistrict(name);
    }
}
