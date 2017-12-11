package model;
public class FoodIngQty {
	private int foodIngID;
	private int foodID;
	private int ingID;

	public FoodIngQty() {}//empty constructor
	public FoodIngQty(int fI_ID, int fID, int iID) {
		setFoodIngID(fI_ID);
		setFoodID(fID);
		setIngID(iID);
	}//FoodIngQty

	protected int getFoodIngID() {
		return foodIngID;
	}

	protected void setFoodIngID(int foodIngID) {
		this.foodIngID = foodIngID;
	}

	protected int getFoodID() {
		return foodID;
	}

	protected void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	protected int getIngID() {
		return ingID;
	}

	protected void setIngID(int ingID) {
		this.ingID = ingID;
	}
}//FoodIngQty