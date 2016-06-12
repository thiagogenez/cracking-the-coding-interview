package q1_Three_Queue_in_One_Array;

public class Question {
    public static void main(String[] args) {
	FixedArrayStack<Integer> stack = new FixedArrayStack<Integer>(3);

	stack.push(1, 0);
	stack.push(1, 1);
	stack.push(1, 2);

	stack.push(2, 0);
	stack.push(2, 1);
	stack.push(2, 2);

	System.out.println(stack.peek(1));

	stack.push(3, 0);
	stack.push(3, 1);
	stack.push(3, 2);

	System.out.println(stack.pop(0));
	System.out.println(stack.pop(0));
	System.out.println(stack.pop(0));

	stack.push(4, 2);

    }
}
