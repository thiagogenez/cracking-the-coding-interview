package q3_Stack_Of_Plates;

public class Question {
    public static void main(String[] args) {
	int capacity = 5;
	SetOfStacks<Integer> set = new SetOfStacks<Integer>(capacity);
	for (int i = 0; i < 34; i++) {
	    set.push(i);
	}
	
	System.out.println(set.printSetOfStacks());
	for (int i = 0; i < 34; i++) {
	    System.out.println("Popped " + set.pop() + "\tCurrent Stack  => " +set.printCurrentStack());
	}
    }
}
