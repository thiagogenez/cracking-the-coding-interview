package q5_queue_as_two_stacks;

import util.Stack;

public class Queue<T> {

    private Stack<T> in;

    private Stack<T> out;

    public Queue() {
	in = new Stack<T>();
	out = new Stack<T>();
    }

    public void add(T value) {
	in.push(value);
    }

    public T remove() {
	shiftElements();
	return out.pop();
    }

    private void shiftElements() {
	if (out.isEmpty()) {
	    while (!in.isEmpty()) {
		T poped = in.pop();
		out.push(poped);
	    }
	}
    }

    public T peek() {
	shiftElements();
	return out.peek();
    }

    public int size() {
	return in.size() + out.size();
    }
}
