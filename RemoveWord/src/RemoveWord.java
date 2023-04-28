package com.java;

public class RemoveWord {

	public static void main(String[] args) {
		String phrase = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String removeWord = "avoidable";
        
        // Remove the removeWord from the phrase
        String result = phrase.replaceAll("\\b" + removeWord + "\\b", "");
        
        System.out.println("Phrase after removing the word '" + removeWord + "':");
        System.out.println(result);
    

	}

}
