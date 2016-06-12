package q2_Stack_Min;

public class Question {
    public static void main(String[] args) {

	MinStack<Integer> stack = new MinStack<>();
	int[] array = { -2, -3, 2, -5, 3, 0, 1 };
	for (int value : array) {
	    stack.push(value);
	    System.out.print(value + ", ");
	}
	System.out.println('\n');
	System.out.println("New min is " + stack.min());
	for (int i = 0; i < array.length; i++) {
	    if (!stack.isEmpty()) {
		System.out.println("Popped " + stack.pop());
		System.out.println("New min is " + stack.min());
	    }
	}
    }
}
