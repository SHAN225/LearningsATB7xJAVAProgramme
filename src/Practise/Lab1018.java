package Practise;

public class Lab1018 {
    public static void main(String[] args) {
        String name = "Shantanu";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Shantanu");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(7)); // Exception Index 10 out of bounds

        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";
        String str4= str1.concat(str2); // Hello Guys
        // SCAP -  4


    }
}