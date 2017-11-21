package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class IngredientTest {

	Ingredient i = new Ingredient();
	
	@Test
	public void testGetName() {
		i.getName();
	}

	@Test
	public void testGetCategory() {
		i.getCategory();
	}

}
