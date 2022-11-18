package generation.italy.shop;

import java.util.Random;

public class Product {

	private int code;
	private String name;
	private String description;
	private int price;
	private int iva;
	
	public Product(String name, String description, int price) {
		
		this.name = name;
		this.description = description;
		this.price = price;
		
		Random rnd = new Random();
		
		int randomCode = 0;
		
		randomCode = rnd.nextInt(10000,99999);

		code = randomCode;
		iva = 20;
	}
	
	//start getter e setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getIva() {
		return iva;
	}


	public void setIva(int iva) {
		this.iva = iva;
	}


	public int getCode() {
		return code;
	}

	public int getPrice() {
		
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	//end getter e setter
	
	
	public int totalPrice() {
		
		int ivaPrice = (price * iva) / 100;
		
		int totalPrice = ivaPrice + price;
		
		return totalPrice;
	}
	
	
	@Override
	public String toString() {

		return "Name: " + name
				+ "\nDescription: " + description
				+ "\nPrice: " + price
				+ "\nPrice plus iva: " + totalPrice()
				+ "\nCode Number: " + code + "\n";
	}
}
