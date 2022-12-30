package Programming;
import java.util.Scanner;
public class Takinginput {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int i;
        String s;
        System.out.println("Insert the Roll number please");
        i= sc1.nextInt();

        System.out.println("Insert the name please");
        s= sc1.next();
        System.out.println(i);
        System.out.println(s);


    }
}
