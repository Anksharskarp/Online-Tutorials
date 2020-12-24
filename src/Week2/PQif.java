package Week2;

public class PQif {
    //Don't forget the else clauses!
    //Be extra careful if you don't 
    //have any braces here!
    //They can help you avoid any confusion.
    public static void main(String[] args) {
        double income = Double.parseDouble(args[0]);
        double rate = 0.35;
        if (income < 47450) rate = 0.22;
        else if (income < 114650) rate = 0.25;
        else if (income < 174700) rate = 0.28;
        else if (income < 311950) rate = 0.33;
        System.out.println(rate);
    }
}
