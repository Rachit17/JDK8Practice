package src.com.rk.java.jdk8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rachit Kakkar 
 * This class is used to calculate the frequency of words
 *         in a list/stream using JDK8 APIS.
 */
public class WordFrequency {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of test cases : ");

		int testCases = br.read();

		for (int i = 0; i < testCases; i++) {
			System.out.println("Enter input stream : ");

			String input = br.readLine();

			String[] inputArr = input.split("\\s+");
			List<String> list = new ArrayList<String>();

			for (String s : inputArr)
				list.add(s);

			System.out.println(findFrequencies(list));
		}

		br.close();
	}

	/**
	 * This method accepts a generic collection of words/integers etc and return map of words to their count.
	 * @param <V> Generic collection
	 * @param items : Collection of string/integer etc..
	 * @return
	 */
	private static <V> Map<V, Long> findFrequencies(final Collection<V> items) {
		return items.stream().filter(Objects::nonNull)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

}
