package util;

public class Methods {

    public static <T> LinkedListNode<T> createLinkedListFromArray(T[] array) {
	LinkedListNode<T> previous = new LinkedListNode<T>(array[0]);
	LinkedListNode<T> head = previous;
	LinkedListNode<T> current;
	for (int i = 1; i < array.length; i++) {
	    current = new LinkedListNode<T>(array[i]);
	    previous.next = current;
	    previous = current;
	}
	return head;
    }
    
    public static <T> LinkedListNode<T> getTail(LinkedListNode<T> head){
	while(head!= null && head.next != null){
	    head = head.next;
	}
	return head;
		
    }

    public static <T> LinkedListNode<T> reverseIterative(
	    LinkedListNode<T> head) {

	LinkedListNode<T> next = null;
	LinkedListNode<T> previous = null;
	while (head != null) {
	    next = head.next;
	    head.next = previous;
	    previous = head;
	    head = next;
	}
	return previous;
    }

    public static <T> LinkedListNode<T> reverseRecursive(
	    LinkedListNode<T> head) {
	return reverseRecursive(null, head);
    }

    private static <T> LinkedListNode<T> reverseRecursive(
	    LinkedListNode<T> previous, LinkedListNode<T> head) {

	if (head != null) {
	    LinkedListNode<T> next = head.next;
	    head.next = previous;

	    return reverseRecursive(head, next);
	}

	return previous;
    }

    public static <T> int lengthIterative(LinkedListNode<T> head) {
	int size = 0;

	while (head != null) {
	    size++;
	    head = head.next;
	}

	return size;
    }

    public static <T> int lengthRecursive(LinkedListNode<T> node) {
	if (node != null) {
	    return 1 + lengthRecursive(node.next);
	}
	return 0;
    }
}
