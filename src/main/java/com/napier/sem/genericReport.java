package com.napier.sem;

import java.util.List;

public class genericReport {
    private genericReportDAO g;
    genericReport(genericReportDAO g){
        this.g = g;
    }

    void populationReportByCountry(){
        String r = this.g.getPopulationInfoByCountry();
        System.out.println(r);
    }
    void populationReportByContinent(){
        String r = this.g.getPopulationInfoByContinent();
        System.out.println(r);
    }
    void populationReportByRegion(){
        String r = this.g.getPopulationInfoByRegion();
        System.out.println(r);
    }

    public void generateReport(){
        this.populationReportByCountry();
        this.populationReportByContinent();
        this.populationReportByRegion();
    }
}
