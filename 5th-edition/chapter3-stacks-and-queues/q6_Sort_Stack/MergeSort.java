package q6_Sort_Stack;

import util.Stack;

public class MergeSort {

    private static Stack<Integer> mergesort(Stack<Integer> stack) {
	if (stack.size() <= 1) {
	    return stack;
	}

	Stack<Integer> left = new Stack<>();
	Stack<Integer> right = new Stack<>();

	while (stack.size() > 0) {
	    if (stack.size() % 2 == 0) {
		left.push(stack.pop());
	    } else {
		right.push(stack.pop());
	    }
	}

	left = mergesort(left);
	right = mergesort(right);

	return merge(left, right, stack);
    }

    private static Stack<Integer> merge(Stack<Integer> left,
	    Stack<Integer> right, Stack<Integer> stack) {

	Stack<Integer> reverseStack = new Stack<Integer>();
	
	while (left.size() > 0 || right.size() > 0) {

	    if (left.size() == 0) {
		reverseStack.push(right.pop());
	    }

	    else if (right.size() == 0) {
		reverseStack.push(left.pop());
	    }

	    else if (left.peek() < right.peek()) {
		reverseStack.push(right.pop());
	    } else {
		reverseStack.push(left.pop());
	    }
	}
	
	
	while (reverseStack.size() > 0) {
		stack.push(reverseStack.pop());
	}

	return stack;
    }

    public static void sort(Stack<Integer> stack) {
	mergesort(stack);
    }
}
