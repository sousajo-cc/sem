package com.napier.sem;

public class CountryLanguage {
    private final String countryCode;
    private final String language;
    private final boolean isOfficial;
    private final double percentageOfUsage;

    public CountryLanguage(String countryCode, String language, boolean isOfficial, double percentageOfUsage) {
        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentageOfUsage = percentageOfUsage;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

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
