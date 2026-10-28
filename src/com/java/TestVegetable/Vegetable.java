package com.java.TestVegetable;

public class Vegetable {
	private int id;
	private String name;
	private int quantity;
	private float price;
	public Vegetable(int id, String name, int quantity, float price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public float getPrice() {
		return price;
	}
	
