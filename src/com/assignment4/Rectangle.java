/**
 * Rectangle.java calculates the area and perimeter of a rectangle.
 * Created on March 07 2018 by Vincent Porta
 */

package com.assignment4;

public class Rectangle {

    private double width = 1.0;
    private double height = 1.0;
    private String errorMessage = "";

    public Rectangle() {
    }

    public Rectangle(double _width, double _height) throws Exception {
        setWidth(_width);
        setHeight(_height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String toString() {
        return "width = " + width;
    }

    public boolean equals(Object o) {

        if (o == null) return false;

        String s = o.getClass().getName();
        if (!s.equals("assignment4.Rectangle")) return false;

        Rectangle b = (Rectangle) o;

        if (width != b.getWidth()) return false;
        if (height != b.getHeight()) return false;

        return true;

    }

    public void print() {
        System.out.println("width = " + width);
        System.out.print("height = ");
        System.out.println(height);
    }

    public void setWidth(double _width) throws Exception {
        if (!isValidWidth(_width)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        width = _width;
    }

    public void setHeight(double _height) throws Exception {
        if (!isValidHeight(_height)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        height = _height;
    }

    public boolean isValidWidth(double _width) {
        if (_width > 0) {
            return true;
        }
        errorMessage = "Invalid number width: " + _width + " needs to be > 0";
        return false;
    }

    public boolean isValidHeight(double _height) {
        if (_height > 0) {
            return true;
        }
        errorMessage = "Invalid number width: " + _height + " needs to be > 0";
        return false;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }


}
