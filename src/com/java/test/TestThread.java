package com.java.test;
import java.util.Scanner;
class person1 extends Thread
{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Running P1");
		}
	}
}
class Person2 extends Thread
{
	public void run() {
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
		}
	}
}

public class TestThread {

}
