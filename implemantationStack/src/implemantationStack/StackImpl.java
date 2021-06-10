package implemantationStack;

import java.util.Arrays;

public class StackImpl {

	private int[] a;
	private int index;
	private int size;

	{
		index = -1;
	}

	public void createStack(int size) {
		this.size = size;
		a = new int[this.size];
		System.out.println("stack created successfully");

	}

	public void push(int item) {
		if (index >= size) {
			System.out.println("stack overflow");
		} else {
			a[++index] = item;
			System.out.println("Pushed successfully...." + item);
		}
	}

	public void pop() {
		if (index == -1) {
			System.out.println("stack underflow");
		} else {
			System.out.println("Poped successfully...." + a[index--]);
		}
	}

	public int[] display() {
		return a;
	}

	public void searchElement(int item) {
		int position = Arrays.binarySearch(a, item);
		//System.out.println(position);
		if (position >=0) {
			System.out.println("Element found at " + position + "place");
		} else {
			System.out.println("Element not found");
		}
	

	}

	public int[] sortStack() {
		Arrays.sort(a);
		return a;

	}

}
