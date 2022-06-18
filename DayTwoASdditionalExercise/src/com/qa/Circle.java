package com.qa;

public class Circle extends Shape{
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	Circle(String name, String color, double x, double y, int radius) {
		super(name, color, x, y);
		this.radius= radius;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getArea() {
		return (this.getRadius()*this.getRadius()*Math.PI);
		
		
		
	}
}
