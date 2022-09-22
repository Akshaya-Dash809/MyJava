package com.akshaya;

public class Rectangle extends Shape {
	int area;

	public void calculateArea() {
		area = length * breadth;
		System.out.println("The area of rectangle is : " + area);
	}
}
