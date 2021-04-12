package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Capital City dao.
 */
public class CapitalCitiesDAOImpl implements CapitalCitiesDAO {

    @Override
    public List<CapitalCities> getAllCapitalCitiesLargestToSmallestWorld() {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.Population " +
                           "FROM world.country " +
                           "JOIN world.city " +
                           "ON world.country.Capital = world.city.ID " +
                           "ORDER BY world.city.Population " +
                           "DESC";
        return getCapitalCities(strSelect);
    }

    @Override
    public List<CapitalCities> getAllCapitalCitiesLargestToSmallestContinent(Continent continent) {
        String strSelect = "SELECT world.city.Name, world.country.Name AS 'Country', world.city.Population " +
                "FROM world.country " +
                "JOIN world.city " +
                "ON world.country.Capital = world.city.ID " +
                "WHERE LOWER(world.country.Continent) = '" + continent.name.toLowerCase() +
                "' ORDER BY world.city.Population " +
                "DESC";
        return getCapitalCities(strSelect);
    }

    public List<CapitalCities> getCapitalCities(String queryString){
        List<CapitalCities> capitalcities = new ArrayList<>();
        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();

        try {
            Statement stmt = con.createStatement();

            ResultSet results = stmt.executeQuery(queryString);

            while (results.next()) {
                CapitalCities cap_city = new CapitalCities(
                        results.getString("name"), results.getString("country"),
                        results.getInt("population"));
                capitalcities.add(cap_city);
            }

            con.close();
        } catch (SQLException e) {
            return new ArrayList<>();
        }
        return capitalcities;
    }
}

