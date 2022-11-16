import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		WordDictionary dictionary = new WordDictionary();
		
		File wordsAndDefs = new File("DictionaryWordValuePairs.txt");
		
		Scanner input = new Scanner(wordsAndDefs);
		
		dictionary.add(input);
		
		System.out.println("Unsorted dictionary keys and definitions: ");
		
		dictionary.printHashMap();

	}

}
