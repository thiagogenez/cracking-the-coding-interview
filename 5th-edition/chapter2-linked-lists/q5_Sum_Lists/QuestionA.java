package q5_Sum_Lists;

import util.LinkedListNode;
import util.Methods;

public class QuestionA {

    public static LinkedListNode<Integer> sum(LinkedListNode<Integer> num1,
	    LinkedListNode<Integer> num2) {

	LinkedListNode<Integer> head = null;
	LinkedListNode<Integer> tail = null;
	int carry = 0, sum = 0;

	while (num1 != null || num2 != null) {
	    sum = carry;
	    
	    if(num1 != null){
		sum += num1.value;
		num1 = num1.next;
	    }
	    
	    if(num2 != null){
		sum += num2.value;
		num2 = num2.next;
	    }
	    
	    carry = sum / 10;

	    LinkedListNode<Integer> node = new LinkedListNode<Integer>( sum % 10);
	    if (head == null) {
		head = node;
		tail = node;
	    } else {
		tail.next = node;
		tail = node;
	    }

	}


	if (carry == 1) {
	    LinkedListNode<Integer> node = new LinkedListNode<Integer>(1);
	    tail.next = node;
	    tail = node;
	}

	return head;
    }

    public static void main(String[] args) {

	Integer[] array = { 7,1,6 };
	LinkedListNode<Integer> num1 = Methods.createLinkedListFromArray(array);

	Integer[] array2 = { 5,9,2 };
	LinkedListNode<Integer> num2 = Methods
		.createLinkedListFromArray(array2);

	System.out.println(num1.printForward());
	System.out.println(num2.printForward());
	LinkedListNode<Integer> sum = sum(num1, num2);
	System.out.println(sum.printForward());

    }

}
