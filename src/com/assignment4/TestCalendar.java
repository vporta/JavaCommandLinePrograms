/**
 * Test class for the CalendarProblem.java program.
 * Created on March 07 2018 by Vincent Porta
 */

package com.assignment4;

import java.util.GregorianCalendar;
import java.util.Objects;


public class TestCalendar {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("This program will display the current year, month, and day of the month expressed as " +
                "numbers, and displays the day, month and year since the Epoch (1234567898765L milliseconds). ");
        int testYear = 1;
        int testMonth = 1;
        int testDay = 1;

        int[] testGoodYears = {1999, 2010};
        int[] testBadYear = {-1998, -300};
        int[] testGoodMonths = {0, 4, 12};
        int[] testBadMonths = {-1, 13};
        int[] testGoodDays = {1, 30};
        int[] testBadDays = {32, 0};

        System.out.println("/nTesting default CalendarProblem constructor");
        CalendarProblem asm = new CalendarProblem();
        printCalendar(asm);
        System.out.println("");

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(GregorianCalendar.YEAR);
        int month = gregorianCalendar.get(GregorianCalendar.MONTH)+1; // adjusting for count starting at 0
        int day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        long milliseconds = 1234567898765L;

        CalendarProblem asm2 = null;
        try {
            asm2 = new CalendarProblem(year, month, day);
        } catch (Exception e) {
            e.printStackTrace();
        }

        asm2.print();
        System.out.println("");

        CalendarProblem asm3 = null;
        try {
            asm3 = new CalendarProblem(milliseconds);
        } catch (Exception e) {
            e.printStackTrace();
        }

        asm3.print();
        System.out.println("");


        for (int element : testGoodYears) {
            testYear = element;
            System.out.print(
                    "setYear(\"" + testYear + "\")");
            try {
                asm.setYear(testYear);
                System.out.println(" - passed");
            } catch (Exception e) {
                System.out.println(" - failed" +
                        "\nasm.setYear(testYear" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
            }

        }

        for (int element : testGoodMonths) {
            testMonth = element;
            System.out.print(
                    "setMonth(\"" + testMonth + "\")");

            try {
                asm.setMonth(testMonth);
                System.out.println(" - passed");
            } catch (Exception e) {
                System.out.println(" - failed" +
                        "\nasm.setMonth(testMonth" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
            }

            if (asm.getMonth() != (testMonth)) {
                System.out.print("Data member should be " +
                        testMonth);
                System.out.print(" but is actually " +
                        asm.getMonth());
                System.out.print(" - accessor or mutator function is" +
                        " malfunctioning");
                System.out.println(" - *** FAILED ***");
            }
            System.out.println("");
        }

        System.out.println("CalendarProblem asm contents ...");
        printCalendar(asm);

        for (int element : testGoodDays) {
            testDay = element;
            System.out.print(
                    "setDay(\"" + testDay + "\")");

            try {
                asm.setDay(testDay);
                System.out.println(" - passed");
            } catch (Exception e) {
                System.out.println(" - failed" +
                        "\nasm.setDay(testDay" +
                        " threw Exception w/ message:\n" +
                        asm.getErrorMessage());
            }

            if (asm.getDay() != (testDay)) {
                System.out.print("Data member should be " +
                        testDay);
                System.out.print(" but is actually " +
                        asm.getDay());
                System.out.print(" - accessor or mutator function is" +
                        " malfunctioning");
                System.out.println(" - *** FAILED ***");
            }
            System.out.println("");
        }

        CalendarProblem oneCalendarProblem = null;

        try {
            oneCalendarProblem = new CalendarProblem();
            printCalendar(oneCalendarProblem);
        } catch (Exception e) {
            System.out.println("oneCalendarProblem constructor threw" +
                    " Exception w/ message: " + e.getMessage());
            System.exit(371);
        }

        System.out.println("\ntesting equals() function");
        CalendarProblem asmcopy = null;

        try {
            asmcopy = new CalendarProblem(asm.getYear(), asm.getMonth(), asm.getDay());
        } catch (Exception e) {
            System.out.println("asmcopy constructor" +
                    " threw Exception w/ message = " + e.getMessage());
            System.exit(341);
        }

        if (asmcopy.equals(asm)) {
            System.out.println(".equals() test passed");
        } else {
            System.out.println(".equals test failed");
        }

        try {
            asm.setYear(4);
        } catch (Exception e) {
            System.out.println("setHeight() threw Exception" +
                    " w/ message = " + e.getMessage());
        }
        if (!asmcopy.equals(asm))
            System.out.println("!.equals() test passed");
        else System.out.println("!.equals test failed");
        asm.print();

        int currentYear = oneCalendarProblem.getYear();

        for (int element : testBadYear) {
            testYear = element;
            System.out.print("setYear(\"" +
                    testYear + "\")");
            try {
                oneCalendarProblem.setYear(
                        testYear);
                System.out.println(" returned normally - ***FAILED***");
            } catch (Exception e) {
                System.out.println(" threw an exception - passed");
                System.out.println("message = " +
                        oneCalendarProblem.getErrorMessage());
            }

            if (!Objects.equals(oneCalendarProblem.getYear(), currentYear)) {
                System.out.print("data member should be " +
                        currentYear + " but is actually " +
                        oneCalendarProblem.getYear());
                System.out.print(
                        " - accessor or mutator function is malfunctioning");
                System.out.println(" - *** FAILED ***");
            }
            System.out.println("");
        }

        int currentMonth = oneCalendarProblem.getMonth();
        for (int element : testBadMonths) {
            testMonth = element;
            System.out.print("setMonth(\"" +
                    testMonth + "\")");
            try {
                oneCalendarProblem.setMonth(testMonth);
                System.out.println(" returned normally - ***FAILED***");
            } catch (Exception e) {
                System.out.println(" threw an exception - passed");
                System.out.println("message = " +
                        oneCalendarProblem.getErrorMessage());
            }

            if (oneCalendarProblem.getMonth()
                    != currentMonth) {
                System.out.print("data member should be " +
                        currentMonth +
                        " but is actually " +
                        oneCalendarProblem.getMonth());
                System.out.print(
                        " - accessor or mutator function is malfunctioning");
                System.out.println(" - *** FAILED ***");
            }
            System.out.println("");
        }

        int currentDay = oneCalendarProblem.getDay();
        for (int element : testBadDays) {
            testDay = element;
            System.out.print("setDay(\"" +
                    testDay + "\")");
            try {
                oneCalendarProblem.setDay(testDay);
                System.out.println(" returned normally - ***FAILED***");
            } catch (Exception e) {
                System.out.println(" threw an exception - passed");
                System.out.println("message = " +
                        oneCalendarProblem.getErrorMessage());
            }

            if (oneCalendarProblem.getDay()
                    != currentDay) {
                System.out.print("data member should be " +
                        currentDay +
                        " but is actually " +
                        oneCalendarProblem.getDay());
                System.out.print(
                        " - accessor or mutator function is malfunctioning");
                System.out.println(" - *** FAILED ***");
            }
            System.out.println("");
        }

    }

    public static void printCalendar(CalendarProblem b) {
        System.out.println("");

        if (b == null) {
            System.out.println("CalendarProblem object reference is null !! ");
            return;
        }

        String className = b.getClass().getName();

        System.out.println(className + ".year = " +
                b.getYear());
        System.out.println(className + ".month = " +
                b.getMonth());
        System.out.println(className + ".day = " +
                b.getDay());
        System.out.println(className + ".milliseconds = " +
                b.getMil());

    }
}
