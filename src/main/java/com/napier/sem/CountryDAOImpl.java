package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryDAOImpl implements CountryDAO {
    @Override
    public List<Country> getAllCountriesPopFromLargestToSmallest() {
        List<Country> countries = new ArrayList<>();

        ConnectionManager dbCon = new ConnectionManager();
        Connection con = dbCon.getConnection();

        try {
            Statement stmt = con.createStatement();

            String strSelect =
                    "select * from country order by Population desc";

            ResultSet results = stmt.executeQuery(strSelect);

            while (results.next()) {
                Country curr_country = new Country(results.getString("Code"), results.getString("Name"),
                        results.getString("Continent"), results.getString("Region"), results.getDouble("SurfaceArea"),
                        results.getInt("IndepYear"), results.getInt("Population"), results.getDouble("LifeExpectancy"),
                        results.getDouble("GNP"), results.getDouble("GNPOld"), results.getString("LocalName"),
                        results.getString("GovernmentForm"), results.getString("HeadOfState"),
                        results.getInt("Capital"), results.getString("Code2"));
                countries.add(curr_country);
            }

            con.close();
        } catch (SQLException e) {
            return new ArrayList<>();
        }
        return countries;
    }
}
