package KRISHNA;
import java.util.Scanner;
class subject
{
    int max= 80;
     int obtd;
}
public class rough
{
    public static void main(String[] args) {

        subject s1 = new subject();
        System.out.println("Enter maths marks");
        Scanner scn = new Scanner(System.in);
        s1.obtd = scn.nextInt();
        subject s2 = new subject();
        System.out.println("Enter english marks");
        s2.obtd = scn.nextInt();
        subject s3 = new subject();
        System.out.println("Enter science marks");
        s3.obtd = scn.nextInt();
        subject s4 = new subject();
        System.out.println("Enter social science marks");
        s4.obtd = scn.nextInt();
        subject s5 = new subject();
        System.out.println("Enter hindi marks");
        s5.obtd = scn.nextInt();
        int obtd= (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
        System.out.println(obtd);
        double per= (obtd/400d *100);
        System.out.println("Percentage obtained "+per);
    }
}