package com.java;
import java.util.*;
public class WordParagraphFrequency2 {

	public static void main(String[] args) {
		String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        List<String> words = new LinkedList<>(Arrays.asList(paragraph.split(" ")));
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
