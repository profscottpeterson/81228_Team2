package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	Order o = new Order();
	MenuItem m = new MenuItem();
	
	@Test
	public void testGetOrderItems() {
		
		o.getOrderItems();
	}

	@Test
	public void testAddItem() {
		o.addItem(m);
	}

	@Test
	public void testRemoveItem() {
		o.addItem(m);
		o.removeItem(m);
	}

	@Test
	public void testAddGrandTotal() {
		Order o = new Order();
		double sub = 15;
		double total = o.addGrandTotal(sub);
		equals(17.75);
	}

}
