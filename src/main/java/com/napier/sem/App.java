package com.napier.sem;

/**
 * The type App.
 */
public class App {
    /**
     * The enum Report types.
     */

    public enum reportTypes {
        COUNTRY() {
            @Override
            public void createReportFor() {
                Report r = new CountryReport();
                r.generateReport();
            }
            @Override
            public void createReportFor(Continent name) {
                Report r = new CountryReport();
                r.generateReport(name);
            }
            @Override
            public void createReportFor(Region name) {
                Report r = new CountryReport();
                r.generateReport(name);
            }

            @Override
            public void createReportFor(numberOfCountries topN) {
                Report r = new CountryReport();
                r.generateReport(topN);
            }

            @Override
            public void createReportFor(Continent name, numberOfCountries topN) {
                // will be implemented next sprint
            }

            @Override
            public void createReportFor(Region name, numberOfCountries topN) {
                // will be implemented next sprint
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
        }
    }
}

