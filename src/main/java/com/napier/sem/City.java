package com.napier.sem;

/**
 * The type City.
 */
public class City {
    private final String name;
    private final String country;
    private final String district;
    private final int population;

    /**
     * Instantiates a new City.
     *
     * @param name        the name
     * @param country     the country
     * @param district    the district
     * @param population  the population
     */
    public City(String name, String country, String district, int population) {
        this.name = name;
        this.country = country;
        this.district = district;
        this.population = population;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Gets district.
     *
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Gets population.
     *
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                " name='" + name + '\'' +
                ", Country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }
}
