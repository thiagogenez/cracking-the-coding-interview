package q1_Remove_Dups;

import util.LinkedListNode;

public class QuestionB {

    public static <T> void remove(LinkedListNode<T> current) {
	if (current != null) {
	    LinkedListNode<T> previous = current;
	    T value = current.value;
	    
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
	LinkedListNode<Integer> previous = new LinkedListNode<Integer>(0);
	LinkedListNode<Integer> head = previous;
	LinkedListNode<Integer> current;
	for (int i = 1; i < 20; i++) {
		current = new LinkedListNode<Integer>(i % 3);
		current.setPrevious(previous);
		previous.setNext(current);
		
		previous = current;
	}
	
	System.out.println(head.printForward());
	deleteDups(head);
	System.out.println(head.printForward());

    }
}
