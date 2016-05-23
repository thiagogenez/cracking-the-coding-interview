package q1_Is_Unique;

public class Tester {

    public static void main(String[] args) {
	String[] words = { "abcde", "hello", "apple", "kite", "padle" };
	for (String word : words) {
	    boolean wordA = QuestionA.containsUniqueChars(word);
	    boolean wordB = QuestionB.containsUniqueChars(word);
	    if (wordA == wordB) {
		System.out.println(word + ": " + wordA);
	    } else {
		System.out.println(word + ": " + wordA + " vs " + wordB);
	    }
	}
    }
}
