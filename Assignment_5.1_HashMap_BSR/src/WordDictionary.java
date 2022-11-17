import java.util.HashMap;
import java.util.Scanner;

/** This class contains all the methods that will be used to search for definitions of archaic words
 * @author brentreynolds
 * @version Fall 2022
 */
public class WordDictionary {
	
	private HashMap<String, String> wordDefinitionPair;
	
	private String archaicDef;
	
	private String archaicWord;
	
	/**
	 * No argument constructor
	 */
	public WordDictionary() {
		wordDefinitionPair = new HashMap<String, String> ();
		
	}
	
	/**
	 * This method reads the word value pairs file and adds each pair to the HashMap
	 * @param input the words and definition pairs
	 */
	public void add(Scanner input) {
		
		while(input.hasNext()) {
			
			String word = input.next();
			String definition = input.nextLine();
			word.hashCode();
			definition.hashCode();
			
			wordDefinitionPair.put(word, definition);
		}
	}

	/**
	 * This method returns the word's definition and hashkey given the word as a parameter
	 * @param word the word that the user wants to find the definition for
	 * @return the definition of the word passed in by the calling method and its hashkey
	 */
	public String getWordDefinitionandHashKey(String word) {
		return "Word: " + word + "\n Definition: " + wordDefinitionPair.get(word) + "\n Hashkey: " + word.hashCode();
	}
	
	/**
	 * This method prints out the HashMap horizontally
	 * @return the HashMap with word definition pairs
	 */
	public HashMap<String, String> printHashMap(){
		return wordDefinitionPair;
	}
	
	/**
	 * Prints out the HashMap vertically with word definition pairs
	 */
	public void print() {
		for(String word : wordDefinitionPair.keySet()) {
			System.out.println(word + " = " + wordDefinitionPair.get(word));
		}
	}
}
