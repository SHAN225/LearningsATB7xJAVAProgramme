package Practise;

public class Lab1020 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP

        String name2 = new String("The Testing Academy"); // Heap area (OA)

//        System.out.println(name == name1); // Check for the Ref
//        System.out.println(name.equals(name1)); // Check for the Content


        System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name1.equals(name2)); // Check for the Content

       // Pramod Lab074
       // Important Interview Question
       // == - Reference
       // .equals = Content

    }
}
