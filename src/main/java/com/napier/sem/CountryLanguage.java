package com.napier.sem;

/**
 * The type Country language.
 */
public class CountryLanguage {

    private final String countryCode;
    private final String language;
    private final boolean isOfficial;
    private final double percentageOfUsage;

    /**
     * Instantiates a new Country language.
     *
     * @param countryCode       the country code
     * @param language          the language
     * @param isOfficial        the is official
     * @param percentageOfUsage the percentage of usage
     */
    public CountryLanguage(String countryCode, String language, boolean isOfficial, double percentageOfUsage) {
        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentageOfUsage = percentageOfUsage;
    }

    /**
     * Gets country code.
     *
     * @return the country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Gets language.
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Is official boolean.
     *
     * @return the boolean
     */
    public boolean isOfficial() {
        return isOfficial;
    }

    /**
     * Gets percentage of usage.
     *
     * @return the percentage of usage
     */
    public double getPercentageOfUsage() {
        return percentageOfUsage;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                ", isOfficial=" + isOfficial +
                ", percentageOfUsage=" + percentageOfUsage +
                '}';
    }
}
