package com.java.test;
import java.util.Scanner;
public class Accept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city name:");
		String city=sc.nextLine();
		System.out.println("Enter state:");
		String state=sc.nextLine();
		System.out.println("City is:"+city);
		System.out.println("State is:"+state);
		sc.close();
	}

}
