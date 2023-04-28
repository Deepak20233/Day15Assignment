package com.java;
import java.util.*;
public class WordFrequency {

	public static void main(String[] args) {
		String sentence = "To be or not to be";
        List<String> words = new LinkedList<>(Arrays.asList(sentence.split(" ")));
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    
	}

}
