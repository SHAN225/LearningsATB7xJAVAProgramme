package ex_20072024Conditionsandloops;

public class Lab022Yield {
    public static void main(String[] args) {

        char code = 'B';
        int val = switch (code){
            case 'A' :
                yield 70;
            case 'B':
                yield 50;
            default :
                throw new IllegalStateException("Unexpected value: " + code);

        // Yield means return in future

        };
        System.out.println(val);
    }
}
