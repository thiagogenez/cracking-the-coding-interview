package q6_Sort_Stack;

import util.Stack;

public class Question {


    public static void main(String[] args) {
	
	
	Stack<Integer> s = new Stack<Integer>();
	int[] array = {5,4,3,2,1,1,2,3,4,5};
	for (int value : array) {
	    s.push(value);
	}
	
	System.out.println("before: "+s.printStack());
	Sort.sort(s);
	System.out.println("after: "+s.printStack());

    }
}
