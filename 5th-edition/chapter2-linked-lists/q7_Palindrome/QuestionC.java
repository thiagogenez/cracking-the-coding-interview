package q7_Palindrome;

import util.LinkedListNode;
import util.Methods;

public class QuestionC {

    public static <T> Wrapper<T> isPalindrome(LinkedListNode<T> head,
	    int length) {
	if (head == null || length == 0) {
	    return new Wrapper<T>(null, true);
	}

	if (length == 1) {
	    return new Wrapper<T>(head.next, true);
	}

	if (length == 2) {
	    return new Wrapper<T>(head.next.next,
		    head.value.equals(head.next.value));
	}

	Wrapper<T> current = isPalindrome(head.next, length - 2);

	if (!current.palindrome || current.runner == null) {
	    return current;
	}

	current.palindrome = current.runner.value.equals(head.value);
	current.runner = current.runner.next;

	return current;
    }

    public static void main(String[] args) {
	Integer[] array3 = { 0, 1, 2, 2, 1, 0 };
	LinkedListNode<Integer> word3 = Methods
		.createLinkedListFromArray(array3);

	int length = Methods.lengthIterative(word3);
	System.out.println("Is " + word3.printForward() + " a palindrome ? => "
		+ isPalindrome(word3, length).palindrome);

    }
}

class Wrapper<T> {
    public Wrapper(LinkedListNode<T> node, boolean b) {
	this.runner = node;
	this.palindrome = b;
    }

    LinkedListNode<T> runner;
    boolean palindrome;
}