package q3_Stack_Of_Plates;

import java.util.LinkedList;

import util.Stack;

public class SetOfStacks<T> {

    private LinkedList<Stack<T>> stacks;

    private int capacity;

    public SetOfStacks(int threshold) {
	stacks = new LinkedList<>();
	this.capacity = threshold;
    }

    private Stack<T> getLastStack() {
	if (stacks.isEmpty()) {
	    return null;
	}
	return stacks.getLast();
    }

    private Stack<T> getStack(int stack) {
	if (stack >= stacks.size() || stack < 0) {
	    return null;
	}
	return stacks.get(stack);
    }

    public void push(T value) {
	Stack<T> current = getLastStack();

	if (current != null && !current.isFull()) {
	    current.push(value);
	} else {

	    Stack<T> stack = new Stack<T>(this.capacity);
	    stack.push(value);
	    stacks.addLast(stack);
	}
    }

    public T popAt(int index) {
	Stack<T> current = getStack(index);
	if (index >= stacks.size()) {
	    throw new RuntimeException("Invalid stack");
	}
	T value = current.pop();

	leftShift(index);

	return value;
    }

    /*
     * I avoid to "break" the stack constraint like removing the bottom of a
     * stack. Because of this, more "work" need to be done.
     * 
     */
    private void leftShift(int index) {

	if (index + 1 < stacks.size()) {
	    Stack<T> current = getStack(index);
	    Stack<T> next = getStack(index + 1);

	    // A queue can be used instead of the tmp stack.
	    Stack<T> tmp = new Stack<>();
	    
	    while (next.size() > 1) {
		T value = next.pop();
		tmp.push(value);
	    }

	    T last = next.pop();
	    current.push(last);

	    while (!tmp.isEmpty()) {
		T value = tmp.pop();
		next.push(value);
	    }

	    if (next.isEmpty()) {
		stacks.remove(next);
	    } else {
		leftShift(index + 1);
	    }
	}

    }

    public T pop() {
	Stack<T> current = getLastStack();
	if (current == null) {
	    throw new RuntimeException("Empty set of stacks");
	}

	T value = current.pop();

	if (current.isEmpty()) {
	    stacks.removeLast();
	}

	return value;
    }

    public T peek() {
	Stack<T> current = getLastStack();
	if (current == null) {
	    throw new RuntimeException("Empty set of stacks");
	}

	return current.peek();
    }

    public String printSetOfStacks() {
	StringBuilder builder = new StringBuilder();
	for (int i = 0; i < stacks.size(); i++) {
	    builder.append("Stack " + i + " => [ " + stacks.get(i).printStack()
		    + "]\n");
	}

	return builder.toString();
    }

    public String printCurrentStack() {
	StringBuilder builder = new StringBuilder();
	Stack<T> stack = getLastStack();
	if (stack != null)
	    builder.append("[ " + stack.printStack() + "]");

	return builder.toString();
    }

}
