package q3_Check_Permutation;

public class QuestionC {

    private static int createBitVector(String str) {
	int bitVector = 0;

	for (char c : str.toCharArray()) {
	    int value = c - 'a';
	    bitVector = toggle(bitVector, value);
	}

	return bitVector;
    }

    private static int toggle(int bitVector, int value) {
	if (value < 0)
	    return bitVector;

	int mark = 1 << value;

	if ((mark & bitVector) == 0) {
	    bitVector |= mark;
	} else {
	    bitVector &= ~mark;
	}

	return bitVector;
    }

    public static boolean isPermutation(String str1, String str2) {
	if (str1.length() != str2.length()) {
	    return false;
	}

	int bitVector1 = createBitVector(str1);
	int bitVector2 = createBitVector(str2);

	return (bitVector1 & ~bitVector2) == 0;

    }

    // non-unique letters only
    public static void main(String[] args) {
	String[][] strings = { { "Thiago", "agoihT" }, { "abcdefg", "abcdwrt" },
		{ "abcdefg", "efgabcd" } };

	for (String[] str : strings) {
	    System.out.println("'" + str[0] + "' is permutation of '" + str[1]
		    + "' => " + QuestionC.isPermutation(str[0], str[1]));
	}
    }
}
