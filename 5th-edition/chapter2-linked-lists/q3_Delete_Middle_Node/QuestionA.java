package q3_Delete_Middle_Node;

import util.LinkedListNode;

public class QuestionA {

    public static <T> boolean remove(LinkedListNode<T> node) {
	if (node != null && node.next != null) {
	    node.value = node.next.value;
	    node.next = node.next.next;
	    node = node.next;
	    return true;
	}
	
	return false;
    }

    public static void main(String[] args) {
	int[] array = { 0, 1, 2, 3, 4, 5, 6 };
	LinkedListNode<Integer> previous = new LinkedListNode<Integer>(-1);
	LinkedListNode<Integer> head = previous;
	LinkedListNode<Integer> current;
	for (int i = 0; i < array.length; i++) {
	    current = new LinkedListNode<Integer>(array[i]);
	    previous.setNext(current);
	    previous = current;
	}

	System.out.println(head.printForward());
	System.out.println("removing "+head.next.next.value);
	remove(head.next.next);
	System.out.println(head.printForward());
	
	System.out.println("removing "+head.next.next.value);
	remove(head.next.next);
	System.out.println(head.printForward());
	
	System.out.println("removing "+head.next.next.next.value);
	remove(head.next.next.next);
	System.out.println(head.printForward());
    }
}
