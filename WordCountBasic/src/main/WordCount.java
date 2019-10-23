package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		Map<String, Integer> map = new HashMap<>();
		BufferedReader br = null;
		String line = null;
		for (String arg : args) {
			br = initReader(arg);
			while ((line = br.readLine()) != null) {
				processWords(line, map);
			}
		}
		System.out.println(map.toString());
		long endTime = System.currentTimeMillis();
		System.out.println("Execution Time (ms): " + (endTime - startTime));
	}
	
	private static BufferedReader initReader(String filename) {
		File file = new File(filename);
		try {
			return new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static void processWords(String line, Map<String, Integer> map) {
		String[] words = line.split(" ");
		for (String word : words) {
			if (map.get(word) != null) {
				map.put(word,  map.get(word) + 1);
			} else {
				map.put(word,  1);
			}
		}
	}
}
