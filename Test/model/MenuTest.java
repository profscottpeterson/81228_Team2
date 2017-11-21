package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MenuTest {

	Menu m = new Menu();
	MenuItem mi = new MenuItem();
	
	@Test
	public void testGetFullMenu() {
		
		m.getFullMenu();
	}

	@Test
	public void testAddToMenu() {
		
		m.addToMenu(mi);
	}

	@Test
	public void testRemoveFromMenu() {
		m.addToMenu(mi);
		m.removeFromMenu(mi);
	}

}
