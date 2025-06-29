package Practise;

public class Lab1009 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        boolean c = (10 >= 10); // 10 > 10 or 10 = 10
        // OR GATE
        System.out.println(c);

        // == Compare true values
        System.out.println( 10 == 10);
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10
        System.out.println( 10 <= 10); // 10 < 10 or 10 = 10
        System.out.println( 10 > 10);
        System.out.println( 10 < 10);

        boolean d = true;
        System.out.println(!d);         // Not(!) - Use of Reverse Calculation
        System.out.println(!(10>20));
        System.out.println(!!!!(30>90));
        //  System.out.println((30>90)!);
        // 30>90 = False, Then 4 times Reversal then it come up 'False'
        // Final(d) = False.True = True ; !d = False

    }
}