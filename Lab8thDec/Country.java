package Lab8thDec;

import java.util.HashSet;
import java.util.Iterator;

public class Country {
HashSet<String> H1 = new HashSet<>();
	public HashSet<String> storeCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String retrieveCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
	
public static void main(String[] args) {
	Country countries = new Country();
	countries.storeCountryNames("India");
	countries.storeCountryNames("USA");
	countries.storeCountryNames("Pakistan");
	countries.storeCountryNames("Bangladesh");
	countries.storeCountryNames("China");
 System.out.println();
	System.out.println("China: " + countries.retrieveCountry("China"));
	System.out.println("Japan: " + countries.retrieveCountry("Japan"));	
}
}
