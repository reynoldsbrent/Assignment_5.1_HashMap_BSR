import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		WordDictionary dictionary = new WordDictionary();
	
		
		File wordsAndDefs = new File("DictionaryWordValuePairs.txt");
		
		Scanner input = new Scanner(wordsAndDefs);
		
		dictionary.add(input);
		
		System.out.println("Unsorted dictionary keys and definitions: " + dictionary.printHashMap());
		
		dictionary.printHashMap();
		System.out.println("---------------------------------------------");
		System.out.println("Five searched words: ");
		
		System.out.println(dictionary.getWordDefinitionandHashKey("fain"));
		System.out.println("---------------------------------------------");
		System.out.println(dictionary.getWordDefinitionandHashKey("damsel"));
		System.out.println("---------------------------------------------");
		System.out.println(dictionary.getWordDefinitionandHashKey("cutpurse"));
		System.out.println("---------------------------------------------");
		System.out.println(dictionary.getWordDefinitionandHashKey("wain"));
		System.out.println("---------------------------------------------");
		System.out.println(dictionary.getWordDefinitionandHashKey("timbrel"));


	}

}
