package q1_Remove_Dups;

import util.LinkedListNode;

public class QuestionC {

    public static <T> void remove(LinkedListNode<T> node) {
	if (node != null) {
	    LinkedListNode<T> runner = node;
	    T value = node.value;

	    while (runner.next != null) {

		if (runner.next.value.equals(value)) {
		    runner.next = runner.next.next;
		} else {
		    runner = runner.next;
		}
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
	    node = new LinkedListNode<Integer>(i % 1);
	    node.insertFront(head);
	    head = node;
	}

	System.out.println(head.printForward());
	deleteDups(head);
	System.out.println(head.printForward());

    }
}
