package q6_Sort_Stack;

import util.Stack;

public class Question {


    public static void main(String[] args) {
	
	
	Stack<Integer> s = new Stack<Integer>();
	int[] array = {1,2,3,4,4,3,2,1};
	for (int value : array) {
	    s.push(value);
	}
	
	System.out.println("before: "+s.printStack());
	MergeSort.sort(s);
	System.out.println("after: "+s.printStack());

    }
}
