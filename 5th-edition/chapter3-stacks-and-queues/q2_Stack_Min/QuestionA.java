package q2_Stack_Min;

import util.Stack;

public class QuestionA<T extends Comparable<T>> extends Stack<T> {

    private Stack<T> minHead;

    public QuestionA() {
	minHead = new Stack<T>();
    }

    @Override
    public void push(T value) {
	if (minHead.isEmpty()) {
	    minHead.push(value);
	}

	else if (value.compareTo(minHead.peek()) < 0) {
	    minHead.push(value);
	}

	super.push(value);
    }

    @Override
    public T pop() {
	if (super.peek().equals(minHead.peek())) {
	    minHead.pop();
	}
	return super.pop();
    }

    public T min() {
	if (isEmpty()) {
	    return null;
	}

	return minHead.peek();
    }

    public static void main(String[] args) {

	QuestionA<Integer> stack = new QuestionA<>();
	int[] array = { -2, -3, 2, -5, 3, 0, 1 };
	for (int value : array) {
	    stack.push(value);
	    System.out.print(value + ", ");
	}
	System.out.println('\n');
	System.out.println("New min is " + stack.min());
	for (int i = 0; i < array.length; i++) {
	    if (!stack.isEmpty()) {
		System.out.println("Popped " + stack.pop());
		System.out.println("New min is " + stack.min());
	    }
	}
    }
}
