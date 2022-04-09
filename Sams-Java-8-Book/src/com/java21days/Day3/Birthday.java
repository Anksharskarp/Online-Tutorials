package com.java21days.Day3;

class Birthday {
    public static void main(String[] arguments) {
        String birthday = "07/14/2003";
        String month = birthday.substring(0, 2);
        String day = birthday.substring(3, 5);
        String year = birthday.substring(6, 10);
        System.out.println("Birthday: " + birthday);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
    }
}