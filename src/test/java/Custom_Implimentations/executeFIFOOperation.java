package Custom_Implimentations;

import org.junit.Assert;
import org.junit.Test;

public class executeFIFOOperation {
	implimentationOfFIFO fifo = new implimentationOfFIFO();

	@Test
	public void testStackSize() {
		addDataInFIFO();
		Assert.assertEquals(5, fifo.size());
	}

	@Test
	public void testStackSizeAfterSizeIsFull() {
		addDataInFIFO();
		fifo.add(60);
		fifo.add(70);
		Assert.assertEquals(7, fifo.size());
	}

	@Test
	public void testGetDataAndSize() {
		addDataInFIFO();
		System.out.println(fifo.get() + " is removed from the Stack.");
		System.out.println(fifo.get() + " is removed from the Stack.");
		System.out.println(fifo.get() + " is removed from the Stack.");
		fifo.add(60);
		fifo.add(70);
		System.out.println(fifo.get() + " is removed from the Stack.");
		System.out.println(fifo.get() + " is removed from the Stack.");
		Assert.assertEquals(2, fifo.size());
	}

	@Test
	public void testQueueIsEmpty() {
		Assert.assertEquals(0, fifo.size());
	}

	private void addDataInFIFO() {
		fifo.add(10);
		fifo.add(20);
		fifo.add(30);
		fifo.add(40);
		fifo.add(50);
	}
}
