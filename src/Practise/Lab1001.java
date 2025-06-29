package Practise;

public class Lab1001 {
    public static void main(String[] args) {
        // Formatting
        int age = 98;
        System.out.println("You age is -> " + age);
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
        System.out.printf("You age is -> %d",age);

        int A123 = 100;
        System.out.println(A123);

        int a = 10;
        int b = 20;
        String s1 = "Shan";
        System.out.println(a+b+s1);
        System.out.println(s1+a);
        System.out.println(s1+b);
        System.out.println(a+b+s1+b+s1+a+b);
    }
}
