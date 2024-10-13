package july.ex_20072024Conditionsandloops;

import java.util.Scanner;

public class Lab021Switch {
    public static void main(String[] args) {
  // Take user input as char and tell the user if it is a vowel
  // aeiou

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input) {
            case 'a' :
                System.out.println("vowel");
                break;
            case 'e' :
                System.out.println("vowel");
                break;
            case 'i' :
                System.out.println("vowel");
                break;
            case 'o' :
                System.out.println("vowel");
                break;
            case 'u' :
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel, it is Consonant");
        }

        switch (user_input) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("vowel");
                break;
                default:
                    System.out.println("Not a vowel,is Consonant");
        }

        // Same function by using If Else

        char ch = 'a';
        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonet");
        }

    }
}
