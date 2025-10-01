package Practise;

public class Lab1032 {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode  = 003;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is Mechinal Gadget!");
                break;
            default:
                System.out.println("None");

        }
         // Multiple Condition in the same is also Supported.
         // Answer : 1,2,3 = It is Electronic Gadget!
         // 4,5,7 = "It is Mechanical Gadget

        int itemCode = 001;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
          // After Java 17 We can use '->' instead of "Break" Function

        char code = 'B';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;//// return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);

    }
}