package util;

public class Queue<T> {

    private Node<T> top;

    public Queue() {
    }

    public boolean isEmpty() {
	return top == null;
    }

    public void push(T value) {
	Node<T> newNode = new Node<T>(value);
	if (top == null) {
	    top = newNode;
	} else {
	    newNode.next = top;
	    top = newNode;
	}
    }

    public T pop() {
	if (isEmpty()) {
	    throw new RuntimeException("Can't pop, stack is empty!!!");
	}

	T value = top.value;
	top = top.next;
	return value;
    }

    public T peek() {
	if (isEmpty()) {
	    throw new RuntimeException("Can't peek, stack is empty!!!");
	}
	return top.value;
    }
}
