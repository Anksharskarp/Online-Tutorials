public class PQarray1 {
    public static void main(String[] args) {
        int[] a = new int[6];
        int[] b = new int[a.length];

        b = a;
        for (int i = 1; i < b.length; i++) 
            b[i] = i;

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        /* Bugs to avoid with arrays:
        1. Array index out of bounds.
        2. Uninitialized array. Make sure to initialize:
            double[] a = new double[10];
            int[] b = new int[100];
        3. Undeclared variable. Reference above for complete
           declaration!
        */
    }
}
