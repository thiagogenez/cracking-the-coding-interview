package q5_Sum_Lists;

import util.LinkedListNode;
import util.Methods;

public class QuestionD {

    
    public static LinkedListNode<Integer> sum(LinkedListNode<Integer> num1,
	    LinkedListNode<Integer> num2) {
	num1 = Methods.reverseIterative(num1);
	num2 = Methods.reverseIterative(num2);
	LinkedListNode<Integer> res = Methods.reverseRecursive(QuestionB.sum(num1, num2));
	return res;
    }

    
    public static void main(String[] args) {
  	Integer[] array = { 1, 2, 9, 9 };
  	LinkedListNode<Integer> num1 = Methods.createLinkedListFromArray(array);

  	Integer[] array2 = { 9, 9, 8 };
  	LinkedListNode<Integer> num2 = Methods
  		.createLinkedListFromArray(array2);

  	System.out.println(num1.printForward());
	System.out.println(num2.printForward());
	
	
	LinkedListNode<Integer> res = sum(num1, num2);
	
	System.out.println(res.printForward());
      }
}
