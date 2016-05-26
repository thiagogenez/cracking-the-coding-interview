package q3_Check_Permutation;

public class QuestionA {

    public static boolean isPermutation(String str1, String str2) {

	if (str1.length() != str2.length()) {
	    return false;
	}

	int asciiTable[] = new int[256]; // assumption

	for (int i = 0; i < str1.length(); i++) {
	    asciiTable[str1.charAt(i)]++;
	    asciiTable[str2.charAt(i)]--;
	}

	for (int i = 0; i < 256; i++) {
	    if (asciiTable[i] > 0) {
		return false;
	    }
	}

	return true;
    }

    public static void main(String[] args) {
	String[][] strings = { { "Thiago", "agoihT" },
		{ "subi no onibus", "onibus on ibus" }, { "banana", "bamama" } };

	for (String[] str : strings) {
	    System.out.println("'"+str[0]+"' is permutation of '"+str[1]+"' => "
		    + QuestionA.isPermutation(str[0], str[1]));
	}
    }
}
