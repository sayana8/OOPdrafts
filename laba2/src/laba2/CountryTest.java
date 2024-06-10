package laba2;

import java.util.HashSet;

public class CountryTest {
    public static void main(String[] args) {
        HashSet<Country> countrySet = new HashSet<>();

        Asia Japan = new Asia("Japan", " Tokyo" , "japanese", 125700000, "democracy, decentralized unitary");
        Asia Mongolia = new Asia("Mongolia", "Ulaanbaaatar", "mongolian", 3348000, "republic");
        Asia China = new Asia("China", "Beijing", "chinese", 1412000000, "one - party parliamentary");

        countrySet.add(Japan);
        countrySet.add(Mongolia);
        countrySet.add(China);

        for (Country country : countrySet) {
            System.out.println(country.toString());
        }
    }
}