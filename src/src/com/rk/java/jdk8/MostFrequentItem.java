package src.com.rk.java.jdk8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentItem {
	
	/**
	 * This class is used to find the most frequent item in a generic collection.
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hi");
		list.add("Hello");
		list.add("Hey");
		list.add("Hello");
		list.add("Hey");
		
		System.out.println(findMostFrequentItem(list));
	}
	
	private static <V> V findMostFrequentItem(final Collection<V> items)
	{
	  return items.stream()
	      .filter(Objects::nonNull)
	      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .map(Entry::getKey)
	      .orElse(null);
	}

}
