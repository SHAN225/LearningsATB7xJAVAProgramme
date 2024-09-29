package ex_21072024forloopandotherloops;

import java.util.Scanner;

public class Lab030Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num, we print Factorial");
        int n = sc.nextInt();

        // Factorial Function
        //1 = 1, 2 = 2*1 =2, 3 = 3*2*1= 6, 5 = 5*4*3*2*1 = 120

        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
