package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class genericReportDAOImpl implements genericReportDAO {
    public String strResultContinent;
    public String strResultRegion;
    @Override
    public String getPopulationInfoByCountry() {
        String strSelect = "select country.code, country.Population as countryPopulation, " +
        "coalesce(sum(city.Population),0) as peopleLivingInCities,  " +
        "coalesce((max(country.Population) - sum(city.Population)),0) as peopleNotLivingInCities  " +
        "from country " +
        "left join city on country.Code = city.CountryCode " +
        "group by country.Code order by country.Population";
        return getPopulationInfoByCountry(strSelect);
    }

    public String getPopulationInfoByRegion() {
        String strSelect = "select max(country.Region) as Region, sum(country.Population) as totalPopulation, " +
                "coalesce(sum(city.Population),0) as peopleLivingInCities,  " +
                "coalesce((sum(country.Population) - sum(city.Population)),0) as peopleNotLivingInCities  " +
                "from country " +
                "left join city on country.Code = city.CountryCode " +
                "group by country.Region order by country.Region";
        return getPopulationInfoByRegion(strSelect);
    }

    public String getPopulationInfoByContinent() {
        String strSelect = "select max(country.Continent) as Continent, sum(country.Population) as totalPopulation, " +
                "coalesce(sum(city.Population),0) as peopleLivingInCities,  " +
                "coalesce((sum(country.Population) - sum(city.Population)),0) as peopleNotLivingInCities  " +
                "from country " +
                "left join city on country.Code = city.CountryCode " +
                "group by country.Continent order by country.Continent";
        return getPopulationInfoByContinent(strSelect);
    }


    public String getPopulationInfoByCountry(String queryString){
        StringBuilder strResultCountry = new StringBuilder();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();
        try {
            Statement stmt = con.createStatement();

            ResultSet results = stmt.executeQuery(queryString);
            strResultCountry.append("Population Report By Country:\n");

            while (results.next()) {
                strResultCountry.append("\nCountry:")
                        .append(results.getString("code"))
                        .append(" countryPopulation:")
                        .append(results.getString("countryPopulation"))
                        .append(" peopleLivingInCities:")
                        .append(results.getString("peopleLivingInCities"))
                        .append(" peopleNotLivingInCities:")
                        .append(results.getString("peopleNotLivingInCities"));
            }
            results.close();
            con.close();
        } catch (SQLException ignored) {
        }
        return strResultCountry.toString();
    }


    public String getPopulationInfoByRegion(String queryString){
        StringBuilder strResultRegion = new StringBuilder();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();


        try {
            Statement stmt = con.createStatement();

            ResultSet results = stmt.executeQuery(queryString);
            strResultRegion.append("Population Report By Region:\n");
            while (results.next()) {
                strResultRegion.append("\nRegion:")
                        .append(results.getString("Region"))
                        .append(" totalPopulation:")
                        .append(results.getString("totalPopulation"))
                        .append(" peopleLivingInCities:")
                        .append(results.getString("peopleLivingInCities"))
                        .append(" peopleNotLivingInCities:")
                        .append(results.getString("peopleNotLivingInCities"));
            }
            results.close();
            con.close();
        } catch (SQLException ignored) {
        }
        return strResultRegion.toString();
    }
    public String getPopulationInfoByContinent(String queryString){
        StringBuilder strResultContinent = new StringBuilder();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();
        try {
            Statement stmt = con.createStatement();
            ResultSet results = stmt.executeQuery(queryString);
            strResultContinent.append("Population Report By Continent:\n");
            while (results.next()) {
                strResultContinent.append("\nContinent:")
                        .append(results.getString("Continent"))
                        .append(" totalPopulation:")
                        .append(results.getString("totalPopulation"))
                        .append(" peopleLivingInCities:")
                        .append(results.getString("peopleLivingInCities"))
                        .append(" peopleNotLivingInCities:")
                        .append(results.getString("peopleNotLivingInCities"));
            }

            results.close();
            con.close();
        } catch (SQLException ignored) {
        }
        return strResultContinent.toString();
    }
}

