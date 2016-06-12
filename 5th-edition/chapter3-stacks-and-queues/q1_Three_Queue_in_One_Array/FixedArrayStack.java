package q1_Three_Queue_in_One_Array;

public class FixedArrayStack<T> {

    private T values[];

    private int capacity;

    private int size[];

    public FixedArrayStack(int capacity) {
	this(capacity, 3);
    }

    @SuppressWarnings("unchecked")
    public FixedArrayStack(int capacity, int numberOfStack) {
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
    
    public T peek(int stack) {
	if (isEmpty(stack)) {
	    throw new RuntimeException("Empty stack");
	}	
	int index = getTopIndex(stack) - 1;
	return values[index];
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

  
}
