package Practise;
import java.lang.Math;

public class Lab1024 {
    public static void main(String[] args) {
        // We find Max between two numbers
        int a= 10;
        int b= 20;
        int max = a > b ? a:b;
        int min = a < b ? a:b;
        System.out.println(max);
        System.out.println(min);

        double sq = Math.sqrt(2);
        int result = Math.max(10,23);
        System.out.println(sq);
        System.out.println(result);

        double sq2 = Math.sqrt(5);
        int result2 = Math.max(20,50);
        int result3 = Math.min(30,60);
        System.out.println(sq2);
        System.out.println(result2);
        System.out.println(result3);
    }
}
