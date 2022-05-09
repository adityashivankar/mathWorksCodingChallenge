package Custom_Implimentations;

import org.junit.Assert;
import org.junit.Test;

public class executeLIFOOperation {

	implimentationOfLIFO lifo = new implimentationOfLIFO();

	@Test
	public void testStackSize() {
		addDataInLIFO();
		Assert.assertEquals(5, lifo.size());
	}

	@Test
	public void testStackSizeAfterSizeIsFull() {
		addDataInLIFO();
		lifo.add(6);
		Assert.assertEquals(6, lifo.size());
	}

	@Test
	public void testGetDataAndSize() {
		addDataInLIFO();
		System.out.println(lifo.get() + " is removed from the Stack.");
		System.out.println(lifo.get() + " is removed from the Stack.");
		System.out.println(lifo.get() + " is removed from the Stack.");
		Assert.assertEquals(2, lifo.size());
	}
	
	@Test
	public void testGetDataAfterResize() {
		addDataInLIFO();
		System.out.println(lifo.get() + " is removed from the Stack.");
		lifo.add(6);
		System.out.println(lifo.get() + " is removed from the Stack.");
		System.out.println(lifo.get() + " is removed from the Stack.");
		System.out.println(lifo.get() + " is removed from the Stack.");
		Assert.assertEquals(2, lifo.size());
	}

	@Test
	public void testStackIsEmpty() {
		Assert.assertEquals(0, lifo.size());
	}

	private void addDataInLIFO() {
		lifo.add(1);
		lifo.add(2);
		lifo.add(3);
		lifo.add(4);
		lifo.add(5);
	}
}
