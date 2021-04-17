package com.napier.sem;

/**
 * The type App.
 */
public class App {
    /**
     * The enum Report types.
     */

    public enum reportTypes {
        COUNTRY(){
            @Override
            public void createReportFor(){
                CountryDAO countryDAO = new CountryDAOImpl();
                Report r = new CountryReport(countryDAO);
                r.generateReport();
            }
            @Override
            public void createReportFor(Continent name){
                CountryDAO countryDAO = new CountryDAOImpl();
                Report r = new CountryReport(countryDAO);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(Region name){
                CountryDAO countryDAO = new CountryDAOImpl();
                Report r = new CountryReport(countryDAO);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(numberOfCountries topN){
                CountryDAO countryDAO = new CountryDAOImpl();
                Report r = new CountryReport(countryDAO);
                r.generateReport(topN);
            }
            @Override
            public void createReportFor(Continent name, numberOfCountries topN){
                CountryDAO countryDAO = new CountryDAOImpl();
                Report r = new CountryReport(countryDAO);
                r.generateReport(name, topN);
            }
            @Override
            public void createReportFor(Region name, numberOfCountries topN){
                CountryDAO countryDAO = new CountryDAOImpl();
                Report r = new CountryReport(countryDAO);
                r.generateReport(name, topN);
            }
        },
        CAPITALCITY() {
            @Override
            public void createReportFor() {
                CapitalCitiesDAO capitalCity = new CapitalCitiesDAOImpl();
                Report r = new CapitalCitiesReport(capitalCity);
                r.generateReport();
            }
            @Override
            public void createReportFor(Continent name){
                CapitalCitiesDAO capitalCity = new CapitalCitiesDAOImpl();
                Report r = new CapitalCitiesReport(capitalCity);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(Region name){
                CapitalCitiesDAO capitalCity = new CapitalCitiesDAOImpl();
                Report r = new CapitalCitiesReport(capitalCity);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(numberOfCountries topN){
                CapitalCitiesDAO capitalCity = new CapitalCitiesDAOImpl();
                Report r = new CapitalCitiesReport(capitalCity);
                r.generateReport(topN);
            }
            @Override
            public void createReportFor(Continent name, numberOfCountries topN){
                CapitalCitiesDAO capitalCity = new CapitalCitiesDAOImpl();
                Report r = new CapitalCitiesReport(capitalCity);
                r.generateReport(name, topN);
            }
            @Override
            public void createReportFor(Region name, numberOfCountries topN){
                CapitalCitiesDAO capitalCity = new CapitalCitiesDAOImpl();
                Report r = new CapitalCitiesReport(capitalCity);
                r.generateReport(name, topN);
            }
        },
        ;

        /**
         * Create report.
         */
        public abstract void createReportFor();
        public abstract void createReportFor(Continent name);
        public abstract void createReportFor(Region name);
        public abstract void createReportFor(numberOfCountries topN);
        public abstract void createReportFor(Continent name, numberOfCountries topN);
        public abstract void createReportFor(Region name, numberOfCountries topN);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        for(reportTypes t : reportTypes.values()){
            // parameters defaulted here in order to keep the CI running
            // normally the user should be prompted to supply these
            t.createReportFor();
            Continent c = new Continent("europe");
            t.createReportFor(c);
            Region r = new Region("northamerica");
            t.createReportFor(r);
            numberOfCountries n = new numberOfCountries(1);
            t.createReportFor(n);
            t.createReportFor(c, n);
            t.createReportFor(r, n);
        }
    }
}
