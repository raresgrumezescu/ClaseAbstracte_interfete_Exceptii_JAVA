/*
 * Programare orientata pe obiecte
 * Seria CC
 * 
 */
package Lab06;


import java.lang.*;
/**
 *
 * @author Nan Mihai
 */
public abstract class Shape {
    private String color;
    private boolean filled;
    
    public Shape() {
        this("red", true);
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

public class Circle extends Shape {
	private double radius;
	public Circle () {
		this (2);
	}
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public Circle (double radius, String color, boolean filled) {
		super (color, filled);
		this.radius = radius;
	}
	
	public double getRadius () {
		return radius;
	}
	
	public void setRadius (double radius) {
		this.radius = radius;
	}
	 
	public double getArea () {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter () {
		return 2 * radius * Math.PI;
	}
	
	public String toString () {
		return  super.filled + " " + raza + " " + super.colour;
	}
}

public class Rectangle extends Shape {
	private double width;
	private double length;
	public Rectangle () {
		this (2, 3);
	}
	
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle (double width, double length, String color, boolean filled) {
		super (color, filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth () {
		return width;
	}
	
	public void setWidth (double width) {
		this.width = width;
	}
	
	public double getLength () {
		return length;
	}
	
	public void setLength (double length) {
		this.length = length;
	}
	
	public double getArea () {
		return width * length;
	}
	
	public double getPerimeter () {
		return 2 * (width + length);
	}
	
	public String toString () {
		return  super.filled + " " + super.colour + " " + super.length + " " + super.width;
	}
}

public class Square extends Rectangle {
	private double side;
	public Square () {
		super();
	}
	
	public Square (double side) {
		super (side, side);
	}
	
	public Square (double side, String color, boolean filled) {
		super (side, side, color, filled);
	}
	
	public double getSide () {
		super.getWidth();
	}
	
	public void setSide (double side) {
		super.setWidth (side);
		super.setLength (side);
	}
	
	public String toString () {
		return super.toString (); 
	}
}
