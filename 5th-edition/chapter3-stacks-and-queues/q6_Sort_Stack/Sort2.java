package q6_Sort_Stack;

import util.Stack;

public class Sort2 {
    
    // complexity time: O(n^2)
    // complexity space: O(n)
    public static void sort(Stack<Integer> stack) {
	Stack<Integer> aux = new Stack<>(stack.size());

	while (!stack.isEmpty()) {

	    int tmp = stack.pop();
	    while (!aux.isEmpty() && tmp > aux.peek()) {
		stack.push(aux.pop());
	    }

	    aux.push(tmp);
	}

	/* Copy the elements back. */
	while (!aux.isEmpty()) {
	    stack.push(aux.pop());
	}
    }
}
