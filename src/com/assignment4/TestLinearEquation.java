/**
 * Test class for the LinearEquation.java program.
 * Created on March 08 2018 by Vincent Porta
 */

package com.assignment4;

import java.util.Scanner;
import java.util.Objects;

public class TestLinearEquation {

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        System.out.println("This program will solve a linear equation for you. It ask you to enter 6 decimal " +
                "numbers (a, b, c, d, e, and f) separated by a single space.\nThe results of the linear equation will" +
                " be displayed to you. If ad - bc is 0, you will be notified that the equation has no solution.\nThe second part " +
                "of the program will solve for the intersecting point of two lines.\nIt will ask you to enter 8 decimal numbers" +
                " on one line separated by a single space i.e., (x1, y1) and (x2, y2)\nand for the second line " +
                "segment, (x3, y3) and (x4, y4). The intersecting point will be displayed to you.");


        System.out.println("");
        System.out.println("/nTesting default LinearEquation constructor");
        LinearEquation asm = new LinearEquation();
        printLinearEquation(asm);

        System.out.println("");

        double testA = 0;
        double testB = 0;
        double testC = 0;
        double testD = 0;
        double testE = 0;
        double testF = 0;
        double testX1 = 0;
        double testY1 = 0;
        double testX2 = 0;
        double testY2 = 0;
        double testX3 = 0;
        double testY3 = 0;
        double testX4 = 0;
        double testY4 = 0;

        double[] testGoodOccurrence = {2.0};

