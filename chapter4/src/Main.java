import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                String c1, c2, c3, s ;
                String s1, s2, s3, tmp ;
                int l1, l2, l3, l ;
                s1 = "" ;
                s2 = "" ;
                s3 = "" ;
                int i, j ;


                Scanner scan = new Scanner(System.in);
                c1 = scan.nextLine() ;
                c2 = scan.nextLine() ;
                c3 = scan.nextLine() ;

                l1 = c1.length() ;
                l2 = c2.length() ;
                l3 = c3.length() ;
                l = Math.max(l1, l2) ;
                l = Math.max(l, l3) ;


                for(i = 0 ; i < l ; i++){
                        if(c1.charAt(i) < c2.charAt(i)){
                                s1 = c1 ;
                                s2 = c2 ;
                                break;
                        }
                        else if(c1.charAt(i) > c2.charAt(i)){
                                s1 = c2;
                                s2 = c1;
                                break;
                        }
                }
                //System.out.println(s1 + " " + s2 + " " + s3); ;

                for(i = 0 ; i < l ; i++){
                        if(s2.charAt(i) < c3.charAt(i)){
                                s3 = c3;
                                break;
                        }
                        else if(s2.charAt(i) > c3.charAt(i)) {
                                tmp = s2 ;
                                s2 = c3 ;
                                s3 = tmp ;
                                break ;
                        }
                }
                //System.out.println(s1 + " " + s2 + " " + s3); ;

                for(i = 0 ; i < l ; i++){
                        if(s1.charAt(i) < s2.charAt(i)){
                                break;
                        }
                        else if(s1.charAt(i) > s2.charAt(i)) {
                                tmp = s1 ;
                                s1 = s2 ;
                                s2 = tmp ;
                                break ;
                        }
                }

                System.out.println(s1 + " " + s2 + " " + s3); ;



        }
}