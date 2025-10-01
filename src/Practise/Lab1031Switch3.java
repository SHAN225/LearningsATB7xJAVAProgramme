package Practise;

import java.util.Scanner;

public class Lab1031Switch3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character, I will tell you it is Char or Vowel");
        char user_input = sc.next().charAt(0);
        System.out.println("user_input");

        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

        }

        switch (user_input){
            case 'a','i','o','u','e':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

        }
    }
}