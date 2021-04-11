package com.napier.sem;

import java.util.List;

public class CapitalCitiesReport implements Report {
    @Override
    public void largestToSmallest(){
    }

    @Override
    public void largestToSmallestInContinent(Continent name){
    }

    @Override
    public void largestToSmallestInRegion(Region name){
    }

    @Override
    public void largestToSmallestPartial(numberOfCountries topN){
    }

    @Override
    public void generateReport(){
    }

    @Override
    public void generateReport(Continent name){
    }

    @Override
    public void generateReport(Region name){
    }

    @Override
    public void generateReport(numberOfCountries topN){
    }

    @Override
    public void capitalCitiesLargestToSmallestWorld(){
        CapitalCitiesDAO CapitalCitiesDao = new CapitalCitiesDAOImpl();
        List<CapitalCities> capitalcities = CapitalCitiesDao.getAllCapitalCitiesLargestToSmallestWorld();
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }

    @Override
    public void generateReportCapCitiesLargestToSmallest(){
        capitalCitiesLargestToSmallestWorld();
    }
}
