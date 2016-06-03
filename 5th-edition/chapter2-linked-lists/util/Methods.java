package util;

public class Methods {

    public static <T> LinkedListNode<T> createLinkedListFromArray(T[] array) {
	LinkedListNode<T> previous = new LinkedListNode<T>(array[0]);
	LinkedListNode<T> head = previous;
	LinkedListNode<T> current;
	for (int i = 1; i < array.length; i++) {
	    current = new LinkedListNode<T>(array[i]);
	    previous.setNext(current);
	    previous = current;
	}
	return head;
    }
}
