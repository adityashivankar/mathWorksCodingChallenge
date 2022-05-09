package Custom_Implimentations;

public class implimentationOfLIFO {
	private int size;
	private int arr[];
	private int top;

	/* Default construtor to initialize a size of a stack to 5. */
	public implimentationOfLIFO() {
		this.size = 5;
		this.arr = new int[size];
		this.top = -1;
	}

	/* Through construtor initializing a size of a stack. */
	public implimentationOfLIFO(int size) {
		if (size < 1)
			throw new IllegalArgumentException("Size can not be less than one.");
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	/* This method is used to check the stack is empty or not. */
	public boolean isEmpty() {
		return (top == -1);
	}

	/* This method is used to check the stack is full or not. */
	public boolean isFull() {
		return (size - 1 == top);
	}

	/* This method is used to add the int values into the stack. */
	public void add(int number) {

		if (isFull()) {
			resizeCapacity(size() / 2);
		}
		top++;
		arr[top] = number;
	}

	/*
	 * This method is used to removes the next number from the queue and returns
	 * it.
	 */
	public int get() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			return arr[returnedTop];
		} else
			return -1;
	}

	/* This method is used to check the current size of a stack. */
	public int size() {
		return top + 1;
	}

	/* This method is used to resize the array. */
	private void resizeCapacity(int newSize) {
		int[] newArray = new int[size() + newSize];
		for (int i = 0; i < size; i++) {
			newArray[i] = arr[i];
		}
		arr = newArray;
	}
}
