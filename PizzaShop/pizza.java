package com.dkte.pizzaShop.entities;

public class pizza {
	private int mid;
	private String name;
	private String desc;
	private double price;
	
	public pizza()
	{
		
	}

	public pizza(int mid, String name, String desc, double price) {
		this.mid = mid;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "pizza [mid=" + mid + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}
	
	
}
