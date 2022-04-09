package com.java21days.Day2;

public class Weather {
    public static void main(String[] arguments) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is...");
        //This program converts Fahrenheit to Celsius
        // We begin by subtracting 32
        fah = fah - 32;
        //Next, we divide the answer by 9
        fah = fah / 9;
        //Finally, we multiply that answer by 5
        fah = fah * 5;
        System.out.println(fah + " degrees Celsius");

        float cel = 33;
        System.out.println(cel + " degrees Celsius is...");
        //This program converts Celsius to Fahrenheit
        //We begin by multiplying by 9
        cel = cel * 9;
        //Next, we divide the answer by 5
        cel = cel / 5;
        //Finally, we add 32 to that answer
        cel = cel + 32;
        System.out.println(cel + " degrees Fahrenheit");

    }
}