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
	if (index >= stacks.size()) {
	    throw new RuntimeException("Invalid stack");
	}

	Stack<T> current = stacks.get(index);
	T value = current.pop();

	return value;
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
	    builder.append(
		    "[ " + stack.printStack() + "]");

	return builder.toString();
    }

}
