package q1_Remove_Dups;

import util.LinkedListNode;

public class QuestionB {

    public static <T> void remove(LinkedListNode<T> node) {
	if (node != null) {
	    LinkedListNode<T> previous = node;
	    LinkedListNode<T> current = previous.next;
	    T value = node.value;
	    while (current != null) {
		if (current.value.equals(value)) {
		    previous.next = current.next;
		} else {
		    previous = current;
		}

		current = current.next;
	    }

	}
    }

    public static <T> void deleteDups(LinkedListNode<T> node) {
	LinkedListNode<T> current = node;
	while (current != null) {
	    remove(current);
	    current = current.next;
	}
    }

    public static void main(String[] args) {
	LinkedListNode<Integer> first = new LinkedListNode<Integer>(0);
	LinkedListNode<Integer> head = first;
	LinkedListNode<Integer> node;
	for (int i = 1; i < 20; i++) {
	    node = new LinkedListNode<Integer>(i % 3);
	    node.insertFront(head);
	    head = node;
	}

	System.out.println(head.printForward());
	deleteDups(head);
	System.out.println(head.printForward());

    }
}
