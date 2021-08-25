public class Exchange {
    public static void main(String[] args) {
        int x = 1234;
        int y = 99;
        int c = x;
        x = y;
        y = c;

        /*
        To execute, type:
        java Exchange 5 2
        */
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = a;
        a = b;
        b = t;
        //Java automatically converts int values to 
        //String for output
        System.out.println(a);
        System.out.println(b);
    }
}