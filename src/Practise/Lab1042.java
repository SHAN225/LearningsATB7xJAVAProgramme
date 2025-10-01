package Practise;

//Imp Interview Question

public class Lab1042 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) { // i = 0 to 50, times  = 51
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println("Odd -> " + i);
        }

        for (int i = 1; i <= 30; i++) { // i = 1 to 100, times = 100
            System.out.println(i);

        }
    }
}