public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double r = Math.random();
        //Here, we cast the double to int
        //because Java automatically converted the int to double
        //in the first step
        int t = (int) (r * N);
        System.out.println(t);
    }
}
