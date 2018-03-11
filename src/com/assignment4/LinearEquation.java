/**
 * LinearEquation.java is a program that calculates an intersecting
 * point of eight numbers and solves a 2 x 2 linear equation
 * Created on March 08 2018 by Vincent Porta
 */

package com.assignment4;


public class LinearEquation {

    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double d = 0;
    private double e = 0;
    private double f = 0;
    private double x1 = 0;
    private double y1 = 0;
    private double x2 = 0;
    private double y2 = 0;
    private double x3 = 0;
    private double y3 = 0;
    private double x4 = 0;
    private double y4 = 0;
    private String errorMessage = "";

    public LinearEquation() {
    }

    public LinearEquation(double _a, double _b, double _c, double _d, double _e, double _f) throws Exception {
        setA(_a);
        setB(_b);
        setC(_c);
        setD(_d);
        setE(_e);
        setF(_f);
    }

    public LinearEquation(double _x1, double _y1, double _x2, double _y2, double _x3, double _y3, double _x4, double _y4) throws Exception {
        setX1(_x1);
        setY1(_y1);
        setX2(_x2);
        setY2(_y2);
        setX3(_x3);
        setY3(_y3);
        setX4(_x4);
        setY4(_y4);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public double getA() {
        return a;
    }

    public void setA(double _a) throws Exception {
        if (!isValidInput(_a)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        a = _a;
    }

    public double getB() {
        return b;
    }

    public void setB(double _b) throws Exception {
        if (!isValidInput(_b)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        b = _b;
    }

    public double getC() {
        return c;
    }

    public void setC(double _c) throws Exception {
        if (!isValidInput(_c)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        c = _c;
    }

    public double getD() {
        return d;
    }

    public void setD(double _d) throws Exception {
        if (!isValidInput(_d)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        d = _d;
    }

    public double getE() {
        return e;
    }

    public void setE(double _e) throws Exception {
        if (!isValidInput(_e)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        e = _e;
    }

    public double getF() {
        return f;
    }


    public void setF(double _f) throws Exception {
        if (!isValidInput(_f)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        f = _f;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double _x1) throws Exception {
        if (!isValidInput(_x1)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        x1 = _x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double _y1) throws Exception {
        if (!isValidInput(_y1)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        y1 = _y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double _x2) throws Exception {
        if (!isValidInput(_x2)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        x2 = _x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double _y2) throws Exception {
        if (!isValidInput(_y2)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        y2 = _y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double _x3) throws Exception {
        if (!isValidInput(_x3)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        x3 = _x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double _y3) throws Exception {
        if (!isValidInput(_y3)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        y3 = _y3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double _x4) throws Exception {
        if (!isValidInput(_x4)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        x4 = _x4;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double _y4) throws Exception {
        if (!isValidInput(_y4)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        y4 = _y4;
    }

    public String toString() {
        return "Linear Equation class calculates an intersecting point of eight numbers and solves a 2 x 2 linear equation. ";
    }

    public boolean equals(Object o) {
        // check for null parameter
        if (o == null) return false;

        // check for object type
        String s = o.getClass().getName(); // method to get class name
        if (!s.equals("assignment4.LinearEquation")) return false;

        LinearEquation l = (LinearEquation) o;

        if ((a != l.getA()) || (b != l.getB()) || (c != l.getC()) ||
                (d != l.getD()) || (e != l.getE()) || (f != l.getF())
                || (x1 != l.getX1()) || (x2 != l.getX2()) || (x3 != l.getX3())
                || (x4 != l.getX4()) || (y1 != l.getY1()) || (y2 != l.getY2())
                || (y3 != l.getY3()) || (y4 != l.getY4())) {
            return false;
        }

        return true;

    }

    public boolean isValidInput(double input) {
        if (Double.class.isInstance(input)) {
            return true;
        }

        errorMessage = "Invalid input: " + input + " must be a double type.";
        return false;
    }

    public boolean isSolvable() {
        double w = a * d - b * c;
        if (w == 0) {
            return false;
        }
        return true;
    }

    public double getX() {
        double q = e * d - b * f;
        double w = a * d - b * c;
        double x = q / w;
        return x;
    }

    public double getY() {
        double r = a * f - e * c;
        double w = a * d - b * c;
        double y = r / w;
        return y;
    }

    public String getIntersectingPoint() {

        double div = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        double x = ((x3 - x4) * (x1 * y2 - y1 * x2) - (x1 - x2) * (x3 * y4 - y3 * x4)) / div;
        double y = ((y3 - y4) * (x1 * y2 - y1 * x2) - (y1 - y2) * (x3 * y4 - y3 * x4)) / div;
        return "Intersection is (" + x + ", " + y + ")";

    }

    public void print() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
        System.out.println("y3 = " + y3);
        System.out.println("y4 = " + y4);

    }
}
