package Custom_Implimentations;

public class implimentationOfFIFO {
	private int capacity;
	private int queueArr[];
	private int front;
	private int rear;
	private int currentSize;

	/* Default construtor to initialize a size of a queue to 5. */
	public implimentationOfFIFO() {
		this.capacity = 5;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	/* Through construtor initializing a size of a queue. */
	public implimentationOfFIFO(int sizeOfQueue) {
		if (sizeOfQueue < 1)
			throw new IllegalArgumentException("Size can not be less than one.");
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	/* This method is used to check the queue is empty or not. */
	public boolean isEmpty() {
		if (currentSize == 0)
			return true;
		return false;
	}

	/* This method is used to check the stack is full or not. */
	public boolean isFull() {
		if (currentSize == capacity)
			return true;
		return false;
	}

	/*
	 * This method is used to add element in the queue in First In First Out
	 * Order.
	 */
	public void add(int data) {
		if (isFull())
			resizeCapacity(capacity / 2);

		rear++;
		queueArr[rear] = data;
		currentSize++;
	}

	/* This method is used to remove the element from the front of the queue. */
	public int get() {
		int removedValue;
		if (isEmpty())
			return -1;
		else {
			front++;
			if (front == capacity - 1) {
				removedValue = queueArr[front - 1];
				front = 0;
			} else
				removedValue = queueArr[front - 1];
			return removedValue;
		}
	}

	/* This method is used to check the current size of a queue. */
	public int size() {
		return currentSize - front;
	}

	/* This method is used to resize the array. */
	private void resizeCapacity(int newSize) {
		int[] newArray = new int[queueArr.length + newSize];
		for (int i = 0; i < queueArr.length; i++) {
			newArray[i] = queueArr[i];
		}
		queueArr = newArray;
		capacity = queueArr.length;
	}
}
