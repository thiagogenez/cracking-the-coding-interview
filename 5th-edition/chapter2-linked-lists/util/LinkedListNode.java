package util;

public class LinkedListNode<T> {

    public T value;

    public LinkedListNode<T> next;

    public LinkedListNode(T value) {
	this.value = value;
    }

    public String printForward() {
	if (next != null) {
	    return String.valueOf(value) + "->" + next.printForward();
	} else {
	    return String.valueOf(value);
	}
    }

    public String printBackward() {
	if (next != null) {
	    return next.printBackward() + "<-" + String.valueOf(value);
	} else {
	    return String.valueOf(value);
	}
    }

    public void insertFront(LinkedListNode<T> node) {
	if (node != null) {
	    next = node;
	}
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
