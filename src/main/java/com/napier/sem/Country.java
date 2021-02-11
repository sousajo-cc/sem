package com.napier.sem;

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

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public int getIndependenceYear() {
        return independenceYear;
    }

    public int getPopulation() {
        return population;
    }

    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public double getGnp() {
        return gnp;
    }

    public double getGnpOld() {
        return gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public int getCapital() {
        return capital;
    }

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
