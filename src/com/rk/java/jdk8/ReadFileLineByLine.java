package com.rk.java.jdk8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileLineByLine {
	
	public static void main(String[] args) {
		
		
		String fileName = "C:\\Tutorials\\InterviewPrep\\TopicsPending.txt";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("============BufferedReader Read==================");
		//Using Buffered Reader
				try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
					
					

					br.lines().forEach(System.out::println);

				} catch (IOException e) {
					e.printStackTrace();
				}
				
		System.out.println("============BufferedReader Read With Filter==================");
		//Using Buffered Reader
				try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
					
					

					br.lines().filter(x->x.startsWith("Generic")).forEach(System.out::println);

				} catch (IOException e) {
					e.printStackTrace();
				}
	}

}
