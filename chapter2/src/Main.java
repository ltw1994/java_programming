import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double M, F, I ;
        Scanner scan = new Scanner(System.in);
        M = scan.nextDouble() ;

        I = M / 39.3701 ;
        F = 12 * I ;


        System.out.printf("%.0f\n", F);
        System.out.printf("%.0f\n", I);

    }
}