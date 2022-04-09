package com.java21days.Day1;

class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;

        System.out.println("\nSpirit: ");
        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot opportunity = new MarsRobot();
        System.out.println("\nOpportunity: ");
        opportunity.status = "analyzing";
        opportunity.speed = 0;
        opportunity.temperature = -65;

        opportunity.showAttributes();

    }
}