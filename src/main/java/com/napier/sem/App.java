package com.napier.sem;

public class App {
    public enum reportTypes {
        COUNTRY() {
            @Override
            public void createReport() {
                Report r = new CountryReport();
                r.generateReport();
            }
        },
        ;
        public abstract void createReport();
    }

    public static void main(String[] args) {
        for(reportTypes t : reportTypes.values()){
            t.createReport();
        }
    }
}

