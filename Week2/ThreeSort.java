public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        //Makes a smaller than b
        if (b < a) {
            int t = a;
            a = b;
            b = t;
        }
        //Makes a smaller than both b and c
        if (c < a) {
            int t = a; 
            a = c;
            c = t;
        }
        //Makes b smaller than c
        if (c < b) {
            int t = b;
            b = c;
            c = t;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
