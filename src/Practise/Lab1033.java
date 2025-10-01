package Practise;

import java.util.Scanner;

public class Lab1033 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);


        sc.close();

        int a = 11;
        switch (-1) {
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("20");
                break;
            case 9:
                System.out.println("10");
                break;
        }

        // Program to Check
        // if a Number is Positive
        // , Negative,
        // or Zero.


        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter yur number!");
        int num = sc2.nextInt();


        if(num> 0 ){
            System.out.println("Positive Number");
        }else if( num < 0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }

    }
}