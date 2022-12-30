package Programming;

import java.util.Scanner;
public class LAB_MST_1_Q1 {

    static class Factorial
    {
        public static void main(String[] args)
        {
            System.out.println("Name:Chaitanya Srivastava , UID:21BCS9547");
            int n, c, f = 1;

            System.out.println("Enter an integer to calculate its factorial");
            Scanner in = new Scanner(System.in);

            n = in.nextInt();

            if (n < 0)
                System.out.println("Number should be non-negative.");
            else
            {
                for (c = 1; c <= n; c++)
                    f = f*c;

                System.out.println("Factorial of "+n+" is = "+f);
            }
        }
    }
}
