package q3_Check_Permutation;

import java.util.Arrays;

public class QuestionB {

    public static String sort(String str) {
	char[] array = str.toCharArray();
	Arrays.sort(array);
	return new String(array);
    }

    public static boolean isPermutation(String str1, String str2) {
	if (str1.length() != str2.length()) {
	    return false;
	}

	return sort(str1).equals(sort(str2));
    }

    public static void main(String[] args) {
	String[][] strings = { { "Thiago", "agoihT" },
		{ "subi no onibus", "onibus on ibus" },
		{ "banana", "bamama" } };

	for (String[] str : strings) {
	    System.out.println("'" + str[0] + "' is permutation of '" + str[1]
		    + "' => " + QuestionB.isPermutation(str[0], str[1]));
	}
    }

}
