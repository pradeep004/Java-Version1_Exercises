package com.qa;

public class Point {
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void printInfo() {
		System.out.println(x+ " " +y);
	}
	
	
	
}
