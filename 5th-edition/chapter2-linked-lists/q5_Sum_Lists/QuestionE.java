package q5_Sum_Lists;

import util.LinkedListNode;
import util.Methods;

public class QuestionE {

    public static LinkedListNode<Integer> sum(LinkedListNode<Integer> num1,
	    LinkedListNode<Integer> num2) {

	int length1 = Methods.lengthIterative(num1);
	int length2 = Methods.lengthIterative(num2);

	if (length1 > length2) {
	    num2 = padding(num2, (length1 - length2), 0);
	} else if (length2 > length1) {
	    num1 = padding(num1, (length2 - length1), 0);
	}

	LinkedListNode<Integer> result = add(num1, num2);

	if (result.value >= 10) {
	    result.value = result.value % 10;
	    result = padding(result, 1, 1);
	}
	return result;

    }

    private static LinkedListNode<Integer> add(LinkedListNode<Integer> num1,
	    LinkedListNode<Integer> num2) {

	if (num1 != null && num2 != null) {

	    LinkedListNode<Integer> next = add(num1.next, num2.next);
	    int carry = 0;
	    if (next != null) {
		carry = next.value / 10;
		next.value = next.value % 10;
	    }

	    int sum = num1.value + num2.value + carry;
	    LinkedListNode<Integer> result = new LinkedListNode<Integer>(sum);
	    result.next = next;

	    return result;

	}

	return null;
    }

    private static LinkedListNode<Integer> padding(LinkedListNode<Integer> head,
	    int zeros, int value) {
	for (int i = 0; i < zeros; i++) {
	    head = insertFront(head, value);
	}
	return head;
    }

    private static LinkedListNode<Integer> insertFront(
	    LinkedListNode<Integer> list, int value) {
	LinkedListNode<Integer> node = new LinkedListNode<Integer>(value);
	if (list != null) {
	    node.next = list;
	}
	return node;
    }

    public static void main(String[] args) {
	Integer[] array = { 9, 9, 9 };
	LinkedListNode<Integer> num1 = Methods.createLinkedListFromArray(array);

	Integer[] array2 = { 9, 9 };
	LinkedListNode<Integer> num2 = Methods
		.createLinkedListFromArray(array2);

	System.out.println(num1.printForward());
	System.out.println(num2.printForward());

	LinkedListNode<Integer> res = sum(num1, num2);

	System.out.println(res.printForward());
    }
}
