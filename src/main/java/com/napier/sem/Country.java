package com.napier.sem;

/**
 * The type Country.
 */
public class Country {
    private final String code;
    private final String name;
    private final String continent;
    private final String region;
    private final double surfaceArea;
    private final int independenceYear;
    private final int population;
    private final double lifeExpectancy;
    private final double gnp;
    private final double gnpOld;
    private final String localName;
    private final String governmentForm;
    private final String headOfState;
    private final int capital;
    private final String codeTwo;

    /**
     * Instantiates a new Country.
     *
     * @param code             the code
     * @param name             the name
     * @param continent        the continent
     * @param region           the region
     * @param surfaceArea      the surface area
     * @param independenceYear the independence year
     * @param population       the population
     * @param lifeExpectancy   the life expectancy
     * @param gnp              the gnp
     * @param gnpOld           the gnp old
     * @param localName        the local name
     * @param governmentForm   the government form
     * @param headOfState      the head of state
     * @param capital          the capital
     * @param codeTwo          the code two
     */
    public Country(String code,
                   String name,
                   String continent,
                   String region,
                   double surfaceArea,
                   int independenceYear,
                   int population,
                   double lifeExpectancy,
                   double gnp,
                   double gnpOld,
                   String localName,
                   String governmentForm,
                   String headOfState,
                   int capital,
                   String codeTwo)
    {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.independenceYear = independenceYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.codeTwo = codeTwo;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
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
     * Gets continent.
     *
     * @return the continent
     */
    public String getContinent() {
        return continent;
    }

    /**
     * Gets region.
     *
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Gets surface area.
     *
     * @return the surface area
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * Gets independence year.
     *
     * @return the independence year
     */
    public int getIndependenceYear() {
        return independenceYear;
    }

    /**
     * Gets population.
     *
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Gets life expectancy.
     *
     * @return the life expectancy
     */
    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    /**
     * Gets gnp.
     *
     * @return the gnp
     */
    public double getGnp() {
        return gnp;
    }

    /**
     * Gets gnp old.
     *
     * @return the gnp old
     */
    public double getGnpOld() {
        return gnpOld;
    }

    /**
     * Gets local name.
     *
     * @return the local name
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Gets government form.
     *
     * @return the government form
     */
    public String getGovernmentForm() {
        return governmentForm;
    }

    /**
     * Gets head of state.
     *
     * @return the head of state
     */
    public String getHeadOfState() {
        return headOfState;
    }

    /**
     * Gets capital.
     *
     * @return the capital
     */
    public int getCapital() {
        return capital;
    }

    /**
     * Gets code two.
     *
     * @return the code two
     */
    public String getCodeTwo() {
        return codeTwo;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", independenceYear=" + independenceYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", gnp=" + gnp +
                ", gnpOld=" + gnpOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital=" + capital +
                ", codeTwo='" + codeTwo + '\'' +
                '}';
    }
}
