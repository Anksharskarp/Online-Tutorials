package com.java21days.Day2;

public class Investor {
    public static void main(String[] arguments) {
        double investment = 14000;
        //This program calculates the investment value after three years
        //First year
        double yearOne = investment * (1 + 0.40);
        System.out.println("After one year, the value is: " + yearOne);
        //Second year
        double yearTwo = yearOne - 1500;
        System.out.println("After two years, the value is " + yearTwo);
        //Third year
        double yearThree = yearTwo * (1 + 0.12);
        System.out.println("After three years, the total value of the investment is: " + yearThree);
    }
}