package q2_Reverse;

public class QuestionA {

    public static String reverse(String string) {
	int i = 0;
	int j = string.length() - 1;
	char[] array = string.toCharArray();
	while (i < j) {
	    swap(array, i, j);
	    i++;
	    j--;
	}
	return String.valueOf(array);
    }

    private static void swap(char[] string, int i, int j) {
	char aux = string[i];
	string[i] = string[j];
	string[j] = aux;
    }

    public static void main(String[] args) {
	String[] strings = { "Thiago", "Genez" };
	for (String str : strings) {
	    System.out.println(
		    "reverse('" + str + "') =  " + QuestionA.reverse(str));
	}
    }
}
