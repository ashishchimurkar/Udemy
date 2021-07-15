package com.epam;

public class Const {

		public static void main(String[] args) {

		Const con = new Const(5, 5.5);
	}
	
	public Const(int i) {

		System.out.println(i);
	}
	
	public Const() {

		System.out.println("Hello");
	}
	
	public Const(int i, double k) {

		System.out.println(i + " " + k);
	}
	

}
