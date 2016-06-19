package q6_Sort_Stack;

import util.Stack;

public class Sort {

    private static int min(Stack<Integer> stack, Stack<Integer> aux,
	    int length) {
	int min = Integer.MAX_VALUE;
	while (stack.size() - length > 0) {
	    Integer poped = stack.pop();

	    if (poped < min) {
		min = poped;
	    }
	    aux.push(poped);
	}

	return min;
    }

    // complexity time: O(n^2)
    // complexity space: O(n)
    public static void sort(Stack<Integer> stack) {
	Stack<Integer> aux = new Stack<>(stack.size());

	for (int i = 0; i < stack.size(); i++) {
	    // stack from 0..i
	    // is already ordered
	    int min = min(stack, aux, i);
	    stack.push(min);

	    while (!aux.isEmpty()) {
		int poped = aux.pop();
		if (poped == min) {
		    min = Integer.MAX_VALUE;
		    continue;
		}
		stack.push(poped);
	    }
	}

    }
}
