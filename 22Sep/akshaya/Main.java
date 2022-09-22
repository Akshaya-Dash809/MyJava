package com.akshaya;

public class Main {
	public static void main(String[] args) {
		// Creating an object of the sub class
		Dog d = new Dog();
		// access fields of super class
		d.name = "Tommy";
		d.display();
		// call method of super class using object of super class
		d.eat();
	}
}
