package com.java.test;
public class Hotel{
	 int id;
	 String name;
	 String RoomType;
	 float price;
public Hotel(int id, String name, String roomType, float price) {
		super();
		this.id = id;
		this.name = name;
		RoomType = roomType;
		this.price = price;
	}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getRoomType() {
	return RoomType;
}
public float getPrice() {
	return price;
}
}

