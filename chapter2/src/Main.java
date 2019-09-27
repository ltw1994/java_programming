import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double N, result;

        Scanner scan = new Scanner(System.in);
        N = scan.nextDouble() ;
        result = 0 ;
        for(int i = 0 ; i < 6 ; i++) {
            result = (N * (1 + 0.00417));
            N = result + 100  ;
        }

        result *= 10 ;
        result =  Math.floor(result) ;
        result /= 10.0 ;
        System.out.println(result);

    }

}