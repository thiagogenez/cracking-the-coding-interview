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
	LinkedListNode<Integer> previous = new LinkedListNode<Integer>(0);
	LinkedListNode<Integer> head = previous;
	LinkedListNode<Integer> current;
	for (int i = 1; i < 20; i++) {
		current = new LinkedListNode<Integer>(i % 10);
		current.setPrevious(previous);
		previous.setNext(current);
		
		previous = current;
	}
	
	System.out.println(head.printForward());
	deleteDups(head);
	System.out.println(head.printForward());

    }
}
