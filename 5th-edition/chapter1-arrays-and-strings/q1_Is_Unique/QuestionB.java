package q1_Is_Unique;

public class QuestionB {

    /**
     * Determinate if a string has all unique characters.
     * 
     * @param string
     *            to be checked
     * @return true if the string has all unique characters; false, otherwise
     */
    public static boolean containsUniqueChars(String string) {

	int result = 0;

	if (string.length() < 0 || string.length() > 26) {
	    return false;
	}

	for (int i = 0; i < string.length(); i++) {
	    int value = string.charAt(i) - 'a';
	    int bit = (1 << value);
	    if ((bit & result) > 0) {
		return false;
	    }
	    result |= bit;
	}
	//System.out.println("string '" + string + "' => " + result);

	return true;
    }

    public static void main(String[] args) {
	String[] strings = { "banana", "abcde", "thiago", "aabb" };

	for (String string : strings) {
	    System.out.println("String '" + string + "' contains unique chars: "
		    + QuestionB.containsUniqueChars(string));
	}
    }
}
