package q2_Return_Kth_To_Last;

import util.LinkedListNode;

public class QuestionC {

    static int position = 0; // Ugly, I know

    public static <T> LinkedListNode<T> kthToLast(LinkedListNode<T> node,
	    int k) {
	if (node == null) {
	    return null;
	}

	LinkedListNode<T> aux = kthToLast(node.next, k);
	position++;

	if (position == k) {
	    return node;
	}
	return aux;
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
	    position = 0;
	    System.out.println(i + "kh to last is " + kthToLast(head, i).value);
	}
    }
}
