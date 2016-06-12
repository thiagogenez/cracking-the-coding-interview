package q2_Stack_Min;

import util.Stack;

public class MinStack<T extends Comparable<T>> extends Stack<T> {

    private Stack<T> minHead;

    public MinStack() {
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

   
}
