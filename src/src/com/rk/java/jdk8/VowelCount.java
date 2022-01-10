package src.com.rk.java.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelCount {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Australia");
		countries.add("USA");
		List<String> filteredCountries = new ArrayList<String>();
		for(String country : countries)
			filteredCountries.add(country.replaceAll("[!aeiouAEIOU]", ""));
		
		System.out.println(filteredCountries);
		
		 Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		 map=filteredCountries.stream().distinct()
		            .collect(Collectors.toMap(Function.identity(), String::length));
		 System.out.println(map);
		
		
		
		//System.out.println(countries.stream().collectmap(String::toLowerCase).filter(containsA.or(containsI)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		//collect(Collectors.toMap(keyMapper, valueMapper))count();
		Map<String, Integer> countryMap = new HashMap<String,Integer>();
		VowelCount vc = new VowelCount();
		
		//System.out.println("Vowel count map..."+vc.getVowelCountByCountry(countries,countryMap,vowelList));

	}
	
	/*
	 * private Map<String, Integer> getVowelCountByCountry(List<String> countries,
	 * Map<String, Integer> countryMap, List<Character> vowelList) {
	 * 
	 * 
	 * 
	 * for(String country:countries) country.toLowerCase().chars().filter(c->
	 * 
	 * return countryMap; }
	 */


}

