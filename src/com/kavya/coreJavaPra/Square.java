package com.kavya.coreJavaPra;

public abstract class Square extends Shape{

	public static void main(String[] args) {

		Shape sh = new Rectangle();
		sh.area();
		sh.parameter();
	}

	@Override
	void area() {

		System.out.println("Square-->Area");
	}

}

class Rectangle extends Square{

	@Override
	void parameter() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle-->parameter");
	}
	
}