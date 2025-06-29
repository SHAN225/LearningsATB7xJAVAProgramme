package Practise;

public class Lab1013Casting2 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicti Narrowing - JVM
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss
        System.out.println(total_price);

        float total_price2 = course+GST;  // Perfect matching because Float is greater than Integer
        System.out.println(total_price2); //Widening Casting

    }
}