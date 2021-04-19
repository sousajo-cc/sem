package com.napier.sem;

import java.util.Map;

public class genericReport {
    private final genericReportDAO g;
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

    void populationReport(){
        String r = this.g.getAllPopulation();
        System.out.println(r);
    }

    void populationReportForAContinent(Continent name){
        String r = this.g.getAllPopulationInAContinent(name.name);
        System.out.println(r);
    }

    void populationReportForARegion(Region name){
        String r = this.g.getAllPopulationInARegion(name.name);
        System.out.println(r);
    }

    public void generateReport(){
        this.populationReportByCountry();
        this.populationReportByContinent();
        this.populationReportByRegion();
        this.populationReport();
        this.languageReport();
    }

    private void languageReport() {
        Map<String, String> r = this.g.getLanguagesInfo();
        System.out.println("\nPercentage of people speaking Chinese:" + r.get("Chinese"));
        System.out.println("\nPercentage of people speaking English:" + r.get("English"));
        System.out.println("\nPercentage of people speaking Hindi:" + r.get("Hindi"));
        System.out.println("\nPercentage of people speaking Spanish:" + r.get("Spanish"));
        System.out.println("\nPercentage of people speaking Arabic:" + r.get("Arabic"));
    }

    public void generateReport(Continent name){
        this.populationReportForAContinent(name);
    }

    public void generateReport(Region name){
        this.populationReportForARegion(name);
    }
}
