package Arrays;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {//arrays are non primitive data types so new keyword is used
        int age= 30;
        int physics= 98;
        int maths=99;
        int science=97;
        int english=95;

        int[] marks= new int[4];
        marks[0]=98;
        marks[1]=99;
        marks[2]=97;
        marks[3]=95;
        //**System.out.println(marks[0]);
        /*This is how data is stored in arrays and can be accessed through square brackets.
        java is always initialise with null or 0 value.
        Boolean is initialise with by default = 0*/


        //LENGTH- This is a property of arrays and not the function so it is directly called.
        //**System.out.println(marks.length); // output is 4 because the number of sbjs is 4.
        //SORT- used to arrange the data in ascending order.
        System.out.println(marks[0]);
        Arrays.sort(marks);//package is required to import.
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);












    }
}
