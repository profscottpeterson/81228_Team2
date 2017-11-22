package model;

public class Ingredient {

	private String name;
	private int category;
	private int ing_id;
	
	public Ingredient(String ingName, int ingCat, int ingId)
	{
		setName(ingName);
		setCategory(ingCat);
		setIng_id(ingId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getIng_id() {
		return ing_id;
	}

	public void setIng_id(int ing_id) {
		this.ing_id = ing_id;
	}	
}