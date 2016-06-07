package q7_Palindrome;

import java.util.Stack;

import util.LinkedListNode;
import util.Methods;

public class QuestionB {

    public static <T> boolean isPalindrome(LinkedListNode<T> head) {
	int length = Methods.lengthIterative(head);

	Stack<T> stack = new Stack<T>();

	for (int i = 0; i < length / 2; i++) {
	    stack.push(head.value);
	    head = head.next;
	}
	if (length % 2 == 1) {
	    head = head.next;
	}
	for (int i = 0; i < length / 2; i++) {
	    T item = stack.pop();
	    if (item.equals(head.value)) {
		head = head.next;
	    } else {
		return false;
	    }
	}

	return true;
    }

    public static void main(String[] args) {
	Character[] array = { 'r', 'o', 't', 'a', 't', 'o', 'r' };
	LinkedListNode<Character> word1 = Methods
		.createLinkedListFromArray(array);

	System.out.println("Is " + word1.printForward() + " a palindrome ? => "
		+ isPalindrome(word1));

	Character[] array2 = { 'R', 'O', 'M', 'A', 'R' };
	LinkedListNode<Character> word2 = Methods
		.createLinkedListFromArray(array2);

	System.out.println("Is " + word2.printForward() + " a palindrome ? => "
		+ isPalindrome(word2));

	Integer[] array3 = { 0, 1, 2, 3, 4, 3, 2, 1, 0 };
	LinkedListNode<Integer> word3 = Methods
		.createLinkedListFromArray(array3);

	System.out.println("Is " + word3.printForward() + " a palindrome ? => "
		+ isPalindrome(word3));

    }
}
