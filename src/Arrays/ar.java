package Arrays;

public class ar {
    public static void main(String[] args)
    {
        int[] ai;
        ai = new int[]{1, 2, 3, 4, 5};
        int[] aic = ai;
        aic[2] = -9;
        System.out.println("aic[2]");
        System.out.println("ai[2]");
        aic = ai.clone();
        aic[1] = -15;
        System.out.println("aic[1]");
        System.out.println("ai[1]" );

    }
}

