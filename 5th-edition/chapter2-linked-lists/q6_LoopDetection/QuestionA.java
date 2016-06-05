package q6_LoopDetection;

import javafx.scene.control.Tab;
import util.LinkedListNode;
import util.Methods;

public class QuestionA {

    public static <T> LinkedListNode<T> loopBeggining(LinkedListNode<T> head) {

	LinkedListNode<T> slower = head;
	LinkedListNode<T> faster = head;

	// finding meeting point
	while (faster != null && faster.next != null) {
	    faster = faster.next.next;
	    slower = slower.next;
	    if (slower == faster) {
		break;
	    }
	}

	// linked-list does not have a loop, then no meeting point
	if (slower != faster) {
	    return null;
	}

	slower = head;
	while (slower != faster) {
	    slower = slower.next;
	    faster = faster.next;
	}

	return faster;
    }

    public static void main(String[] args) {
	Integer[] before = { 1, 2, 3, 4, 5, 6, 7, -1, -2, -3 };
	LinkedListNode<Integer> B = Methods.createLinkedListFromArray(before);

	Integer[] loop = { 8 };
	LinkedListNode<Integer> L = Methods.createLinkedListFromArray(loop);

	Integer[] after = { 9, 10, 11};
	LinkedListNode<Integer> A = Methods.createLinkedListFromArray(after);

	LinkedListNode<Integer> tail_B = Methods.getTail(B);
	LinkedListNode<Integer> tail_A = Methods.getTail(A);

	System.out.println(loopBeggining(B));

	tail_B.next = L;
	L.next = A;
	tail_A.next = L;

	System.out.println(loopBeggining(B));
    }

}
