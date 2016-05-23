package q1_Is_Unique;

public class QuestionA {

    /**
     * Determinate if a string has all unique characters.
     * 
     * @param string
     *            to be checked
     * @return true if the string has all unique characters; false, otherwise
     */
    public static boolean containsUniqueChars(String string) {
	if (string.length() > 256) {
	    return false;
	}

	boolean[] charSet = new boolean[128];

	for (int i = 0; i < string.length(); i++) {
	    int value = string.charAt(i);
	    if (charSet[value]) {
		return false;
	    }
	    charSet[value] = true;
	}

	return true;
    }

    public static void main(String[] args) {
	String[] strings = { "banana", "abcde", "a", "", "thiago" };

	for (String string : strings) {
	    System.out.println("String '" + string + "' contains unique chars: "
		    + QuestionA.containsUniqueChars(string));
	}
    }
}
