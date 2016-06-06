package q7_Palindrome;

import util.LinkedListNode;
import util.Methods;

public class QuestionA {

    public static <T> boolean isPalindrome(LinkedListNode<T> head) {
	LinkedListNode<T> cloned = Methods.reverseAndClone(head);

	return isEqual(head, cloned);
    }

    private static <T> boolean isEqual(LinkedListNode<T> head,
	    LinkedListNode<T> cloned) {

	while (head != null && cloned != null) {
	    if (!head.value.equals(cloned.value)) {
		return false;
	    }
	    head = head.next;
	    cloned = cloned.next;
	}

	return head == null && cloned == null;
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
	
    }
}
