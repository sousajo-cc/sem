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
            @Override
            public void createReportFor(Ctry name){
            }
            @Override
            public void createReportFor(District name){
            }
            @Override
            public void createReportFor(Ctry name, numberOfCountries topN){
            }
            @Override
            public void createReportFor(District name, numberOfCountries topN){
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
            @Override
            public void createReportFor(Ctry name){
            }
            @Override
            public void createReportFor(District name){
            }
            @Override
            public void createReportFor(Ctry name, numberOfCountries topN){
            }
            @Override
            public void createReportFor(District name, numberOfCountries topN){
            }
        },
        CITY() {
            @Override
            public void createReportFor() {
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport();
            }
            @Override
            public void createReportFor(Continent name){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(Region name){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(Ctry name){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(District name){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(numberOfCountries topN){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(topN);
            }
            @Override
            public void createReportFor(Continent name, numberOfCountries topN){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(name, topN);
            }
            @Override
            public void createReportFor(Region name, numberOfCountries topN){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(name, topN);
            }
            @Override
            public void createReportFor(Ctry name, numberOfCountries topN){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(name, topN);
            }
            @Override
            public void createReportFor(District name, numberOfCountries topN){
                CityDAO City = new CityDAOImpl();
                Report r = new CityReport(City);
                r.generateReport(name, topN);
            }
        },
        GENERIC_REPORTS() {
            @Override
            public void createReportFor() {
                genericReportDAO g = new genericReportDAOImpl();
                genericReport r = new genericReport(g);
                r.generateReport();
            }
            @Override
            public void createReportFor(Continent name){
                genericReportDAO g = new genericReportDAOImpl();
                genericReport r = new genericReport(g);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(Region name){
                genericReportDAO g = new genericReportDAOImpl();
                genericReport r = new genericReport(g);
                r.generateReport(name);
            }
            @Override
            public void createReportFor(numberOfCountries topN){
            }
            @Override
            public void createReportFor(Continent name, numberOfCountries topN){
            }
            @Override
            public void createReportFor(Region name, numberOfCountries topN){
            }
            @Override
            public void createReportFor(Ctry name){
            }
            @Override
            public void createReportFor(District name){
            }
            @Override
            public void createReportFor(Ctry name, numberOfCountries topN){
            }
            @Override
            public void createReportFor(District name, numberOfCountries topN){
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
        public abstract void createReportFor(Ctry name);
        public abstract void createReportFor(District name);
        public abstract void createReportFor(Ctry name, numberOfCountries topN);
        public abstract void createReportFor(District name, numberOfCountries topN);
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
            Ctry ctry = new Ctry("Ireland");
            t.createReportFor(ctry);
            District d = new District("Shizuoka");
            t.createReportFor(d);
            t.createReportFor(ctry, n);
            t.createReportFor(d, n);
        }
    }
}