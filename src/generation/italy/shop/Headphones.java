package generation.italy.shop;

public class Headphones extends Product {

	private String color;
	private boolean wireless;
	
	public Headphones(String name, String description, int price,
	String color, boolean wireless) {
		
		super(name, description, price);
		
		this.color = color;
		this.wireless = wireless;
	}

	// start getter setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	// end getter setter
	
	@Override
	public String toString() {
		
		return "Name: " + getName()
		+ "\nDescription: " + getDescription()
		+ "\nPrice: " + getPrice()
		+ "\nPrice plus iva: " + totalPrice()
		+ "\nCode Number: " + getCode()
		+ "\nColor: " + getColor()
		+ "\nWireless: " + isWireless();
	}
}
