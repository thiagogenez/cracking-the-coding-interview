package q1_Three_Queue_in_One_Array;

public class QuestionA<T> {

    private T values[];

    private int capacity;

    private int size[];

    public QuestionA(int capacity) {
	this(capacity, 3);
    }

    @SuppressWarnings("unchecked")
    public QuestionA(int capacity, int numberOfStack) {
	this.capacity = capacity;
	this.values = (T[]) new Object[capacity * numberOfStack];
	this.size = new int[numberOfStack];
    }

    public void push(T value, int stack) {
	if (isFull(stack)) {
	    throw new RuntimeException("Error push");
	}

	int index = getTopIndex(stack);
	values[index] = value;
	size[stack]++;
    }

    public T pop(int stack) {
	if (isEmpty(stack)) {
	    throw new RuntimeException("Error pop");
	}

	size[stack]--;
	int index = getTopIndex(stack);
	T value = values[index];
	values[index] = null;
	
	return value;
    }

    private int getTopIndex(int stack) {
	int offset = (stack * capacity);
	return size[stack] + offset;
    }

    private boolean isFull(int stack) {
	return size[stack] == capacity;
    }

    private boolean isEmpty(int stack) {
	return size[stack] == 0;
    }

    public static void main(String[] args) {
	QuestionA<Integer> stack = new QuestionA<Integer>(3);

	stack.push(1, 0);
	stack.push(1, 1);
	stack.push(1, 2);

	stack.push(2, 0);
	stack.push(2, 1);
	stack.push(2, 2);

	stack.push(3, 0);
	stack.push(3, 1);
	stack.push(3, 2);

	System.out.println(stack.pop(0));
	System.out.println(stack.pop(0));
	System.out.println(stack.pop(0));

	stack.push(4, 2);

    }
}
