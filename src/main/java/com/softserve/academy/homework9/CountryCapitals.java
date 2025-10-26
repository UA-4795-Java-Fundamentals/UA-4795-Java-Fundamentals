package com.softserve.academy.homework9;

import java.util.HashMap;
import java.util.Map;

public class CountryCapitals {
    private Map<String, String> countryMap;

    public CountryCapitals() {
        countryMap = new HashMap<>();
    }

    public void addCountry(String country, String capital) {
        if (!countryMap.containsKey(country)) {
            countryMap.put(country, capital);
        }
    }

    public String getCapital(String country) {
        return countryMap.get(country);
    }

    public void removeCountry(String country) {
        countryMap.remove(country);
    }

    public int getCountryCount() {
        return countryMap.size();
    }
}
