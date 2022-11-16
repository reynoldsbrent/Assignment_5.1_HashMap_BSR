import java.util.HashMap;
import java.util.Scanner;

public class WordDictionary {
	private HashMap<String, String> wordDefinitionPair;
	
	private String archaicDef;
	
	private String archaicWord;
	
	public WordDictionary() {
		wordDefinitionPair = new HashMap<String, String> ();
		
	}
	
	public void add(Scanner input) {
		while(input.hasNext()) {
			String word = input.next();
			String definition = input.nextLine();
			word.hashCode();
			definition.hashCode();
			
			wordDefinitionPair.put(word, definition);
		}
	}

	public String getWordDefinitionandHashKey(String word) {
		return "Word: " + word + "\n Definition: " + wordDefinitionPair.get(word) + "\n Hash key: " + word.hashCode();
	}
	
	public void printHashMap(){
		for(String word : wordDefinitionPair.keySet()) {
			System.out.println(word + " = " + wordDefinitionPair.get(word));
		}
	}
}
