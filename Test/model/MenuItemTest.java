package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuItemTest {

	@Test
	public void testGetItemIngred() {
		MenuItem mi = new MenuItem();
		mi.getItemIngred();
	}

	@Test
	public void testGetPrice() {
		MenuItem mi = new MenuItem();
		mi.getPrice();
	}

}
