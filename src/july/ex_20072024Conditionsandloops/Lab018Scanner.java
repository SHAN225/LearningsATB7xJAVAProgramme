package july.ex_20072024Conditionsandloops;

import java.util.Scanner;

public class Lab018Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println("Goa");
        } else if (age < 18) {
            System.out.println("School");
        }
    }
}
