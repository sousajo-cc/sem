package com.napier.sem;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class genericReportDAOImpl implements genericReportDAO {

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

    public String getAllPopulation() {
        String strSelect = "select sum(country.Population) as totalPopulation " +
                "from country ";
        return getAllPopulationResults(strSelect);
    }

    public String getAllPopulationInAContinent(String continent) {
        String strSelect = "select sum(country.Population) as totalPopulation " +
                "from country where country.Continent = '" + continent + "'" ;
        return getAllContinentPopulationResults(strSelect, continent);
    }

    public String getAllPopulationInARegion(String region) {
        String strSelect = "select sum(country.Population) as totalPopulation " +
                "from country where LOWER(REPLACE(country.Region,' ', '')) = '" + region + "'" ;
        return getAllRegionPopulationResults(strSelect, region);
    }

    public String getAllPopulationResults(String queryString){
        StringBuilder strResultAll = new StringBuilder();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();
        try {
            Statement stmt = con.createStatement();

            ResultSet results = stmt.executeQuery(queryString);
            strResultAll.append("Number of people in the world:\n");

            while (results.next()) {
                strResultAll.append("\nTotal Population:")
                        .append(results.getString("totalPopulation"));
            }
            results.close();
            con.close();
        } catch (SQLException e) {
            return "";
        }
        return strResultAll.toString();
    }
    public String getAllRegionPopulationResults(String queryString, String region){
        StringBuilder strResultAll = new StringBuilder();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();
        try {
            Statement stmt = con.createStatement();

            ResultSet results = stmt.executeQuery(queryString);
            strResultAll.append("Number of people in the Region: ");
            strResultAll.append(region);
            strResultAll.append("\n");
            while (results.next()) {
                strResultAll.append("\nTotal Population:")
                        .append(results.getString("totalPopulation"));
            }
            results.close();
            con.close();
        } catch (SQLException e) {
            return "";
        }
        return strResultAll.toString();
    }
    public String getAllContinentPopulationResults(String queryString, String continent){
        StringBuilder strResultAll = new StringBuilder();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();
        try {
            Statement stmt = con.createStatement();

            ResultSet results = stmt.executeQuery(queryString);
            strResultAll.append("Number of people in the continent: ");
            strResultAll.append(continent);
            strResultAll.append("\n");
            while (results.next()) {
                strResultAll.append("\nTotal Population:")
                        .append(results.getString("totalPopulation"));
            }
            results.close();
            con.close();
        } catch (SQLException e) {
            return "";
        }
        return strResultAll.toString();
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
        } catch (SQLException e) {
            return "";
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
        } catch (SQLException e) {
            return "";
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
        } catch (SQLException e) {
            return "";
        }
        return strResultContinent.toString();
    }

    public Map<String, String> getLanguagesInfo(){
        Map<String, String> languagesSpoken = new HashMap<>();

        StringBuilder totalWorldPopulation = new StringBuilder();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();
        try {
            Statement stmt = con.createStatement();
            String query = "select sum(country.Population) as pop " +
                    "from country" ;
            ResultSet results = stmt.executeQuery(query);
            while (results.next()) {
                totalWorldPopulation.append(results.getString("pop"));
            }
            System.out.println(totalWorldPopulation.toString());
            BigInteger worldPop = new BigInteger(totalWorldPopulation.toString());
            results.close();
            BigInteger peopleSpeakingChinesePercentage = getPercentageOfPeopleSpeaking("Chinese", con, worldPop);
            results.close();
            BigInteger peopleSpeakingEnglishPercentage = getPercentageOfPeopleSpeaking("English", con, worldPop);
            results.close();
            BigInteger peopleSpeakingHindiPercentage = getPercentageOfPeopleSpeaking("Hindi", con, worldPop);
            results.close();
            BigInteger peopleSpeakingSpanishPercentage = getPercentageOfPeopleSpeaking("Spanish", con, worldPop);
            results.close();
            BigInteger peopleSpeakingArabicPercentage = getPercentageOfPeopleSpeaking("Arabic", con, worldPop);
            languagesSpoken.put("Chinese", peopleSpeakingChinesePercentage.toString());
            languagesSpoken.put("English", peopleSpeakingEnglishPercentage.toString());
            languagesSpoken.put("Hindi", peopleSpeakingHindiPercentage.toString());
            languagesSpoken.put("Spanish", peopleSpeakingSpanishPercentage.toString());
            languagesSpoken.put("Arabic", peopleSpeakingArabicPercentage.toString());
            con.close();
            return languagesSpoken;
        } catch (SQLException e) {
            return languagesSpoken;
        }
    }

    private BigInteger getPercentageOfPeopleSpeaking(String language, Connection con, BigInteger worldPop) throws SQLException {
        ResultSet results;
        Statement stmt;
        String query;
        stmt = con.createStatement();
        StringBuilder totalPopulationSpeakingLanguage = new StringBuilder();
        query = "select cast(sum(country.Population * (countrylanguage.percentage/100)) as UNSIGNED) " +
                "as numberOfPeopleSpeakingTheLanguage " +
                "from countrylanguage " +
                "left join country on country.Code = countrylanguage.CountryCode " +
                "where countrylanguage.Language = '" + language + "'";
        results = stmt.executeQuery(query);
        while (results.next()) {
            totalPopulationSpeakingLanguage.append(results.getString("numberOfPeopleSpeakingTheLanguage"));
        }
        BigInteger peopleSpeakingLangugage= new BigInteger(totalPopulationSpeakingLanguage.toString());
        return peopleSpeakingLangugage.divide(worldPop).multiply(BigInteger.valueOf(100));
    }
}

