package q5_String_Compression;

public class QuestionB {

    public static String compress(String str) {
	int sizeCompressed = countCompression(str);
	
	if(sizeCompressed >= str.length())
	    return str;
	
	char []compressed = new char[sizeCompressed];
	
	int i = 0, counter = 0, j = 0;
	char c = ' ';
	while (i < str.length()) {
	    
	    c = str.charAt(i);
	    counter = 0;
	    
	    while (i < str.length() && str.charAt(i) == c) {
		counter++;
		i++;
	    }
	    
	    j = setChar(compressed, c, counter, j);
	}
	
	
	return String.valueOf(compressed);
    }
    
    private static int setChar(char[] compressed, char c, int counter, int position) {
	compressed[position++] = c;
	
	char s[] = Integer.toString(counter).toCharArray();
	for (int i = 0; i < s.length; i++) {
	    compressed[position++] = s[i];
	}
	
	return position;
    }

    public static int countCompression(String str){
	int size = 0, i = 0, counter = 0;
	char last = ' ';
	
	while(i < str.length()){
	    last = str.charAt(i);
	    counter = 0;
	    while(i < str.length() && str.charAt(i) == last){
		i++;
		counter++;
	    }
	    
	    size += 1;
	    size += String.valueOf(counter).length();
	}	
	return size;
    }
    
    public static void main(String[] args) {
  	String[] strings = { "aabbcc", "abbbc", "abc", "aabcccccaaa", "aaaaaaaaaaaaaaaaaaaaa", "abcdefghi", "a" };

  	for (String s : strings) {
  	    System.out.println(s + " => " + QuestionB.compress(s));
  	}
      }
}
