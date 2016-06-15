package q4_Tower_of_Hanoi;

import java.util.Vector;

import util.Stack;

public class Hanoi {

    /* Creating Stack array */
    private Vector<Stack<Integer>> towers;

    private int numberOfTowers = 3;

    public Hanoi(int numberOfDiscs) {
	towers = new Vector<>(numberOfTowers);

	for (int i = 0; i < numberOfTowers; i++) {
	    towers.addElement(new Stack<Integer>());
	}

	for (int i = numberOfDiscs; i >= 1; i--) {
	    towers.get(0).push(i);
	}
	display();
	move(numberOfDiscs, 0, 1, 2);
    }

    /* Recursive Function to move disks */
    public void move(int disc, int origin, int buffer, int destination) {
	if (disc > 0) {
	    move(disc - 1, origin, destination, buffer);
	    moveTop(origin, destination);
	    move(disc - 1, buffer, origin, destination);
	}
    }

    private void moveTop(int origin, int destination) {
	int d = towers.get(origin).pop();
	towers.get(destination).push(d);
	display();
    }

    public void display() {
	System.out.println("---------------------");
	for (int i = 0; i < towers.size(); i++) {
	    System.out
		    .println("Tower " + i + " : " + towers.get(i).printStackInverse());
	}
	System.out.println("---------------------");
    }

    public static void main(String[] args) {
	new Hanoi(5);

    }

}
