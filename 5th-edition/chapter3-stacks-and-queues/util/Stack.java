package util;

public class Stack<T> {

    private Node<T> top;

    private int capacity;

    private int size;

    public Stack() {
	this.capacity = Integer.MAX_VALUE;
    }

    public Stack(int capacity) {
	this.capacity = capacity;
    }

    public boolean isEmpty() {
	return top == null;
    }

    public boolean isFull() {
	return size == capacity;
    }

    public void push(T value) {
	if (isFull()) {
	    throw new RuntimeException("Can't push, stack is full!!!");
	}

	Node<T> newNode = new Node<T>(value);
	if (top == null) {
	    top = newNode;
	} else {
	    newNode.next = top;
	    top = newNode;
	}

	size++;
    }

    public T pop() {
	if (isEmpty()) {
	    throw new RuntimeException("Can't pop, stack is empty!!!");
	}

	T value = top.value;
	top = top.next;

	size--;
	return value;
    }

    public T peek() {
	if (isEmpty()) {
	    throw new RuntimeException("Can't peek, stack is empty!!!");
	}
	return top.value;
    }

    private void printStack(StringBuilder builder, Node<T> node) {
	if (node != null) {
	    builder.append(node.value.toString() + " ");
	    printStack(builder, node.next);
	}
    }

    public String printStack() {
	StringBuilder builder = new StringBuilder();
	printStack( builder, top);
	
	return builder.toString();
    }
}
