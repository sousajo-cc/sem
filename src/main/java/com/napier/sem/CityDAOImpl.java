package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The type City dao.
 */
public class CityDAOImpl implements CityDAO {

    @Override
    public List<City> getAllCitiesLargestToSmallestWorld() {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "ORDER BY world.city.Population " +
                "DESC";
        return getCity(strSelect);
    }

    @Override
    public List<City> getAllCitiesLargestToSmallestContinent(Continent continent) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "WHERE LOWER(world.country.Continent) = '" + continent.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC";
        return getCity(strSelect);
    }

    @Override
    public List<City> getAllCitiesLargestToSmallestRegion(Region region) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "WHERE LOWER(REPLACE(Region,' ', '')) = '" + region.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC";
        return getCity(strSelect);
    }

    @Override
    public List<City> getAllCitiesLargestToSmallestCountry(Ctry country) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "WHERE LOWER(world.country.Name) = '" + country.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC";
        return getCity(strSelect);
    }

    @Override
    public List<City> getAllCitiesLargestToSmallestDistrict(District district) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "WHERE LOWER(world.city.District) = '" + district.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC";
        return getCity(strSelect);
    }

    @Override
    public List<City> getTopNCitiesLargestToSmallest(numberOfCountries topN) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "ORDER BY world.city.Population " +
                "DESC " +
                "LIMIT " + topN.topN ;
        return getCity(strSelect);
    }

    @Override
    public List<City> getTopNCitiesLargestToSmallestContinent(Continent continent, numberOfCountries topN) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "WHERE LOWER(world.country.Continent) = '" + continent.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC " +
                "LIMIT " + topN.topN ;
        return getCity(strSelect);
    }

    @Override
    public List<City> getTopNCitiesLargestToSmallestRegion(Region region, numberOfCountries topN) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "WHERE LOWER(REPLACE(world.country.Region,' ', '')) = '"+ region.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC " +
                "LIMIT " + topN.topN ;
        return getCity(strSelect);
    }

    @Override
    public List<City> getTopNCitiesLargestToSmallestCountry(Ctry country, numberOfCountries topN) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "WHERE LOWER(world.country.Name) = '" + country.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC " +
                "LIMIT " + topN.topN ;
        return getCity(strSelect);
    }

    @Override
    public List<City> getTopNCitiesLargestToSmallestDistrict(District district, numberOfCountries topN) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.District, world.city.Population " +
                "FROM world.city " +
                "JOIN world.country " +
                "ON world.city.CountryCode = world.country.Code " +
                "WHERE LOWER(world.city.District) = '" + district.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC " +
                "LIMIT " + topN.topN ;
        return getCity(strSelect);
    }

    public List<City> getCity(String queryString){
        List<City> cities = new ArrayList<>();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();

        try {
            Statement stmt = con.createStatement();

            ResultSet results = stmt.executeQuery(queryString);

            while (results.next()) {
                City city = new City(
                        results.getString("name"), results.getString("country"),
                        results.getString("district"), results.getInt("population"));
                cities.add(city);
            }

            con.close();
        } catch (SQLException e) {
            return new ArrayList<>();
        }
        return cities;
    }
}
