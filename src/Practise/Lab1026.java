package Practise;

import java.util.Scanner;

public class Lab1026 {
    public static void main(String[] args) {
        // Take user input and check if number id even or odd.

        // Logic Building - Ready
        // 1. Figure out the inputs &  // 2. Data type
        //  Data type  - . int
        // How to take input in the Java? - Scanner - class -
        // nextInt() -> input


        // 3. Do we need conversion or direclty
        // 4. Rough logic - num%2==0 even,odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)

        Scanner sc = new Scanner(System.in); // obect of the scanner Class - OOPs
        System.out.println("Enter the num 1");
        int user_input_1 = sc.nextInt();

        System.out.println(user_input_1);

        System.out.println("Enter the num 2");
        int user_input_2 = sc.nextInt();

        System.out.println(user_input_2);

        if(user_input_1%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        if(user_input_2%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }


        // Max number in two inputs
        Scanner sc_1 = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the num 2");
        int num2 = sc.nextInt();

//        System.out.println(Math.max(num1,num2));

        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("Equal");
        }


    }
}