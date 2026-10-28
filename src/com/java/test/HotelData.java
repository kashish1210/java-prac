package com.java.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HotelData {
	public static List<Hotel> displayAllHotels()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of hotels:");
		int n=sc.nextInt();
		List<Hotel> list=new ArrayList<Hotel>();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the hotel name "+i+" ");
			String name=sc.next();
			System.out.println("Enter the room type:");
			String type=sc.next();
			System.out.println("Enter the price:");
			float price=sc.nextFloat();
			Hotel h=new Hotel(i,name,type,price);
			list.add(h);
			
		}
		return list;
		
		/*Hotel h1=new Hotel(1,"Sarovar","L1",9000);
		Hotel h2=new Hotel(2,"Crown","L1",8000);
		Hotel h3=new Hotel(3,"LemonTree","L1",11000);*/
	}
}