        for (double element : testGoodOccurrence) {
            testA = element;
            testB = element;
            testC = element;
            testD = element;
            testE = element;
            testF = element;
            testX1 = element;
            testX2 = element;
            testX3 = element;
            testX4 = element;
            testY1 = element;
            testY2 = element;
            testY3 = element;
            testY4 = element;

            System.out.print(
                    "setA(\"" + testA + "\")");
            System.out.print(
                    "setB(\"" + testB + "\")");
            System.out.print(
                    "setC(\"" + testC + "\")");
            System.out.print(
                    "setD(\"" + testD + "\")");
            System.out.print(
                    "setE(\"" + testE + "\")");
            System.out.print(
                    "setF(\"" + testF + "\")");
            System.out.print(
                    "setX1(\"" + testX1 + "\")");
            System.out.print(
                    "setX2(\"" + testX2 + "\")");
            System.out.print(
                    "setX3(\"" + testX3 + "\")");
            System.out.print(
                    "setX4(\"" + testX4 + "\")");
            System.out.print(
                    "setY1(\"" + testY1 + "\")");
            System.out.print(
                    "setY2(\"" + testY2 + "\")");
            System.out.print(
                    "setY3(\"" + testY3 + "\")");
            System.out.print(
                    "setY4(\"" + testY4 + "\")");


            try {
                asm.setA(testA);
                asm.setB(testB);
                asm.setC(testC);
                asm.setD(testD);
                asm.setE(testE);
                asm.setF(testF);
                asm.setX1(testX1);
                asm.setX2(testX2);
                asm.setX3(testX3);
                asm.setX4(testX4);
                asm.setY1(testY1);
                asm.setY2(testY2);
                asm.setY3(testY3);
                asm.setY4(testY4);
                System.out.println(" - passed");
            } catch (Exception e) {
                System.out.println(" - failed" +
                        "\n setA(testA)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setB(testB)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setC(testC)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setD(testD)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setE(testE)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setF(testF)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setX1(testX1)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setX2(testX2)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setX3(testX3)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setX4(testX4)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setY1(testY1)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setY2(testY2)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setY3(testY3)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
                System.out.println(" - failed" +
                        "\n setY4(testY4)" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
            } // end e catch


            if (!Objects.equals(asm.getA(), testA) || !Objects.equals(asm.getB(), testB) ||
                    !Objects.equals(asm.getC(), testC) || !Objects.equals(asm.getD(), testD) || !Objects.equals(asm.getE(), testE)
                    || !Objects.equals(asm.getF(), testF) || !Objects.equals(asm.getX1(), testX1) || !Objects.equals(asm.getX2(), testX2)
                    || !Objects.equals(asm.getX3(), testX3) || !Objects.equals(asm.getX4(), testX4) || !Objects.equals(asm.getY1(), testY1)
                    || !Objects.equals(asm.getY2(), testY2) || !Objects.equals(asm.getY3(), testY3) || !Objects.equals(asm.getY4(), testY4)) {
                // if get here then set() did not work
                System.out.printf("Data member should be %s %s %s %s %s \n %s %s %s %s %s %s %s %s %s", testA, testB, testC, testD, testE, testF,
                        testX1, testX2, testX3, testX4, testY1, testY2, testY3, testY4);
                System.out.printf(" but is actually %s %s %s %s %s %s \n %s %s %s %s %s %s %s %s", asm.getA(), asm.getB(), asm.getC(), asm.getD(),
                        asm.getE(), asm.getF(), asm.getX1(), asm.getX2(), asm.getX3(), asm.getX4(), asm.getY1(), asm.getY2(), asm.getY3(),
                        asm.getY4());
                System.out.print(" - accessor or mutator function is" +
                        " malfunctioning");
                System.out.println(" - *** FAILED ***");
            } // end if( !sub...)
            System.out.println("");
        } // end for( ... element ...


        System.out.println("direct call to toString() = " +
                asm.toString());

        // test implied equals() method
        System.out.println("implied use of toString() = " + asm);

        // test fpzc for solving linear equation
        System.out.println("\ntesting fpzc");
        LinearEquation linearEquationOne = null;
        try {
            linearEquationOne = new LinearEquation(1, 2, 3, 4, 5, 6);
            // if get here fpzc executed without Exception
            printLinearEquation(linearEquationOne);
        } // end try
        catch (Exception e) {
            // if get here fpzc threw Exception
            System.out.println("linearEquationOne constructor threw" +
                    " Exception w/ message: " + e.getMessage());
            System.exit(371);
        } // end e catch

        // test fpzc for solving intersecting points
        System.out.println("\ntesting fpzc for intersecting points");
        LinearEquation linearEquationTwo = null;
        try {
            linearEquationTwo = new LinearEquation(3, 4, 5, 6, 7, 5, 4, 2);
            // if get here fpzc executed without Exception
            printLinearEquation(linearEquationTwo);
        } // end try
        catch (Exception e) {
            // if get here fpzc threw Exception
            System.out.println("linearEquationTwo constructor threw" +
                    " Exception w/ message: " + e.getMessage());
            System.exit(371);
        } // end e catch

        System.out.println("\ntesting equals() function");
        LinearEquation asmcopy = null;
        LinearEquation asmcopyOne = null;

        // make a copy of asm
        try {
            asmcopy = new LinearEquation(
                    asm.getA(),
                    asm.getB(),
                    asm.getC(),
                    asm.getD(),
                    asm.getE(),
                    asm.getF());
        } // end try
        catch (Exception e) {
            // if get here LinearEquation constructor failed
            System.out.println("asmcopy constructor" +
                    " threw Exception w/ message = " + e.getMessage());
            System.exit(341);
        } // end e catch

        // if get here than constructor was successful
        if (asmcopy.equals(asm))
            System.out.println(".equals() test passed");
        else System.out.println(".equals test failed");


        try {
            asm.setA(2);
            asm.setB(5);
            asm.setC(1);
            asm.setD(6);
            asm.setE(4);
            asm.setF(8);
        }
        catch (Exception e) {
            // if get here set() function failed
            System.out.println("setA(2) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setB(5) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setC(1) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setD(6) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setE(4) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setF(8) threw Exception" +
                    " w/ message = " + e.getMessage());
        }

        // if get here set() succeeded
        if (asmcopyOne != null && !asmcopyOne.equals(asm)) System.out.println("!.equals() test passed");
        else System.out.println("!.equals test failed");
        asm.print();

        try {
            asmcopyOne = new LinearEquation(
                    asm.getX1(),
                    asm.getY1(),
                    asm.getX2(),
                    asm.getY2(),
                    asm.getX3(),
                    asm.getY3(),
                    asm.getX4(),
                    asm.getY4());
        } // end try
        catch (Exception e) {
            // if get here LinearEquation constructor failed
            System.out.println("asmcopyOne constructor" +
                    " threw Exception w/ message = " + e.getMessage());
            System.exit(341);
        } // end e catch

        // if get here than constructor was successful
        if (asmcopyOne.equals(asm))
            System.out.println(".equals() test passed");
        else System.out.println(".equals test failed");

        try {
            asm.setX1(4);
            asm.setY1(2);
            asm.setX2(3);
            asm.setY2(5);
            asm.setX3(1);
            asm.setY3(3);
            asm.setX4(8);
            asm.setY4(4);
        } // end try
        catch (Exception e) {
            // if get here set() function failed
            System.out.println("setX1(4) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setY1(2) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setX2(3) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setY2(5) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setX3(1) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setY3(3) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setX4(8) threw Exception" +
                    " w/ message = " + e.getMessage());
            System.out.println("setY4(4) threw Exception" +
                    " w/ message = " + e.getMessage());
        }

        // if get here set() succeeded
        if (!asmcopyOne.equals(asm))
            System.out.println("!.equals() test passed");
        else System.out.println("!.equals test failed");
        asm.print();


        Scanner input = new Scanner(System.in);
        int repeatInt = 1;

        String askOne = "Enter 6 numbers separated by a single space: ";
        String askTwo = "Enter 8 numbers for lines one and two separated by a single space: ";

        while (repeatInt == 1) {
            System.out.println(askOne);

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();
            double e = input.nextDouble();
            double f = input.nextDouble();

            try {

                LinearEquation fp = new LinearEquation(a, b, c, d, e, f);

                if (!fp.isSolvable()) {
                    System.out.println("The equation has no solution.");
                }

                System.out.println("x is " + fp.getX() + " y is " + fp.getY());

            } catch (Exception e1) {
                e1.printStackTrace();
            }

            System.out.println(askTwo);
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double x3 = input.nextDouble();
            double y3 = input.nextDouble();
            double x4 = input.nextDouble();
            double y4 = input.nextDouble();

            String intersectingPoint = null;
            try {

                LinearEquation asmOne = new LinearEquation(x1, y1, x2, y2, x3, y3, x4, y4);
                intersectingPoint = asmOne.getIntersectingPoint();

            } catch (Exception e2) {
                e2.printStackTrace();
            }

            System.out.println(intersectingPoint);

            System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
            repeatInt = input.nextInt();
        }
    }

    public static void printLinearEquation(LinearEquation l) {
        System.out.println("");

        if (l == null) {
            System.out.println("LinearEquation object reference is null.");
            return;
        }

        String className = l.getClass().getName();

        System.out.println(className + ".a = " +
                l.getA());
        System.out.println(className + ".b = " +
                l.getB());
        System.out.println(className + ".c = " +
                l.getC());
        System.out.println(className + ".d = " +
                l.getD());
        System.out.println(className + ".e = " +
                l.getE());
        System.out.println(className + ".f = " +
                l.getF());

        System.out.println(className + ".x1 = " +
                l.getX1());
        System.out.println(className + ".y1 = " +
                l.getY1());
        System.out.println(className + ".x2 = " +
                l.getX2());
        System.out.println(className + ".y2 = " +
                l.getY2());
        System.out.println(className + ".x3 = " +
                l.getX3());
        System.out.println(className + ".y3 = " +
                l.getY3());
        System.out.println(className + ".x4 = " +
                l.getX4());
        System.out.println(className + ".y4 = " +
                l.getY4());
    }
}




