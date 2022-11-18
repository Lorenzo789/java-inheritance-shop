package generation.italy.shop;

public class Television extends Product {

	private int dimensions;
	private boolean smart;
	
	
	public Television(String name, String description, int price,
	int dimensions, boolean smart) {
		
		super(name, description, price);

		this.dimensions = dimensions;
		this.smart = smart;
	}

	// start getter setter
	public int getDimensions() {
		return dimensions;
	}


	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}


	public boolean isSmart() {
		return smart;
	}


	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	// end getter setter
	
	@Override
	public String toString() {
		
		return "Name: " + getName()
		+ "\nDescription: " + getDescription()
		+ "\nPrice: " + getPrice()
		+ "\nPrice plus iva: " + totalPrice()
		+ "\nCode Number: " + getCode()
		+ "\nDimensions " + getDimensions()
		+ "\nSmart: " + isSmart();
	}
}
