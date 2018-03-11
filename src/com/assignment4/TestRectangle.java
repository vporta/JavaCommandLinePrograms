/**
 * Rectangle.java calculates the area and perimeter of a rectangle.
 * Created on March 07 2018 by Vincent Porta
 */

package com.assignment4;

import org.w3c.dom.css.Rect;

import java.util.Objects;
import java.util.Scanner;


public class TestRectangle {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        double testWidth = 1.0;
        double testHeight = 1.0;
        double[] testGoodWidths = {4.0, 3.5};
        double[] testBadWidths = {-1.0, 0};
        double[] testGoodHeights = {40.0, 35.9};
        double[] testBadHeights = {-1.0, 0};

        System.out.println("/nThis program creates two Rectangles: one with width 4 and height 40 and the other with " +
                "width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.");
        Rectangle asm0 = null;
        try {
            asm0 = new Rectangle();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Rectangle asm = null;
        try {
            asm = new Rectangle(testGoodWidths[0], testGoodHeights[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        printRectangle(asm);

        Rectangle asm2 = null;
        try {
            asm2 = new Rectangle(testGoodWidths[1], testGoodHeights[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        printRectangle(asm2);

        for (double element : testGoodWidths) {
            testWidth = element;
            System.out.print(
                    "setWidth(\"" + testWidth + "\")");
            try {
                asm.setWidth(testWidth);
                System.out.println(" - passed");
            } catch (Exception e) {
                System.out.println(" - failed" +
                        "\nasm.setWidth(testWidth" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
            }

        }

        for (double element : testGoodHeights) {
            testHeight = element;
            System.out.print(
                    "setHeight(\"" + testHeight + "\")");

            try {
                asm.setHeight(testHeight);
                System.out.println(" - passed");
            } catch (Exception e) {
                System.out.println(" - failed" +
                        "\nasm.setHeight(testHeight" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
            }

            if (asm.getHeight() != (testHeight)) {
                System.out.print("Data member should be " +
                        testHeight);
                System.out.print(" but is actually " +
                        asm.getHeight());
                System.out.print(" - accessor or mutator function is" +
                        " malfunctioning");
                System.out.println(" - *** FAILED ***");
            }
            System.out.println("");
        }

        System.out.println("Rectangle asm contents ...");
        printRectangle(asm);

        System.out.println("\nTesting print() and toString() function");
        asm.print();

        System.out.println("direct call to toString() = " +
                asm.toString());
        System.out.println("implied use of toString() = " + asm);

        System.out.println("\ntesting fpzc");

        Rectangle oneRectangle = null;

        try {
            oneRectangle = new Rectangle();
            printRectangle(oneRectangle);
        } catch (Exception e) {
            System.out.println("oneRectangle constructor threw" +
                    " Exception w/ message: " + e.getMessage());
            System.exit(371);
        }

        System.out.println("\ntesting equals() function");
        Rectangle asmcopy = null;

        try {
            asmcopy = new Rectangle(asm0.getWidth(), asm0.getHeight());
        } catch (Exception e) {
            System.out.println("asmcopy constructor" +
                    " threw Exception w/ message = " + e.getMessage());
            System.exit(341);
        }

        if (asmcopy.equals(asm0)) {
            System.out.println(".equals() test passed");
        } else {
            System.out.println(".equals test failed");
        }

        try {
            asm0.setHeight(4);
        } catch (Exception e) {
            System.out.println("setHeight() threw Exception" +
                    " w/ message = " + e.getMessage());
        }
        if (!asmcopy.equals(asm0))
            System.out.println("!.equals() test passed");
        else System.out.println("!.equals test failed");
        asm0.print();

        System.out.print("\nTesting mutator functions with bad data");
        System.out.println(
                " - should return passed and print error message");
        System.out.println("");

        double currentWidth = oneRectangle.getWidth();

        for (double element : testBadWidths) {
            testWidth = element;
            System.out.print("setBuildingID(\"" +
                    testWidth + "\")");
            try {
                oneRectangle.setWidth(
                        testWidth);
                System.out.println(" returned normally - ***FAILED***");
            } catch (Exception e) {
                System.out.println(" threw an exception - passed");
                System.out.println("message = " +
                        oneRectangle.getErrorMessage());
            }

            if (!Objects.equals(oneRectangle.getWidth(), currentWidth)) {
                System.out.print("data member should be " +
                        currentWidth + " but is actually " +
                        oneRectangle.getWidth());
                System.out.print(
                        " - accessor or mutator function is malfunctioning");
                System.out.println(" - *** FAILED ***");
            }
            System.out.println("");
        }

        double currentHeight = oneRectangle.getHeight();
        for (double element : testBadHeights) {
            testHeight = element;
            System.out.print("setHeight(\"" +
                    testHeight + "\")");
            try {
                oneRectangle.setHeight(testHeight);
                System.out.println(" returned normally - ***FAILED***");
            } catch (Exception e) {
                System.out.println(" threw an exception - passed");
                System.out.println("message = " +
                        oneRectangle.getErrorMessage());
            }

            if (oneRectangle.getHeight()
                    != currentHeight) {
                System.out.print("data member should be " +
                        currentHeight +
                        " but is actually " +
                        oneRectangle.getHeight());
                System.out.print(
                        " - accessor or mutator function is malfunctioning");
                System.out.println(" - *** FAILED ***");
            }
            System.out.println("");
        }


        Scanner input = new Scanner(System.in);
        int repeatInt = 1;

        String askWidth = "Enter 1 decimal number for the width: ";
        String askHeight = "Enter 1 decimal number for the height: ";

        while (repeatInt == 1) {
            System.out.println(askWidth);
            double a = input.nextDouble();
            System.out.println(askHeight);
            double b = input.nextDouble();

            try {

                Rectangle fp = new Rectangle(a, b);
                System.out.println("");
                System.out.println("Width is " + fp.getWidth() + " height is " + fp.getHeight());
                System.out.println("Area is " + fp.getArea() + "\nPerimeter is " + fp.getPerimeter());

            } catch (Exception e1) {
                e1.printStackTrace();
            }

            System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
            repeatInt = input.nextInt();
        }

    }

    public static void printRectangle(Rectangle b) {
        System.out.println("");

        if (b == null) {
            System.out.println("Rectangle object reference is null !! ");
            return;
        }

        String className = b.getClass().getName();

        System.out.println(className + ".width = " +
                b.getWidth());
        System.out.println(className + ".height = " +
                b.getHeight());
        System.out.println(className + ".getPerimeter = " +
                b.getPerimeter());
        System.out.println(className + ".getArea = " +
                b.getArea());

    }

}
