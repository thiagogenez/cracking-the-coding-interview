package q5_Sum_Lists;

import util.LinkedListNode;
import util.Methods;

public class QuestionB {

    public static LinkedListNode<Integer> add(LinkedListNode<Integer> num1,
	    LinkedListNode<Integer> num2, int carry) {

	if (num1 == null && num2 == null && carry == 0) {
	    return null;
	}

	int sum = carry;
	if (num1 != null) {
	    sum += num1.value;
	    num1 = num1.next;
	}

	if (num2 != null) {
	    sum += num2.value;
	    num2 = num2.next;
	}

	LinkedListNode<Integer> node = new LinkedListNode<Integer>(sum % 10);
	node.next = add(num1, num2, sum / 10);

	return node;

    }

    public static LinkedListNode<Integer> sum(LinkedListNode<Integer> num1,
	    LinkedListNode<Integer> num2) {
	LinkedListNode<Integer> res = add(num1, num2, 0);
	return res;

    }

    public static void main(String[] args) {

	Integer[] array = { 9 };
	LinkedListNode<Integer> num1 = Methods.createLinkedListFromArray(array);

	Integer[] array2 = { 9, 9, 9 };
	LinkedListNode<Integer> num2 = Methods
		.createLinkedListFromArray(array2);

	System.out.println(num1.printForward());
	System.out.println(num2.printForward());
	LinkedListNode<Integer> sum = sum(num1, num2);
	System.out.println(sum.printForward());

    }
}
