package com.thomas.njsvrs;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("PointA: " + pointA.getX() +"___"+ pointA.getY());
		System.out.println("PointB: " + pointB.getX() +"___"+ pointB.getY());
		System.out.println("PointC: " + pointC.getX() +"___"+ pointC.getY());
	}
}
