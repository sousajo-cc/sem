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
            public void createReport() {
                Report r = new CountryReport();
                r.generateReport();
            }
        },
        ;

        /**
         * Create report.
         */
        public abstract void createReport();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        for(reportTypes t : reportTypes.values()){
            t.createReport();
        }
    }
}

