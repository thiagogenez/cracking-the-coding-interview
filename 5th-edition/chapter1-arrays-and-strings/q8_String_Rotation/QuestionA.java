package q8_String_Rotation;

public class QuestionA {

    public static boolean isRotation(String original, String rotated) {
	
	if(original.length() != rotated.length())
	    return false;
		
	StringBuilder str1str1 = new StringBuilder(original);
	str1str1.append(original);

	return isSubstring(str1str1.toString(), rotated);

    }

    private static boolean isSubstring(String str1, String str2) {
	return str1.contains(str2);
    }

    public static void main(String[] args) {
	String[][] pairs = { { "apple", "pleap" }, 
		{ "waterbottle", "erbottlewat" }, { "camera", "macera" } };
	for (String[] pair : pairs) {
	    String word1 = pair[0];
	    String word2 = pair[1];
	    boolean is_rotation = isRotation(word1, word2);
	    System.out.println(word1 + ", " + word2 + ": " + is_rotation);
	}
    }
}
