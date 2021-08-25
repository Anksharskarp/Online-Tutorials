public class Factors {
    //Steps to debug program
    /*
    1. Compile the program, and get any 'obvious' errors.
    2. Repeat until there aren't any more compiler errors.
    3. Syntax errors should be gone now.
    4. Use a flowchart to look for any faulty steps in the program.
    5. Make sure your program works for lots of test cases.
    6. If you have a variable, print out the values as the loop
       goes on, so you can see how its value changes.
    7. DON'T FORGET TO RECOMPILE AFTER FIXING! May programmers made this 
       mistake, and ended up fixing mistakes that they already fixed!
    */

    //POOR PERFORMANCE! If we give this program big integers, then it could break.
    /*
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            if (n > 1) System.out.println(n);
            else       System.out.println();
        }
    }
    */

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            if (n > 1) System.out.println(n);
            else       System.out.println();
        }
    }

    //Four Step process:
    /*
    EDIT
    COMPILE
    RUN
    TEST (On realistic and real input data)
    SUBMIT (For independent testing and approval)
    */
}
