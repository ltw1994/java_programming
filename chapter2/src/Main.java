import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, r1, r2, d;

        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble() ;
        b = scan.nextDouble() ;
        c = scan.nextDouble() ;

        d = Math.pow(b,2) - 4 * a * c ;
        r1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a) ;
        r2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a) ;

        r1 *= 10 ;
        r1 =  Math.floor(r1) ;
        r1 /= 10.0 ;

        r2 *= 10 ;
        r2 =  Math.floor(r2) ;
        r2 /= 10.0 ;

        if (d < 0) {
            System.out.println("complex");
        }
        else if (r1 >= r2) {
            System.out.println(r1);
        }
        else {
            System.out.println(r2);
        }

    }

}