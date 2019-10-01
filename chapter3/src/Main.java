import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h, q, m, j, k, y;

        Scanner scan = new Scanner(System.in);
        y = scan.nextInt();
        m = scan.nextInt();
        q = scan.nextInt();

        if (m == 1) {
            m = 13;
            y -= 1;
        } else if (m==2) {
            m = 14;
            y -= -1;
        }

        j = y / 100;
        k = y % 100;

        h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;

        if (h == 0) {
            System.out.println("Saturday");
        } else if (h == 1) {
            System.out.println("Sunday");
        } else if (h == 2) {
            System.out.println("Monday");
        } else if (h == 3) {
            System.out.println("Tuesday");
        } else if (h == 4) {
            System.out.println("Wednesday");
        } else if (h == 5) {
            System.out.println("Thursday");
        } else if (h == 6) {
            System.out.println("Friday");
        }
    }
}