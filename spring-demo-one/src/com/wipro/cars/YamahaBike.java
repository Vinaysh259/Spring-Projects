package com.wipro.cars;

public class YamahaBike extends Bike{
	
	private int price;
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String Type() {
		return "Yamaha Bike :" + price;
	}
	
	
}
