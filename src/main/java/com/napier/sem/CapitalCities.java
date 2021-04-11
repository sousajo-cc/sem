package com.napier.sem;

/** Capital Cities **/
public class CapitalCities {
    private final String name;
    private final String country;
    private final int population;

    /** Initializes a capital city **/
    public CapitalCities(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getCapitalName() {
        return name;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCapitalCountry() {
        return country;
    }

    /**
     * Gets population.
     *
     * @return the population
     */
    public int getCapitalPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Capital City {" +
                " Name='" + name + '\'' +
                ", Country='" + country + '\'' +
                ", Population=" + population +
                " }";
    }
}
