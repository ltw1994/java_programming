import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, x4, y4;
        double x, y;
        double lcm_num ;
        double a, b, c, d, e, f, P ;


        Scanner scan = new Scanner(System.in);
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        x3 = scan.nextDouble();
        y3 = scan.nextDouble();
        x4 = scan.nextDouble();
        y4 = scan.nextDouble();

        a = x1 - x2 ;
        b = y1 - y2 ;
        c = x3 - x4 ;
        d = y3 - y4 ;
        e = a * y1 + b * x1 ;
        P =

        if ((x2 - x1) / (y2 - y1) == (x4 - x3) / (y4 - y3)) {
            System.out.println("parallel");
        }

        lcm_num = lcm(a, c) ;

        b *= lcm_num / a ;

        d *= lcm_num / c ;

    }


    private static double gcd(double num1, double num2) {

        while (num2 > 0) {
            double temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }

    private static double lcm(double num1, double num2) {

        return (num1 * num2) / gcd(num1, num2);
    }
}