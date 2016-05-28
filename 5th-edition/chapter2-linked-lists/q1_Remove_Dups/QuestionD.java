package q1_Remove_Dups;

import java.util.HashSet;
import java.util.Set;

import util.LinkedListNode;

public class QuestionD {

    public static <T> void deleteDups(LinkedListNode<T> node) {
	LinkedListNode<T> previous = null;
	Set<T> set = new HashSet<T>();
	while (node != null) {
	    if (set.contains(node.value)) {
		previous.next = node.next;
	    } else {
		set.add(node.value);
		previous = node;
	    }
	    node = node.next;
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
