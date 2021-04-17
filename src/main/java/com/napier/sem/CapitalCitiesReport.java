package com.napier.sem;

import java.util.List;

public class CapitalCitiesReport implements Report {
    private CapitalCitiesDAO capitalCityDAO;
    CapitalCitiesReport(CapitalCitiesDAO capitalCity){
        this.capitalCityDAO = capitalCity;
    }
    @Override
    public void largestToSmallest(){
        List<CapitalCities> capitalcities = this.capitalCityDAO.getAllCapitalCitiesLargestToSmallestWorld();
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString()); 
        }
    }
    @Override
    public void largestToSmallestInContinent(Continent continent){
        List<CapitalCities> capitalcities = this.capitalCityDAO.getAllCapitalCitiesLargestToSmallestContinent(continent);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestInRegion(Region region){
        List<CapitalCities> capitalcities = this.capitalCityDAO.getAllCapitalCitiesLargestToSmallestRegion(region);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartial(numberOfCountries topN){
        List<CapitalCities> capitalcities = this.capitalCityDAO.getTopNCapitalCitiesLargestToSmallest(topN);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartialContinent(Continent name, numberOfCountries topN){
        List<CapitalCities> capitalcities = this.capitalCityDAO.getTopNCapitalCitiesLargestToSmallestContinent(name, topN);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartialRegion(Region name, numberOfCountries topN){
        List<CapitalCities> capitalcities = this.capitalCityDAO.getTopNCapitalCitiesLargestToSmallestRegion(name, topN);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
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
