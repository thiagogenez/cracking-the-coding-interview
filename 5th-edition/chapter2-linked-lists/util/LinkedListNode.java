package util;

public class LinkedListNode<T> {

    public T value;

    public LinkedListNode<T> next;

    public LinkedListNode<T> previous;

    public LinkedListNode(T value) {
	this.value = value;
	this.next = null;
	this.previous = null;
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

  

    public void setNext(LinkedListNode<T> node) {
	this.next = node;
	if (node != null && node.previous != this) {
	    node.setPrevious(this);
	}

    }

    public void setPrevious(LinkedListNode<T> node) {
	this.previous = node;
	if(node != null && node.next != this){
	    node.setNext(this);
	}
    }

    @Override
    public String toString() {
	return String.valueOf(value);
    }
}
