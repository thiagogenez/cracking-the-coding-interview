package q1_Remove_Dups;

import util.LinkedListNode;

public class QuestionA {

    public static <T> LinkedListNode<T> remove(LinkedListNode<T> node, T value) {

	if (node != null) {
	 
	    node.next = remove(node.next, value);
	    
	    if(node.value.equals(value)){
		 return node.next;
	    }
	    
	    return node;
	    
	}
	return null;
    }
    
    public static <T> void deleteDups(LinkedListNode<T> node){
	LinkedListNode<T> aux = node;
	while(aux != null){
	    node = remove(aux, aux.value);
	    aux = aux.next;
	}
    }
    

    public static void main(String[] args) {
	LinkedListNode<Integer> first = new LinkedListNode<Integer>(0);
	LinkedListNode<Integer> head = first;
	LinkedListNode<Integer> node;
	for (int i = 1; i < 20; i++) {
		node = new LinkedListNode<Integer>(i % 6);
		node.insertFront(head);
		head = node;
	}
	
	
	System.out.println(head.printForward());
	deleteDups(head);
	System.out.println(head.printForward());

    }

}
