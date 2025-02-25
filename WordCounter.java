import java.util.Scanner;

public class WordCounter {
    
    public static String getSentenceInput() {  //Method to get the user's sentence 
    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String sentence = scanner.nextLine();
		return sentence;
	}

	public static int countWords(String sentence) {  //Method to count the words given by the user
	    String[] words = sentence.split("\\s+");  //Used a split method
	    return words.length;  //Return the number of words
	    
	}
	
	public static void main(String[] args) {
	    String sentence = getSentenceInput();
	    int countWord = countWords(sentence);
	    System.out.println("The sentence has " + countWord + " words.");  //Print out the result
	}
}
