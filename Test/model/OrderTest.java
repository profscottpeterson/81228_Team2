package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void testGetOrderItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddGrandTotal() {
		Order o = new Order();
		double sub = 15;
		double total = o.addGrandTotal(sub);
		equals(17.75);
	}

}
