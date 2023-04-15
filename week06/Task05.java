package week06;

import java.util.ArrayList;
import java.util.Arrays;

public class Task05 {

	
	public static String[] removeCountries(String countries[]) {
			ArrayList<String> filteredCountries = new ArrayList<>();
			
			for (int i = 0; i < countries.length; i++) {
				if (!(countries[i].length() >= 10)) {
					String country = countries[i];
					filteredCountries.add(country);
				}
			}					
				String newCountryArray[] = filteredCountries.toArray(new String[filteredCountries.size()]);
		return newCountryArray;
	}
	
	public static void main(String[] args) {
		
		String countries [] = {"USA", "United Kingdom", "Canada", "Australia", "Ireland"};
		System.out.println(Arrays.toString(removeCountries(countries)));
		
	}

}
