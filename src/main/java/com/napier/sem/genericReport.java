package com.napier.sem;

import java.util.Map;

/**
 * The type Generic report.
 */
public class genericReport {
    private final genericReportDAO g;

    /**
     * Instantiates a new Generic report.
     *
     * @param g the g
     */
    genericReport(genericReportDAO g){
        this.g = g;
    }

    /**
     * Population report by country.
     */
    void populationReportByCountry(){
        String r = this.g.getPopulationInfoByCountry();
        System.out.println(r);
    }

    /**
     * Population report by continent.
     */
    void populationReportByContinent(){
        String r = this.g.getPopulationInfoByContinent();
        System.out.println(r);
    }

    /**
     * Population report by region.
     */
    void populationReportByRegion(){
        String r = this.g.getPopulationInfoByRegion();
        System.out.println(r);
    }

    /**
     * Population report.
     */
    void populationReport(){
        String r = this.g.getAllPopulation();
        System.out.println(r);
    }

    /**
     * Population report for a continent.
     *
     * @param name the name
     */
    void populationReportForAContinent(Continent name){
        String r = this.g.getAllPopulationInAContinent(name.name);
        System.out.println(r);
    }

    /**
     * Population report for a region.
     *
     * @param name the name
     */
    void populationReportForARegion(Region name){
        String r = this.g.getAllPopulationInARegion(name.name);
        System.out.println(r);
    }

    /**
     * Generate report.
     */
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

    /**
     * Generate report.
     *
     * @param name the name
     */
    public void generateReport(Continent name){
        this.populationReportForAContinent(name);
    }

    /**
     * Generate report.
     *
     * @param name the name
     */
    public void generateReport(Region name){
        this.populationReportForARegion(name);
    }

    /**
     * Population report for a country.
     *
     * @param name the name
     */
    void populationReportForACountry(Ctry name){
        String r = this.g.getAllPopulationInACountry(name.name);
        System.out.println(r);
    }

    /**
     * Generate report.
     *
     * @param name the name
     */
    public void generateReport(Ctry name){
        this.populationReportForACountry(name);
    }

    /**
     * Population report for a district.
     *
     * @param name the name
     */
    void populationReportForADistrict(District name){
        String r = this.g.getAllPopulationInADistrict(name.name);
        System.out.println(r);
    }

    /**
     * Generate report.
     *
     * @param name the name
     */
    public void generateReport(District name){
        this.populationReportForADistrict(name);
    }

    /**
     * Population report for a city.
     *
     * @param name the name
     */
    void populationReportForACity(Cty name){
        String r = this.g.getAllPopulationInACity(name.name);
        System.out.println(r);
    }

    /**
     * Generate report.
     *
     * @param name the name
     */
    public void generateReport(Cty name){
        this.populationReportForACity(name);
    }
}
