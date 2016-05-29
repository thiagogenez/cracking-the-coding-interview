package q2_Return_Kth_To_Last;

import util.LinkedListNode;

public class QuestionB {

    public static <T> T kthToLast(LinkedListNode<T> node, int k) {
	LinkedListNode<T> runner1 = node;
	LinkedListNode<T> runner2 = node;

	for (int i = 0; i < k ; i++) {
	    runner1 = runner1.next;
	    if (runner1 == null) {
		return null;
	    }
	}

	while (runner1 != null) {
	    runner1 = runner1.next;
	    runner2 = runner2.next;
	}

	
	return runner2.value;
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
	for (int i = 1; i < array.length; i++) {
	    System.out.println(i + "kh to last is " + kthToLast(head, i));
	}
    }
}
