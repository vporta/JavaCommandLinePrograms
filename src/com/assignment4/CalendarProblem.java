/**
 * CalendarProblem.java is a program that displays the current year, month, and day.
 * Sets the value to 1234567898765L and displays the year, month, and day.
 * Created on March 07 2018 by Vincent Porta
 */

package com.assignment4;

import java.util.Calendar;

public class CalendarProblem {

    private int year = 1;
    private int month = 1;
    private int day = 1;
    private long milliseconds = 1234567898765L;
    private String errorMessage = "";

    public CalendarProblem() {

    }

    public CalendarProblem(long _milliseconds) throws Exception {
        setMil(_milliseconds);
    }

    public CalendarProblem(int _year, int _month, int _day) throws Exception {
        setYear(_year);
        setMonth(_month);
        setDay(_day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public long getMil() {
        return milliseconds;
    }

    public void setMil(long _milliseconds) throws Exception {
        if (!isValidMil(_milliseconds)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        milliseconds = _milliseconds;
    }

    public void setYear(int _year) throws Exception {
        if (!isValidYear(_year)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        year = _year;
    }

    public void setMonth(int _month) throws Exception {
        if (!isValidMonth(_month)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        month = _month;
    }

    public void setDay(int _day) throws Exception {
        if (!isValidDay(_day)) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        day = _day;
    }

    public boolean isValidMil(long _milliseconds) {
        if (_milliseconds == 1234567898765L) {
            return true;
        }

        errorMessage = "Invalid number milliseconds: " + _milliseconds + " needs to be 1234567898765L";
        return false;
    }

    public boolean isValidYear(int _year) {
        if (_year > 0) {
            return true;
        }

        errorMessage = "Invalid number year: " + _year + " needs to be > 0";
        return false;
    }

    public boolean isValidMonth(int _month) {
        if (_month >= 0 && _month <= 12) {
            return true;
        }

        errorMessage = "Invalid number month: " + _month + " needs to be  >= 0 && <=12";
        return false;
    }

    public boolean isValidDay(int _day) {
        if (_day >= 1 && _day <= 31) {
            return true;
        }

        errorMessage = "Invalid number day: " + _day + " needs to be  >= 1 && <= 31";
        return false;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean equals(Object o) {

        if (o == null) return false;

        String s = o.getClass().getName();
        if (!s.equals("assignment4.CalendarProblem")) return false;

        return true;

    }

    public Calendar getCal2(long milliseconds) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(milliseconds);
        return cal;
    }

    public void print() {
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println("milliseconds = " + milliseconds);
        System.out.println("Specified elapsed time in milliseconds with value " + milliseconds + " " +
                "since January 1, 1970. Year:" + getCal2(milliseconds).get(Calendar.YEAR) + " Month: " + getCal2(milliseconds).get(Calendar.MONTH)
                + " Day: " + getCal2(milliseconds).get(Calendar.DAY_OF_WEEK));

    }

}


