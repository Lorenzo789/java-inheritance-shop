package generation.italy.shop;

import java.util.Random;

public class Smartphone extends Product {
	
	private int codeImei;
	private int ram; 

	public Smartphone(String name, String description, int price,
	int ram) {
		
		super(name, description, price);
		
		this.ram = ram;
		
		Random rnd = new Random();
		int randomImei = 0;
		
		randomImei = rnd.nextInt(11111, 99999);
		codeImei = randomImei;
	}

	// start getter setter
	public int getCodeImei() {
		return codeImei;
	}

	public void setCodeImei(int codeImei) {
		this.codeImei = codeImei;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	// end getter setter

	@Override
	public String toString() {
		
		return "Name: " + getName()
		+ "\nDescription: " + getDescription()
		+ "\nPrice: " + getPrice()
		+ "\nPrice plus iva: " + totalPrice()
		+ "\nCode Number: " + getCode()
		+ "\nImei code: " + getCodeImei()
		+ "\nRam: " + getRam() + "GB\n";
	}
	
}
