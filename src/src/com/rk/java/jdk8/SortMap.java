package src.com.rk.java.jdk8;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author rackakka
 * This class is used to sort normal map of key/value pairs, 
 * once by using key and then by value.
 */
public class SortMap {
	
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"radhey");
		map.put(3,"Abhishek");
		map.put(2,"Kishore");
		
		sortMapByKey(map);
		sortMapByKeyReversed(map);
		sortMapByValue(map);
		
	}
    
	
	private static void sortMapByKey(Map<Integer, String> map) {
		LinkedHashMap<Integer, String> compareByKey = map.entrySet()
	            .stream()
	            .sorted(Map.Entry.comparingByKey())
	            .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue,
	                    (v1, v2) -> {
	                        throw new IllegalStateException();
	                    },
	                    LinkedHashMap::new
	            ));
		System.out.println("Comparing BY KEY "+compareByKey);
	}
	
	private static void sortMapByKeyReversed(Map<Integer, String> map) {
		LinkedHashMap<Integer, String> compareByKeyReversed = map.entrySet()
	            .stream()
	            .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
	            .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue,
	                    (v1, v2) -> {
	                        throw new IllegalStateException();
	                    },
	                    LinkedHashMap::new
	            ));
		System.out.println("Comparing BY KEY Reversed "+compareByKeyReversed);
	}
	
	private static void sortMapByValue(Map<Integer, String> map) {
		LinkedHashMap<Integer, String> compareByValue = map.entrySet()
	            .stream()
	            .sorted(Map.Entry.comparingByValue())
	            .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue,
	                    (v1, v2) -> {
	                        throw new IllegalStateException();
	                    },
	                    LinkedHashMap::new
	            ));
		System.out.println("Comparing BY Value "+compareByValue);
	}
	
	
	
}
