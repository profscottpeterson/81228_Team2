package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MenuTest {

	private ArrayList<MenuItem> FullMenu = new ArrayList<MenuItem>();
	
	
	@Test
	public void testGetFullMenu() {
		Menu m = new Menu();
		m.getFullMenu();
	}

	@Test
	public void testAddToMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveFromMenu() {
		fail("Not yet implemented");
	}

}
