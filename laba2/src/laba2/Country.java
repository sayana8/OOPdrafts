package laba2;

import java.util.HashSet;

class Country {
	private String countryName;
    private String capitalCity;
    private String officialLanguage;
    private int population;
    

    public Country(String countryName, String capitalCity, String officialLanguage, int population) {
        this.countryName = countryName;
        this.capitalCity = capitalCity;
        this.officialLanguage = officialLanguage;
        this.population=population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country other = (Country) o;
        return countryName.equals(other.countryName) && capitalCity.equals(other.capitalCity);
    }
   

    @Override
    public int hashCode() {
        int result = countryName.hashCode();
        result = 31 * result + capitalCity.hashCode();
        return result;
    }

    public String getData() {
        return countryName + " has a capital city - " + capitalCity + ". Country`s  population is  " + population + " people that speak in " + officialLanguage ; 
    }
}



