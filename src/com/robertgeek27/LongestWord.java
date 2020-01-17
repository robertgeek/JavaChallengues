import java.util.Arrays;
import java.util.Comparator;

/**
 * @author robertgeek27
 *
 */
public class LongestWord {

	public static void main(String[] args) {
		String[] test = { "test", "tester", "Phenomenologically", "testertest", "testing", 
				          "TestingTester","testingtester" };
		String[] test2 = { "Record", "Recordar", "ar" };

		// Make the test of arrays of words.
		System.out.println(longestSurString(test));
	}

	
	public static String longestSurString(String[] words) {
		//Ordering the array with the class order words implements Comparator.
		Arrays.sort(words, new OrderWords());

		/**
		 * First compare the firs word and verify if this word is different for himself
		 * and this word is contains in the other word If it is true take us this word
		 * and replace for "" for try to match the rest of word.
		 */
		for (String word : words) {
			String actualWord = word;
			for (String compareWord : words) {
				System.out.println("Valor Actual Palabra: " + actualWord);
				System.out.println("Valor Compare Palabra: " + compareWord);
				System.out.println("Valor Word " + word + "\n-----");
				if (!compareWord.equals(actualWord) && word.contains(compareWord)) {
					word = word.replace(compareWord, "");
					System.out.println("Word " + word);
				}
			}
			
			
			/**
			 * If word don´t have lenght is because we have the word and is the actualWord
			 * only compare if the first ocurrence is with Upper Case
			 */
			if (word.length() == 0) {
				for (String string : words) {
					if (actualWord.compareToIgnoreCase(string) == 0) {
						return string;
					}
				}
			}
		}
		
		return null;
	}
}
