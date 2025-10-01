package Practise;

import java.util.Scanner;

//Interview Question

public class Lab1034 {
    public static void main(String[] args) {
        //Program to Find the Largest Among Three Numbers:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the Num 2");
        int num2 = sc.nextInt();
        System.out.println("Enter the Num 3");
        int num3 = sc.nextInt();


        // num 1 > num2 && num1 > num3 ->  num1
        // num 2 > num1 && num2 > num3 ->  num2
        // num 3

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        // Vowels Example

        char ch = 'a';
        if ( ch == 'a' || ch == 'e' || ch =='o' || ch == 'i' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }

        char ch2 = 'h';
        if ( ch == 'a' || ch == 'e' || ch =='o' || ch == 'i' || ch == 'u') {
            System.out.println("Vowel");
        } else;{
            System.out.println("Consonant");
        }


    }
}