package com.napier.sem;

import java.util.List;

public class CapitalCitiesReport implements Report {
    @Override
    public void largestToSmallest(){
        CapitalCitiesDAO CapitalCitiesDao = new CapitalCitiesDAOImpl();
        List<CapitalCities> capitalcities = CapitalCitiesDao.getAllCapitalCitiesLargestToSmallestWorld();
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString()); 
        }
    }
    @Override
    public void largestToSmallestInContinent(Continent continent){
        CapitalCitiesDAO CapitalCitiesDao = new CapitalCitiesDAOImpl();
        List<CapitalCities> capitalcities = CapitalCitiesDao.getAllCapitalCitiesLargestToSmallestContinent(continent);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestInRegion(Region name){
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
    }
    @Override
    public void generateReport(numberOfCountries topN){
    }
}

