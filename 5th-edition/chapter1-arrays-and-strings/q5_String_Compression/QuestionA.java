package q5_String_Compression;

public class QuestionA {

    public static String compress(String str) {
	StringBuilder compressed = new StringBuilder(str.length());

	int i = 0, counter = 0;
	char c = ' ';
	while (i < str.length()) {
	    
	    c = str.charAt(i);
	    counter = 0;
	    
	    while (i < str.length() && str.charAt(i) == c) {
		counter++;
		i++;
	    }
	    compressed.append(c);
	    compressed.append(counter);

	}
	
	if (str.length() > compressed.length())
	    return compressed.toString();
	
	return str;
    }

    public static void main(String[] args) {
	String[] strings = { "aabbcc", "abbbc", "abc", "aabcccccaaa", "aaaaaaaaaaaaaaaaaaaaa", "abcdefghi", "a" };

	for (String s : strings) {
	    System.out.println(s + " => " + QuestionA.compress(s));
	}
    }
}
