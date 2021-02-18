package com.napier.sem;

import java.util.List;

/**
 * The interface Country dao.
 */
public interface CountryDAO {
    /**
     * Gets all countries pop from largest to smallest.
     *
     * @return the all countries pop from largest to smallest
     */
    List<Country> getAllCountriesPopFromLargestToSmallest();
}
