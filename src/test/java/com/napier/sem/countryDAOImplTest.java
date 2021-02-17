package com.napier.sem;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class countryDAOImplTest {
    private CountryDAO country;
    private List<Country> countryListRet;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        country = Mockito.mock(CountryDAO.class);
        Country countryMockedReturn = new Country("UMI",
                "United States Minor Outlying Islands",
                "Oceania",
                "Micronesia/Caribbean",
                16.0,
                0,
                0,
                0.0,
                0.0,
                0.0,
                "United States Minor Outlying Islands",
                "Dependent Territory of the US",
                "George W. Bush",
                0,
                "UM"
        );
        countryListRet = new ArrayList<>();
        countryListRet.add(countryMockedReturn);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void getAllCountriesPopFromLargestToSmallestTest(){
        Mockito.when(country.getAllCountriesPopFromLargestToSmallest())
                .thenReturn(countryListRet);
        List<Country> ret = country.getAllCountriesPopFromLargestToSmallest();
        System.out.println(ret);
        assertEquals(ret.get(0).getContinent().toLowerCase(), "oceania");
    }
}
