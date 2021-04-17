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
    public void largestToSmallestInRegion(Region region){
        CapitalCitiesDAO CapitalCitiesDao = new CapitalCitiesDAOImpl();
        List<CapitalCities> capitalcities = CapitalCitiesDao.getAllCapitalCitiesLargestToSmallestRegion(region);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartial(numberOfCountries topN){
        CapitalCitiesDAO CapitalCitiesDao = new CapitalCitiesDAOImpl();
        List<CapitalCities> capitalcities = CapitalCitiesDao.getTopNCapitalCitiesLargestToSmallest(topN);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartialContinent(Continent name, numberOfCountries topN){
        CapitalCitiesDAO CapitalCitiesDao = new CapitalCitiesDAOImpl();
        List<CapitalCities> capitalcities = CapitalCitiesDao.getTopNCapitalCitiesLargestToSmallestContinent(name, topN);
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }
    @Override
    public void largestToSmallestPartialRegion(Region name, numberOfCountries topN){
        CapitalCitiesDAO CapitalCitiesDao = new CapitalCitiesDAOImpl();
        List<CapitalCities> capitalcities = CapitalCitiesDao.getTopNCapitalCitiesLargestToSmallestRegion(name, topN);
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
