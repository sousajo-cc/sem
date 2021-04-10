package com.napier.sem;

import java.util.List;

public class CapitalCitiesReport implements ReportCapitalCities{

    @Override
    public void capitalCitiesWorld() {
        CapitalCitiesDAO capitalcitiesDao = new CapitalCitiesDAOImpl();
        List<CapitalCities> capitalcities = capitalcitiesDao.getAllCapitalCities();
        for (CapitalCities c:capitalcities){
            System.out.println(c.toString());
        }
    }

    @Override
    public void generateReport() {
        capitalCitiesWorld();
    }

}
