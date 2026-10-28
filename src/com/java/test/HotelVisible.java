package com.java.test;
import java.util.List;
import java.util.Scanner;


public class HotelVisible {
	public static void main(String []args) {
		List<Hotel> listnew=HotelData.displayAllHotels();
		for(Hotel x:listnew) {
			System.out.println(x.getId()+" "+x.getName()+" "+x.getPrice());
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hotel name you want:");
		String nsearch=sc.next();
		System.out.println("Enter the number of days you want to stay:");
		int days=sc.nextInt();
		float bill=0.0f;
		for(Hotel y:listnew) {
			if(nsearch.equals(y.getName())){
				bill=days*y.getPrice();
				
			}
		}
		System.out.println("Final bill="+bill);
	}
}
	
