package q4_Partition;

import util.LinkedListNode;

public class QuestionA {

    public static LinkedListNode<Integer> partition(
	    LinkedListNode<Integer> node, int value) {

	LinkedListNode<Integer> headLeft = null;
	LinkedListNode<Integer> tailLeft = null;
	LinkedListNode<Integer> headRight = null;
	LinkedListNode<Integer> tailRight = null;

	LinkedListNode<Integer> next = null;

	while (node != null) {
	    next = node.next;
	    node.next = null;
	    node.previous = null;

	    if (node.value <= value) {
		if (headLeft == null) {
		    headLeft = node;
		    tailLeft = node;
		} else {
		    tailLeft.next = node;
		    tailLeft = node;
		}

	    } else {
		if (headRight == null) {
		    headRight = node;
		    tailRight = node;
		} else {
		    tailRight.next = node;
		    tailRight = node;
		}

	    }

	    node = next;
	}

	if (headLeft == null) {
	    return headRight;
	} 
	
	tailLeft.next = headRight;

	return headLeft;
    }

    public static void main(String[] args) {
	int[] array = { 33, 9, 2, 3, 10, 10389, 838, 874578, 5 };
	LinkedListNode<Integer> previous = new LinkedListNode<Integer>(8);
	LinkedListNode<Integer> head = previous;
	LinkedListNode<Integer> current;
	for (int i = 0; i < array.length; i++) {
	    current = new LinkedListNode<Integer>(array[i]);
	    previous.setNext(current);
	    previous = current;
	}

	System.out.println(head.printForward());
	head = partition(head, 1000);
	System.out.println(head.printForward());
    }
}
