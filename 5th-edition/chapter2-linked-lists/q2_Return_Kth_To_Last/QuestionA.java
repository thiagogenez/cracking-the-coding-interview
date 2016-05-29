package q2_Return_Kth_To_Last;

import util.LinkedListNode;

public class QuestionA {

    public static <T> int size(LinkedListNode<T> node) {
	if (node != null) {
	    return 1 + size(node.next);
	}
	return 0;
    }

    public static <T> T kthToLast(LinkedListNode<T> node, int k) {
	int size = size(node);
	int i = 0;
	while (node != null) {
	    if (size - i == k) {
		return node.value;
	    }
	    node = node.next;
	    i++;
	}
	return null;
    }

    public static void main(String[] args) {
	int[] array = { 0, 1, 2, 3, 4, 5, 6 };
	LinkedListNode<Integer> previous = new LinkedListNode<Integer>(-1);
	LinkedListNode<Integer> head = previous;
	LinkedListNode<Integer> current;
	for (int i = 0; i < array.length; i++) {
	    current = new LinkedListNode<Integer>(array[i]);
	    previous.setNext(current);
	    current.setPrevious(previous);
	    previous = current;
	}

	System.out.println(head.printForward());
	for (int i = 0; i < array.length; i++) {
	    System.out.println(i + "kh to last is " + kthToLast(head, i));
	}
    }
}
