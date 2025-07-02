package Practise;

//SCP - String Constant Pool
public class Lab1019SCP {
    public static void main(String[] args) {
       String s1 = "SHANTANU";
       String s2 = s1;
       System.out.println(s2);
       String s3 = s2.toLowerCase();
       System.out.println(s3);
       System.out.println(s1);

       // There are 2 SCP  1.SHANTANU 2.shantanu

        String name = "Pramod"; // Assignment Operators
        String name2 = new String("Pramod"); // New Operator

        // Both of them, actually save the name, name2 in different ways JVM
        // How they store the values in the JVM?

        // SCP nad Heap - JVM

        String s4 = new String("Pramod");
        String s5 = new String("Pramod");
        //  2, Heap area
        String s6  = s4; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Pramod

    }
}
