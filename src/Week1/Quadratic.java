package Week1;

public class Quadratic {
    public static void main(String[] args) {
        //Parse coefficents from command line
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        //Calculate roots
        double discriminant = b * b - 4.0 * c;
        double d = Math.sqrt(discriminant);
        //We divide by 2.0 to make sure it is interpreted as a double
        double root1 = (-b + d) / 2.0;
        double root2 = (-b - d) / 2.0;

        //Print them out
        System.out.println(root1);
        System.out.println(root2);
    }
}